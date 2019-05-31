package ast.types;

import sintactic.Visitor;

public class TypeArray extends TypeAbstract {

	private int size;
	private Type type;
	
	public TypeArray(int line, int column,int size,Type type) {
		super(line, column);
		this.size = size;
		this.type = type;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TypeArray [size=" + size + ", type=" + type + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

	@Override
	public Type squareBrackets(Type type) {
		if(type instanceof TypeInt) {
			return this.type;
		}
		return null;
	}

	@Override
	public int getSizeOfType() {
		return this.type.getSizeOfType() * this.size;
	}
	
	


}
