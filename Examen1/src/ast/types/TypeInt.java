package ast.types;

import sintactic.Visitor;

public class TypeInt extends TypeAbstract {
	
	private static TypeInt instance = new TypeInt();

	private TypeInt() {
		super(0,0);
	}
	
	public static TypeInt getInstance() {
		if(instance == null) {
			instance = new TypeInt();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Type int";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

	@Override
	public boolean isLogical() {
		return true;
	}

	@Override
	public Type arithmetic() {
		return this;
	}

	@Override
	public Type arithmetic(Type type) {
		if(type instanceof TypeInt) {
			return this;
		}
		return super.arithmetic(type);
	}

	@Override
	public Type promotesTo(Type type) {
		if(type instanceof TypeInt) {
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
	public Type logical() {
		return this;
	}
	
	@Override
	public Type comparison(Type type) {
		if(type instanceof TypeInt) {
			return TypeInt.getInstance();
		}
		return super.comparison(type);
	}

	@Override
	public int getSizeOfType() {
		return 2;
	}

	@Override
	public char suffix() {
		return 'i';
	}

	@Override
	public Type logical(Type type) {
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
