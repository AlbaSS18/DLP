package ast.expressions;

import sintactic.Visitor;

public class ExpressionAccessField extends ExpressionAbstractClass {

	private Expression expression;
	private String id;
	
	public ExpressionAccessField(int line, int column, Expression expre, String id) {
		super(line, column);
		this.expression = expre;
		this.id = id;
	}

	public Expression getExpression() {
		return expression;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ExpressionAccessField [expression=" + expression + ", id=" + id + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

	
}
