package ast.statements;

import ast.ASTNodeAbstract;
import ast.expressions.Expression;
import sintactic.Visitor;

public class StatementInput extends ASTNodeAbstract implements Statement {
	
	private Expression expression;
	
	public StatementInput(int line, int column,Expression expression) {
		super(line,column);
		this.expression = expression;
	}

	public Expression getListExpressions() {
		return expression;
	}

	public void setListExpressions(Expression expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "StatementInput [expression=" + expression + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

}
