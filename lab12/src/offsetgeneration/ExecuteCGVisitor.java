package offsetgeneration;

import java.util.List;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.ExpressionFunctionInvocation;
import ast.statements.Statement;
import ast.statements.StatementAssignment;
import ast.statements.StatementIf;
import ast.statements.StatementInput;
import ast.statements.StatementPrint;
import ast.statements.StatementReturn;
import ast.statements.StatementWhile;
import ast.types.Type;
import ast.types.TypeFunction;
import ast.types.TypeVoid;

public class ExecuteCGVisitor extends AbstractCGVisitor {
	
	private ValueCGVisitor vCG;
	
	private AddressCGVisitor aCG;

	public ExecuteCGVisitor(CodeGenerator cg) {
		super(cg);
		this.vCG = new ValueCGVisitor(cg);
		this.aCG = new AddressCGVisitor(cg, this.vCG);
	}
	
	@Override
	public Object visit(Program v, Object p) {
		this.cg.source(this.cg.getInputFile());
		
		for(Definition def: v.getListDefinitions()) {
			if(def instanceof VarDefinition) {
				def.accept(this, p);
				this.cg.commentDefinition(def);
			}
		}
		
		this.cg.commentWhite();
		this.cg.commentMain ();
		this.cg.call("main");
		this.cg.halt();
		this.cg.commentWhite();
		for(Definition def: v.getListDefinitions()) {
			if(def instanceof FuncDefinition) {
				this.cg.commentLine(def.getLine());
				this.cg.commentWhite();
				def.accept(this, def); //Aqui
			}
		}
		
		return null;
	}

	@Override
	public Object visit(FuncDefinition v, Object p) {
		this.cg.label(v.getName());
		
		//--------------
		//Comentarios
		
		
		//Comentarios de los parámetros
		this.cg.comment("Parameters");
		List<VarDefinition> listParameters = ((TypeFunction)v.getType()).getListVariable();
		for(VarDefinition var: listParameters) {
			this.cg.commentDefinition(var);
		}
		
		//Comentarios de las variables locales
		this.cg.comment("Local variables");
		for(Statement sta: v.getStatements()) {
			if(sta instanceof VarDefinition) {
				this.cg.commentDefinition((VarDefinition)sta);
			}
		}
		
		//--------------
		
		this.cg.enter(v.localBytes());
		for(Statement sta: v.getStatements()) {
			if(!(sta instanceof VarDefinition)) {
				this.cg.commentLine (sta.getLine());
				sta.accept(this, v);
			}
		}
		Type typeReturn = ((TypeFunction)v.getType()).getTypeReturn();
		if(typeReturn instanceof TypeVoid) {
			this.cg.ret(0, v.localBytes() , v.paramsBytes());
		}
		return null;
	}

	@Override
	public Object visit(StatementAssignment v, Object p) {
		this.cg.comment("Assignment");
		v.getExpressionLeft().accept(this.aCG, p); //Obtienes la dirección de la expresión de la izquierda
		v.getExpressionRight().accept(this.vCG, p); //Obtienes el valor de la expresión de la derecha
		this.cg.convertTo(v.getExpressionRight().getType(), v.getExpressionLeft().getType()); //Conviertes
		this.cg.store(v.getExpressionLeft().getType()); //Cargas
		return null;
	}

	@Override
	public Object visit(StatementInput v, Object p) {
		this.cg.comment("Read");
		v.getListExpressions().accept(this.aCG, p);
		this.cg.in(v.getListExpressions().getType());
		this.cg.store(v.getListExpressions().getType());
		return null;
	}

	@Override
	public Object visit(StatementPrint v, Object p) {
		this.cg.comment("Write");
		v.getExpression().accept(this.vCG, p);
		this.cg.out(v.getExpression().getType());
		return null;
	}

	@Override
	public Object visit(StatementIf v, Object p) {
		int numberElse = this.cg.getLabel(2);
		int end = numberElse+1;
		
		this.cg.comment("If");
		this.cg.commentLine(v.getLine());
		
		v.getExpression().accept(this.vCG, p);
		this.cg.jz(numberElse);
		this.cg.comment("if body");
		for(Statement s: v.getStatementIf()) {
			this.cg.commentLine(s.getLine());
			s.accept(this, p);
		}
		this.cg.jmp(end);
		this.cg.label("label" + numberElse);
		this.cg.comment("else body");
		for(Statement s: v.getStatementElse()) {
			this.cg.commentLine(s.getLine());
			s.accept(this, p);
		}
		this.cg.label("label" + end);
		return null;
	}

	@Override
	public Object visit(StatementWhile v, Object p) {
		int cond = this.cg.getLabel(2);
		int end = cond+1;
		
		this.cg.comment("While");
		this.cg.commentLine(v.getLine());
		this.cg.label("label" + cond);
		
		v.getExpression().accept(this.vCG, p);
		
		this.cg.jz(end);
		this.cg.comment("While body");
		for(Statement s: v.getListStatement()) {
			this.cg.commentLine(s.getLine());
			s.accept(this, p);
		}
		
		this.cg.jmp(cond);
		this.cg.label("label" + end);
		
		
		return null;
	}

	@Override
	public Object visit(ExpressionFunctionInvocation v, Object p) {
		v.accept(this.vCG, p);
		
		if(!(v.getType() instanceof TypeVoid)) {
			this.cg.pop(v.getType());
		}
		
		return null;
	}

	@Override
	public Object visit(StatementReturn v, Object p) {
		this.cg.comment("Return");
		v.getExpression().accept(this.vCG, p);
		
		FuncDefinition func = (FuncDefinition) p;
		this.cg.ret(v.getExpression().getType().getSizeOfType(), func.localBytes() , func.paramsBytes());
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	

}
