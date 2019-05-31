package ast;

import java.util.List;

import ast.definitions.Definition;
import sintactic.Visitor;

public class Program extends ASTNodeAbstract{

	private List<Definition> listDefinitions;

	public Program(int line, int column,List<Definition> listDefinitions) {
		super(line,column);
		this.listDefinitions = listDefinitions;
	}

	public List<Definition> getListDefinitions() {
		return listDefinitions;
	}

	@Override
	public String toString() {
		return "Program [listDefinitions=" + listDefinitions + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

	
	
	
	
}
