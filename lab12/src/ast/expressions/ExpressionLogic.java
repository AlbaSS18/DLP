package ast.expressions;

import sintactic.Visitor;

public class ExpressionLogic extends ExpressionAbstractClass{
	
	private Expression expreRight, expreLeft;
	private String operator;
	
	public ExpressionLogic(int line, int column,Expression expreRight,Expression expreLeft,String operator) {
		super(line, column);
		this.expreRight = expreRight;
		this.expreLeft = expreLeft;
		this.operator = operator;
	}
	
	public Expression getExpreRight() {
		return expreRight;
	}

	public void setExpreRight(Expression expreRight) {
		this.expreRight = expreRight;
	}

	public Expression getExpreLeft() {
		return expreLeft;
	}

	public void setExpreLeft(Expression expreLeft) {
		this.expreLeft = expreLeft;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "ExpressionLogic [expreRight=" + expreRight + ", expreLeft=" + expreLeft + ", operator=" + operator
				+ "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

}
