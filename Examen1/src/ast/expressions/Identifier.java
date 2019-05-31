package ast.expressions;

import ast.definitions.Definition;
import sintactic.Visitor;

public class Identifier extends ExpressionAbstractClass{
	
	private String identifier;
	private Definition definition;

	public Identifier(int line, int column, String identifier) {
		super(line, column);
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Definition getDefinition() {
		return definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}
	
	@Override
	public String toString() {
		return "Identifier [identifier=" + identifier + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
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
		Identifier other = (Identifier) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this,object);
	}
	
	
	
	
}
