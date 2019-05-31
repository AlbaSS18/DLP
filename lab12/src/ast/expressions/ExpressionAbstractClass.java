package ast.expressions;

import ast.ASTNodeAbstract;
import ast.types.Type;

public abstract class ExpressionAbstractClass extends ASTNodeAbstract implements Expression  {

	private boolean lValue;
	private Type type;

	public ExpressionAbstractClass(int line, int column) {
		super(line, column);
	}

	@Override
	public boolean getLValue() {
		return lValue;
	}

	@Override
	public void setLValue(boolean lValue) {
		this.lValue = lValue;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public void setType(Type type) {
		this.type = type;
	}
	
	
	

}
