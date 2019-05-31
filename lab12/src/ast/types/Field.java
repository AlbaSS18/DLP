package ast.types;

import ast.ASTNodeAbstract;
import sintactic.Visitor;

public class Field extends ASTNodeAbstract{
	
	private String name;
	private Type tipo;
	private int offset = 0;

	public Field(int line, int column, String name, Type tipo) {
		super(line,column);
		this.name = name;
		this.tipo = tipo;
	}

	public Type getTipo() {
		return tipo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Field [name=" + name + ", tipo=" + tipo + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Field other = (Field) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	
	
	

}
