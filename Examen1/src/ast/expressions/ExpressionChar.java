package ast.expressions;

import sintactic.Visitor;

public class ExpressionChar extends ExpressionAbstractClass{
	
	private char value;
	
	public ExpressionChar(int line, int column, char value) {
		super(line, column);
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "ExpressionChar [value=" + value + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

}
