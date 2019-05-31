package offsetgeneration;

import ast.Program;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
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
import ast.statements.StatementAssignment;
import ast.statements.StatementIf;
import ast.statements.StatementInput;
import ast.statements.StatementPrint;
import ast.statements.StatementReturn;
import ast.statements.StatementWhile;
import ast.types.ErrorType;
import ast.types.Field;
import ast.types.TypeArray;
import ast.types.TypeChar;
import ast.types.TypeDouble;
import ast.types.TypeFunction;
import ast.types.TypeInt;
import ast.types.TypeRecord;
import ast.types.TypeVoid;
import sintactic.Visitor;

public class AbstractCGVisitor implements Visitor {
	
	/*
	 * Execute --> Sentences, Program, Definition
	 * Value --> Expresiones
	 * Address --> LValue
	 */

	protected CodeGenerator cg;
	
	public AbstractCGVisitor(CodeGenerator cg) {
		this.cg = cg;
	}

	@Override
	public Object visit(Program v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para " + this.getClass().getName());
	}

	@Override
	public Object visit(VarDefinition v, Object p) {
		//throw new IllegalStateException ("Plantilla de generación de código no definida para " + this.getClass().getName());
		return null;
	}

	@Override
	public Object visit(FuncDefinition v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionArithmetic v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionAccessArray v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionAccessField v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionCast v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionChar v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionComparison v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionFunctionInvocation v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionInt v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionLogic v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionNegation v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionReal v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ExpressionUnary v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(Identifier v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(StatementAssignment v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(StatementIf v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(StatementInput v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(StatementReturn v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(StatementWhile v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(StatementPrint v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(TypeArray v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(TypeChar v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(TypeDouble v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(TypeFunction v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(TypeInt v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(TypeRecord v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(TypeVoid v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(ErrorType v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

	@Override
	public Object visit(Field v, Object p) {
		throw new IllegalStateException ("Plantilla de generación de código no definida para" + this.getClass().getName());
	}

}
