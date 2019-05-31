package ast.expressions;

import java.util.List;

import ast.statements.Statement;
import sintactic.Visitor;

public class ExpressionFunctionInvocation  extends ExpressionAbstractClass implements Statement{
	
	private Identifier ident;
	private List<Expression> param;
	
	public ExpressionFunctionInvocation(int line, int column,Identifier ident, List<Expression> param) {
		super(line, column);
		this.ident = ident;
		this.param = param;
	}
	
	public Identifier getIdent() {
		return ident;
	}

	public void setIdent(Identifier ident) {
		this.ident = ident;
	}

	public List<Expression> getParam() {
		return param;
	}

	public void setParam(List<Expression> param) {
		this.param = param;
	}

	@Override
	public String toString() {
		return "ExpressionFunctionInvocation [ident=" + ident + ", param=" + param + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

}
