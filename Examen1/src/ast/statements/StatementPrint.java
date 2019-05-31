package ast.statements;

import ast.ASTNodeAbstract;
import ast.expressions.Expression;
import sintactic.Visitor;

public class StatementPrint extends ASTNodeAbstract implements Statement {
	
	private Expression expression;
	
	public StatementPrint(int line, int column,Expression expression) {
		super(line,column);
		this.setExpression(expression);
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "StatementPrint [expression=" + expression + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}


}
