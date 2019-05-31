package ast.expressions;

import ast.ASTNode;
import ast.types.Type;

public interface Expression extends ASTNode {
	
	boolean getLValue();
	void setLValue(boolean lValue);
	Type getType();
	void setType(Type type);

}
