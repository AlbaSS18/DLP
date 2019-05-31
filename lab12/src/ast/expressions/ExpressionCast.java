package ast.expressions;

import ast.types.Type;
import sintactic.Visitor;

public class ExpressionCast extends ExpressionAbstractClass{
	
	private Expression expression;
	private Type typeCast;
	
	public ExpressionCast(int line, int column,Expression expression,Type typeCast) {
		super(line, column);
		this.expression= expression;
		this.typeCast = typeCast;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public Type getTypeCast() {
		return typeCast;
	}

	public void setTypeCast(Type typeCast) {
		this.typeCast = typeCast;
	}

	@Override
	public String toString() {
		return "ExpressionCast [expression=" + expression + ", typeCast=" + typeCast + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

}
