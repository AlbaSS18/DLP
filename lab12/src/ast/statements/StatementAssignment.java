package ast.statements;

import ast.ASTNodeAbstract;
import ast.expressions.Expression;
import sintactic.Visitor;

public class StatementAssignment extends ASTNodeAbstract implements Statement {
	
	private Expression expressionLeft, expressionRight;
	
	public StatementAssignment(int line, int column,Expression expressionLeft, Expression expressionRight) {
		super(line,column);
		this.expressionLeft = expressionLeft;
		this.expressionRight = expressionRight;
	}

	public Expression getExpressionLeft() {
		return expressionLeft;
	}

	public void setExpressionLeft(Expression expressionLeft) {
		this.expressionLeft = expressionLeft;
	}

	public Expression getExpressionRight() {
		return expressionRight;
	}

	public void setExpressionRight(Expression expressionRight) {
		this.expressionRight = expressionRight;
	}

	@Override
	public String toString() {
		return "StatementAssignment [expressionLeft=" + expressionLeft + ", expressionRight=" + expressionRight + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	

}
