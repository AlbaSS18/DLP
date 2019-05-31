package sintactic;

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
import ast.statements.StatementAssignment;
import ast.statements.StatementInput;
import ast.types.ErrorType;

public class LValueVisitor extends AbstractVisitor{
	
	// LValue --> Si la expresión puede estar o no a la izquierda de la asignación (análisis semántico).

	@Override
	public Object visit(StatementAssignment v, Object p) {
		v.getExpressionLeft().accept(this, p);
		v.getExpressionRight().accept(this, p);
		if(!v.getExpressionLeft().getLValue()) {
			return new ErrorType(v.getLine(),v.getColumn(), "Se esperaba un LValue");
		}
		return null;
	}
	
	@Override
	public Object visit(StatementInput v, Object p) {
		v.getListExpressions().accept(this, p);
		if(!v.getListExpressions().getLValue()) {
			return new ErrorType(v.getLine(), v.getColumn(), "Se esperaba un LValue");
		}
		return null;
	}
	
	@Override
	public Object visit(Identifier v, Object p) {
		v.setLValue(true);
		return null;
	}
	
	@Override
	public Object visit(ExpressionArithmetic v, Object p) {
		v.getExprLeft().accept(this, p);
		v.getExprRight().accept(this, p);
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionAccessArray v, Object p) {
		v.getLeft().accept(this, p);
		v.getRight().accept(this, p);
		v.setLValue(true);
		return null;
	}

	@Override
	public Object visit(ExpressionAccessField v, Object p) {
		v.getExpression().accept(this, p);
		v.setLValue(true);
		return null;
	}

	@Override
	public Object visit(ExpressionCast v, Object p) {
		v.getExpression().accept(this, p);
		v.getTypeCast().accept(this, p);
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionChar v, Object p) {
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionComparison v, Object p) {
		v.getExpreLeft().accept(this, p);
		v.getExpreRight().accept(this, p);
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionFunctionInvocation v, Object p) {
		for(Expression ex: v.getParam()) {
			ex.accept(this, p);
		}
		v.getIdent().accept(this, p);
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionInt v, Object p) {
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionLogic v, Object p) {
		v.getExpreLeft().accept(this, p);
		v.getExpreRight().accept(this, p);
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionNegation v, Object p) {
		v.getExpression().accept(this, p);
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionReal v, Object p) {
		v.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ExpressionUnary v, Object p) {
		v.getExpression().accept(this, p);
		v.setLValue(false);
		return null;
	}
	
	
	
	
	

}
