package ast.statements;

import java.util.List;

import ast.ASTNodeAbstract;
import ast.expressions.Expression;
import sintactic.Visitor;

public class StatementWhile extends ASTNodeAbstract implements Statement{
	
	private Expression expression;
	private List<Statement> listStatement;
	
	public StatementWhile(int line, int column,Expression expression, List<Statement> listStatement) {
		super(line,column);
		this.expression = expression;
		this.listStatement = listStatement;
	}
	
	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public List<Statement> getListStatement() {
		return listStatement;
	}

	public void setListStatement(List<Statement> listStatement) {
		this.listStatement = listStatement;
	}

	@Override
	public String toString() {
		return "StatementWhile [expression=" + expression + ", listStatement=" + listStatement + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	

}
