package ast.statements;

import java.util.List;

import ast.expressions.Expression;
import sintactic.Visitor;

public class StatementDoWhile extends StatementWhile{
	
	private Expression expression;
	private List<Statement> listStatement;
	
	public StatementDoWhile(int line, int column,List<Statement> listStatement,Expression expression) {
		super(line,column,expression, listStatement);
	}

	@Override
	public String toString() {
		return "StatementDoWhile [expression=" + expression + ", listStatement=" + listStatement + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	

}
