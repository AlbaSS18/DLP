package sintactic;

import java.util.ArrayList;
import java.util.List;

import ast.definitions.FuncDefinition;
import ast.expressions.Expression;
import ast.expressions.ExpressionAccessArray;
import ast.expressions.ExpressionAccessField;
import ast.expressions.ExpressionArithmetic;
import ast.expressions.ExpressionCast;
import ast.expressions.ExpressionChar;
import ast.expressions.ExpressionComparison;
import ast.expressions.ExpressionFunctionInvocation;
import ast.expressions.ExpressionInt;
import ast.expressions.ExpressionLogic;
import ast.expressions.ExpressionNegation;
import ast.expressions.ExpressionReal;
import ast.expressions.ExpressionUnary;
import ast.expressions.Identifier;
import ast.statements.Statement;
import ast.statements.StatementAssignment;
import ast.statements.StatementIf;
import ast.statements.StatementInput;
import ast.statements.StatementPrint;
import ast.statements.StatementReturn;
import ast.statements.StatementWhile;
import ast.types.ErrorType;
import ast.types.Type;
import ast.types.TypeChar;
import ast.types.TypeDouble;
import ast.types.TypeFunction;
import ast.types.TypeInt;

public class TypeCheckingVisitor extends AbstractVisitor {

	@Override
	public Object visit(StatementIf v, Object p) {
		v.getExpression().accept(this, p);
		if(!v.getExpression().getType().isLogical()) {
			v.getExpression().setType(new ErrorType(v.getExpression().getLine(), v.getExpression().getColumn(), "Condición inválida " + v.getExpression()));
		}
		for(Statement s: v.getStatementIf()) {
			s.accept(this, p);
		}
		for(Statement s: v.getStatementElse()) {
			s.accept(this, p);
		}
		return null;
	}

	@Override
	public Object visit(StatementWhile v, Object p) {
		v.getExpression().accept(this, p);
		if(!v.getExpression().getType().isLogical()) {
			v.getExpression().setType(new ErrorType(v.getExpression().getLine(), v.getExpression().getColumn(), "Condición inválida " + v.getExpression()));
		}
		for(Statement s: v.getListStatement()) {
			s.accept(this, p);
		}
		return null;
	}

	@Override
	public Object visit(Identifier v, Object p) {
		v.setType(v.getDefinition().getType());
		if(v.getDefinition() == null) {
			return new ErrorType(v.getLine(), v.getColumn(), "El nombre de la variable no existe");
		}
		return null;
	}

	@Override
	public Object visit(ExpressionChar v, Object p) {
		v.setType(TypeChar.getInstance());
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionInt v, Object p) {
		v.setType(TypeInt.getInstance());
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionReal v, Object p) {
		v.setType(TypeDouble.getInstance());
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionArithmetic v, Object p) {
		v.getExprLeft().accept(this, p);
		v.getExprRight().accept(this, p);
		v.setType(v.getExprLeft().getType().arithmetic(v.getExprRight().getType()));
		if(v.getType() == null) {
			v.setType(new ErrorType(v.getLine(), v.getColumn(), "No se puede realizar la operación aritmética " + v.getOperator() + " con el operando " + v.getExprLeft() + " y con el operando" + v.getExprRight()));
		}
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionFunctionInvocation v, Object p) {
		v.getIdent().accept(this, p);
		List<Type> listType = new ArrayList<Type>();
		for(Expression ex: v.getParam()) {
			ex.accept(this, p);
			listType.add(ex.getType());
		}
		
		v.setType(v.getIdent().getType().parenthesis(listType,v));
		if(v.getType() == null) {
			v.setType(new ErrorType(v.getLine(), v.getColumn(), "No se ha podido invocar a la función " + v.toString()));
		}
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(StatementAssignment v, Object p) {
		v.getExpressionLeft().accept(this, p);
		v.getExpressionRight().accept(this, p);
		if(!v.getExpressionLeft().getLValue()) {
			return new ErrorType(v.getLine(),v.getColumn(), "Se esperaba un LValue");
		}
		
		v.getExpressionLeft().setType(v.getExpressionRight().getType().promotesTo(v.getExpressionLeft().getType()));
		
		if(v.getExpressionLeft().getType() == null) {
			v.getExpressionLeft().setType(new ErrorType(v.getLine(), v.getColumn(), "No se ha podido realizar la asignación " + v.getExpressionLeft() + ":" + v.getExpressionRight()));
		}
		
		return null;
	}

	@Override
	public Object visit(ExpressionCast v, Object p) {
		v.getExpression().accept(this, p);
		v.getTypeCast().accept(this, p);
		
		v.setType(v.getExpression().getType().canBeCast(v.getTypeCast()));
		if(v.getExpression().getType() == null) {
			v.getExpression().setType(new ErrorType(v.getLine(), v.getColumn(), "No es posible realizar el casteo de " + v.getExpression() + " a " + v.getTypeCast()));
		}
		
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionAccessField v, Object p) {
		v.getExpression().accept(this, p);
		
		v.setType(v.getExpression().getType().dot(v.getId()));
		
		if(v.getType() == null) {
			v.setType(new ErrorType(v.getLine(), v.getColumn(), "No es posible acceder al campo " + v.getId()));
		}
		
		v.setLValue(true);
		return null;
	}

	@Override
	public Object visit(ExpressionAccessArray v, Object p) {
		v.getLeft().accept(this, p);
		v.getRight().accept(this, p);
		
		v.setType(v.getLeft().getType().squareBrackets(v.getRight().getType()));
		if(v.getType() == null) {
			v.setType(new ErrorType(v.getLine(), v.getColumn(), "No es posible acceder al array " + v.getLeft() + " con índice " + v.getRight()));
		}
		
		
		v.setLValue(true);
		return null;
	}

	@Override
	public Object visit(ExpressionNegation v, Object p) {
		v.getExpression().accept(this, p);
		
		v.setType(v.getExpression().getType().logical());
		if(v.getType() == null) {
			v.setType(new ErrorType(v.getLine(), v.getColumn(), "Se esperaba un tipo int, double o char " + v.toString()));
		}
		
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionLogic v, Object p) {
		v.getExpreLeft().accept(this, p);
		v.getExpreRight().accept(this, p);
		
		v.setType(v.getExpreLeft().getType().logical(v.getExpreRight().getType()));
		if(v.getType() == null) {
			String mensajeError = "Se esperaban tipos iguales en " + v.getExpreLeft() + " "  + v.getOperator() + " " + v.getExpreRight();
			v.setType(new ErrorType(v.getLine(), v.getColumn(), mensajeError));
		}
		
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionComparison v, Object p) {
		v.getExpreLeft().accept(this, p);
		v.getExpreRight().accept(this, p);
		
		v.setType(v.getExpreLeft().getType().comparison(v.getExpreRight().getType()));
		if(v.getType() == null) {
			v.setType(new ErrorType(v.getLine(), v.getColumn(), "Los tipos no son iguales " + v.getExpreLeft() + " " + v.getOperator() + " " + v.getExpreRight()));
		}
		
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionUnary v, Object p) {
		v.getExpression().accept(this, p);
		
		v.setType(v.getExpression().getType().arithmetic());
		if(v.getType() == null) {
			v.setType(new ErrorType(v.getLine(), v.getColumn(), "Se esperaba un tipo int, double o char " + v.toString()));
		}
		
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(StatementInput v, Object p) {
		v.getListExpressions().accept(this, p);
		if(!v.getListExpressions().getLValue()) {
			return new ErrorType(v.getLine(), v.getColumn(), "Se esperaba un LValue");
		}
		if(!v.getListExpressions().getType().isBuildIntType()) {
			v.getListExpressions().setType(new ErrorType(v.getLine(), v.getColumn(), "Se esperaba un tipo simple int,double o char"));
		}
		
		
		return null;
	}

	@Override
	public Object visit(StatementPrint v, Object p) {
		v.getExpression().accept(this, p);
		if(!v.getExpression().getType().isBuildIntType()) {
			v.getExpression().setType(new ErrorType(v.getLine(), v.getColumn(), "Se esperaba un tipo simple int,double o char"));
		}
		
		return null;
	}

	@Override
	public Object visit(StatementReturn v, Object p) {
		v.getExpression().accept(this, p);
		
		TypeFunction type = (TypeFunction) p;
		v.getExpression().setType(v.getExpression().getType().promotesTo(type.getTypeReturn()));
		
		if(v.getExpression().getType() == null) {
			v.getExpression().setType(new ErrorType(v.getLine(), v.getColumn(), "El tipo de la función no es compatible con el tipo retorno"));
		}
		return null;
	}

	@Override
	public Object visit(FuncDefinition v, Object p) {
		v.getType().accept(this, p);
		for(Statement st: v.getStatements()) {
			st.accept(this, v.getType());
		}
		return null;
	}	
	
	
	
}
