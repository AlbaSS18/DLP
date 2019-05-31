package ast;

import sintactic.Visitor;

public interface ASTNode {
	
	public int getLine();
	public int getColumn();
	public Object accept(Visitor visitor, Object object);

}
