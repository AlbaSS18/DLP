package ast.definitions;

import java.util.List;


import ast.ASTNodeAbstract;
import ast.statements.Statement;
import ast.types.Type;
import ast.types.TypeFunction;
import sintactic.Visitor;

public class FuncDefinition extends ASTNodeAbstract implements Definition {
	
	private String name;
	private Type type;
	private List<Statement> statements;
	private int scope = 0;
	private int local;

	public FuncDefinition(int column, int line, String name, Type type, List<Statement> statements) {
		super(column,line);
		this.name = name;
		this.type = type;
		this.statements = statements;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	@Override
	public String toString() {
		return "FuncDefinition [name=" + name + ", type=" + type + ", statements=" + statements + "]";
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
	
	public int localBytes(){
		int local = 0;
		for(Statement s: this.statements) {
			if(s instanceof VarDefinition) {
				local += ((VarDefinition) s).getType().getSizeOfType();
			}
		}
		return local;
	}

	public int paramsBytes() {
		int params = 0;
		
		for(VarDefinition var: ((TypeFunction)getType()).getListVariable()) {
			params += var.getType().getSizeOfType();
		}
		
		return params;
	}
	
	public int getLocal() {
		return local;
	}

	public void setLocal(int local) {
		this.local = local;
	}

	

}
