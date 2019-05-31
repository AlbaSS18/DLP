package ast.definitions;

import ast.ASTNodeAbstract;
import ast.statements.Statement;
import ast.types.Type;
import sintactic.Visitor;

public class VarDefinition extends ASTNodeAbstract implements Definition,Statement{
	
	private String name;
	private Type type;
	private int scope = 0;
	private int offset = 0;

	public VarDefinition(int line, int column) {
		super(line, column);
	}

	public VarDefinition(Type type, String name, int line, int column) {
		super(line,column);
		this.type = type;
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
	}
	
	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "VarDefinition [name=" + name + ", type=" + type + "]";
	}

	@Override
	public Object accept(Visitor v, Object p) {
		return v.visit(this,p);
	}

	@Override
	public int getScope() {
		return scope;
	}

	@Override
	public void setScope(int scope) {
		this.scope = scope;
	}


}
