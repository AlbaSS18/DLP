package ast.types;

import sintactic.Visitor;

public class TypeDouble extends TypeAbstract{

	private static TypeDouble instance = new TypeDouble();
	
	private TypeDouble() {
		super(0,0);
	}
	
	public static TypeDouble getInstance() {
		if(instance == null) {
			instance = new TypeDouble();
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "Type double";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	@Override
	public Type arithmetic() {
		return this;
	}
	
	@Override
	public Type arithmetic(Type type) {
		if(type instanceof TypeDouble) {
			return this;
		}
		return super.arithmetic(type);
	}

	@Override
	public Type promotesTo(Type type) {
		if(type instanceof TypeDouble) {
			return this;
		}
		return super.promotesTo(type);
	}
	
	@Override
	public boolean isBuildIntType() {
		return true;
	}

	@Override
	public Type canBeCast(Type type) {
		if(type.isBuildIntType()) {
			return type;
		}
		return null;
	}

	@Override
	public Type comparison(Type type) {
		return TypeInt.getInstance();
	}

	@Override
	public int getSizeOfType() {
		return 4;
	}

	@Override
	public char suffix() {
		return 'f';
	}
	
	
	
	

}
