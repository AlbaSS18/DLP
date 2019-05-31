package offsetgeneration;

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
import ast.types.TypeInt;

public class ValueCGVisitor extends AbstractCGVisitor{
	
	private AddressCGVisitor adGC;

	public ValueCGVisitor(CodeGenerator cg) {
		super(cg);
		this.adGC = new AddressCGVisitor(this.cg, this);
	}

	@Override
	public Object visit(ExpressionChar v, Object p) {
		this.cg.push(v.getValue());
		return null;
	}

	@Override
	public Object visit(ExpressionInt v, Object p) {
		this.cg.push(v.getValor());
		return null;
	}

	@Override
	public Object visit(ExpressionReal v, Object p) {
		this.cg.push(v.getValue());
		return null;
	}

	@Override
	public Object visit(ExpressionArithmetic v, Object p) {
		v.getExprLeft().accept(this, p);
		this.cg.convertTo(v.getExprLeft().getType(),v.getType());
		v.getExprRight().accept(this, p);
		this.cg.convertTo(v.getExprRight().getType(), v.getType());
		this.cg.arithmetic(v.getOperator(), v.getType());
		return null;
	}

	@Override
	public Object visit(Identifier v, Object p) {
		v.accept(this.adGC, p);
		this.cg.load(v.getDefinition().getType());
		return null;
	}

	@Override
	public Object visit(ExpressionCast v, Object p) {
		v.getExpression().accept(this, p);
		this.cg.cast(v.getExpression().getType(), v.getTypeCast());
		return null;
	}

	@Override
	public Object visit(ExpressionComparison v, Object p) {
		v.getExpreLeft().accept(this, p);
		v.getExpreRight().accept(this, p);
		this.cg.comparison(v.getOperator(),v.getType());
		return null;
	}

	@Override
	public Object visit(ExpressionLogic v, Object p) {
		v.getExpreLeft().accept(this, p);
		this.cg.convertTo(v.getExpreLeft().getType(), v.getType());
		v.getExpreRight().accept(this, p);
		this.cg.convertTo(v.getExpreRight().getType(), v.getType());
		this.cg.logic(v.getOperator());
		return null;
	}

	@Override
	public Object visit(ExpressionUnary v, Object p) {
		//-
		v.getExpression().accept(this, p);
		this.cg.push(-1);
		this.cg.convertTo(TypeInt.getInstance(), v.getExpression().getType());
		this.cg.mul(v.getExpression().getType());
		return null;
	}

	@Override
	public Object visit(ExpressionAccessArray v, Object p) {
		v.accept(this.adGC, p);
		this.cg.load(v.getType());
		return null;
	}

	@Override
	public Object visit(ExpressionAccessField v, Object p) {
		v.accept(this.adGC, p);
		this.cg.load(v.getType());
		return null;
	}

	@Override
	public Object visit(ExpressionFunctionInvocation v, Object p) {
		for(Expression expression: v.getParam()) {
			expression.accept(this, p);
		}
		this.cg.callFunction(v.getIdent().getIdentifier());
		return null;
	}

	@Override
	public Object visit(ExpressionNegation v, Object p) {
		//!
		v.getExpression().accept(this, p);
		this.cg.logic("!");
		return null;
	}
	
	
	
	
	
	

}
