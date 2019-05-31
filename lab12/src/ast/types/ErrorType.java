package ast.types;

import sintactic.Visitor;

public class ErrorType extends TypeAbstract {

	private String message;
	
	public ErrorType(int line, int column,String message) {
		super(line, column);
		this.message = message;
		ErrorHandler.getSingletonInstance().addError(this);
	}

	@Override
	public String toString() {
		return "Line: " + this.getLine() + " Column: " + this.getColumn() + " ErrorType [message=" + message + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	

}
