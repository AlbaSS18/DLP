package ast.expressions;

import sintactic.Visitor;

public class ExpressionReal extends ExpressionAbstractClass{
	
	private double value;
	public ExpressionReal(int line, int column,double value) {
		super(line, column);
		this.value = value;
	}
	public double getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "ExpressionReal [value=" + value + "]";
	}
	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	

}
