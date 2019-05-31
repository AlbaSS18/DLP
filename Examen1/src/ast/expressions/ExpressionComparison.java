package ast.expressions;

import sintactic.Visitor;

public class ExpressionComparison extends ExpressionAbstractClass{
	
	private Expression expreLeft, expreRight;
	private String operator;
	
	public ExpressionComparison(int line, int column,Expression expreLeft, Expression expreRight, String operator) {
		super(line, column);
		this.expreLeft = expreLeft;
		this.expreRight = expreRight;
		this.operator = operator;
	}
	
	public Expression getExpreLeft() {
		return expreLeft;
	}

	public void setExpreLeft(Expression expreLeft) {
		this.expreLeft = expreLeft;
	}

	public Expression getExpreRight() {
		return expreRight;
	}

	public void setExpreRight(Expression expreRight) {
		this.expreRight = expreRight;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "ExpressionComparison [expreLeft=" + expreLeft + ", expreRight=" + expreRight + ", operator=" + operator
				+ "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this,object);
	}
	

}
