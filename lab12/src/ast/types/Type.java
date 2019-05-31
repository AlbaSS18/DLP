package ast.types;

import java.util.List;

import ast.ASTNode;
import ast.expressions.ExpressionFunctionInvocation;

public interface Type extends ASTNode{

	boolean isLogical();
	Type arithmetic(Type type);
	Type arithmetic();
	Type comparison(Type type);
	Type logical(Type type);
	Type logical();
	Type dot (String field);
	Type squareBrackets(Type type);
	boolean isBuildIntType();
	Type canBeCast(Type type);
	Type promotesTo(Type type);
	Type parenthesis(List<Type> type, ExpressionFunctionInvocation v);
	int getSizeOfType();
	char suffix();
	Field getField(String identifier);
}
