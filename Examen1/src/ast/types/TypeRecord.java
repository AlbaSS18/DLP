package ast.types;

import java.util.List;

import sintactic.Visitor;

//Tipo registro
public class TypeRecord extends TypeAbstract {
	
	private List<Field> listFields;

	public TypeRecord(int line, int column,List<Field> listFields) {
		super(line, column);
		this.listFields =  listFields;
	}

	public List<Field> getListFields() {
		return listFields;
	}

	public void setListFields(List<Field> listFields) {
		this.listFields = listFields;
	}

	@Override
	public String toString() {
		return "TypeRecord [listFields=" + listFields + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

	@Override
	public Type dot(String field) {
		for(Field f: this.listFields) {
			if(f.getName().equals(field)) {
				return f.getTipo();
			}
		}
		return null;
	}

	@Override
	public int getSizeOfType() {
		int suma = 0;
		for(Field fi: this.listFields) {
			suma += fi.getTipo().getSizeOfType();
		}
		return suma;
	}
	
	@Override
	public Field getField (String identifier) {
		for(Field fi: this.listFields) {
			if(fi.getName().equals(identifier)) {
				return fi;
			}
		}
		return null;
	}

	
	
	

	
}
