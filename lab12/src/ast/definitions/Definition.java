package ast.definitions;

import ast.ASTNode;
import ast.types.Type;

public interface Definition extends ASTNode{

	String getName();
	
	Type getType();
	
	int getScope();
	
	void setScope(int scope);
	
}
