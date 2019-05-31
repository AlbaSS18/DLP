package ast.types;

import sintactic.Visitor;

public class TypeVoid extends TypeAbstract {

	private static TypeVoid instance = new TypeVoid();
	
	private TypeVoid() {
		super(0,0);	
	}
	
	public static TypeVoid getInstance() {
		if(instance == null) {
			instance = new TypeVoid();
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "Type void";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	
	
	

}
