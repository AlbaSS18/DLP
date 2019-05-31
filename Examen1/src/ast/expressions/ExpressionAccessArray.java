package ast.expressions;

import sintactic.Visitor;

public class ExpressionAccessArray extends ExpressionAbstractClass{

	private Expression left, right;
	
	public ExpressionAccessArray(int line, int column, Expression left, Expression right) {
		super(line, column);
		this.left = left;
		this.right = right;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "ExpressionAccessArray [left=" + left + ", right=" + right + "]";
	}
	
	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this,object);
	}
	

	
	

}
