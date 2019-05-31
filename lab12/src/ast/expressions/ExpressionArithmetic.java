package ast.expressions;

import sintactic.Visitor;

public class ExpressionArithmetic extends ExpressionAbstractClass {
	
	private Expression exprLeft,exprRight;
	private String operator;
	
	public ExpressionArithmetic(int line, int column,Expression exprLeft,Expression exprRight,String operator) {
		super(line,column);
		this.exprLeft = exprLeft;
		this.exprRight = exprRight;
		this.operator = operator;
	}
	
	public Expression getExprLeft() {
		return exprLeft;
	}

	public void setExprLeft(Expression exprLeft) {
		this.exprLeft = exprLeft;
	}

	public Expression getExprRight() {
		return exprRight;
	}

	public void setExprRight(Expression exprRight) {
		this.exprRight = exprRight;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "ExpressionArithmetic [exprLeft=" + exprLeft + ", exprRight=" + exprRight + ", operator=" + operator
				+ "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this,object);
	}

}
