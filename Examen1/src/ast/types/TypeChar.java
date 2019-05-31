package ast.types;

import sintactic.Visitor;

public class TypeChar extends TypeAbstract{
	
	private static TypeChar instance = new TypeChar();

	private TypeChar() {
		super(0,0);
	}
	
	public static TypeChar getInstance() {
		if(instance == null) {
			instance = new TypeChar();
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "Type char";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	@Override
	public Type arithmetic(Type type) {
		if(type instanceof TypeChar) {
			return TypeInt.getInstance();
		}
		return super.arithmetic(type);
	}

	@Override
	public Type promotesTo(Type type) {
		if(type instanceof TypeChar) {
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
		if(type instanceof TypeChar) {
			return TypeInt.getInstance();
		}
		return super.comparison(type);
	}

	@Override
	public int getSizeOfType() {
		return 1;
	}

	@Override
	public char suffix() {
		return 'b';
	}
	
	
	
	
	
	
	
	

}
