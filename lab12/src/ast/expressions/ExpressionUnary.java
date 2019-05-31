package ast.expressions;

import sintactic.Visitor;

public class ExpressionUnary extends ExpressionAbstractClass{
	
	private Expression expression;
	
	public ExpressionUnary(int line, int column,Expression expression) {
		super(line, column);
		this.expression = expression;
	}
	
	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "ExpressionUnary [expression=" + expression + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
}
