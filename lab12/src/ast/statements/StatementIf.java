package ast.statements;

import java.util.List;

import ast.ASTNodeAbstract;
import ast.expressions.Expression;
import sintactic.Visitor;

public class StatementIf extends ASTNodeAbstract implements Statement{
	
	private Expression expression;
	private List<Statement> statementIf, statementElse;
	
	public StatementIf(Expression expression, List<Statement> statementIf, List<Statement> statementElse, int line, int column) {
		super(line,column);
		this.expression = expression;
		this.statementIf = statementIf;
		this.statementElse = statementElse;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public List<Statement> getStatementIf() {
		return statementIf;
	}

	public void setStatementIf(List<Statement> statementIf) {
		this.statementIf = statementIf;
	}

	public List<Statement> getStatementElse() {
		return statementElse;
	}

	public void setStatementElse(List<Statement> statementElse) {
		this.statementElse = statementElse;
	}

	@Override
	public String toString() {
		return "StatementIf [expression=" + expression + ", statementIf=" + statementIf + ", statementElse="
				+ statementElse + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

}
