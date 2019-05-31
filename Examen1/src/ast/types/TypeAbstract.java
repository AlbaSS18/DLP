package ast.types;

import java.util.List;

import ast.ASTNodeAbstract;
import ast.expressions.ExpressionFunctionInvocation;

public abstract class TypeAbstract extends ASTNodeAbstract implements Type{

	public TypeAbstract(int line, int column) {
		super(line, column);
	}

	@Override
	public boolean isLogical() {
		return false;
	}

	@Override
	public Type arithmetic(Type type) {
		return null;
	}

	@Override
	public Type arithmetic() {
		return null;
	}

	@Override
	public Type comparison(Type type) {
		return null;
	}

	@Override
	public Type logical(Type type) {
		return null;
	}

	@Override
	public Type logical() {
		return null;
	}

	@Override
	public Type dot(String field) {
		return null;
	}

	@Override
	public Type squareBrackets(Type type) {
		return null;
	}

	@Override
	public boolean isBuildIntType() {
		return false;
	}

	@Override
	public Type canBeCast(Type type) {
		return null;
	}

	@Override
	public Type promotesTo(Type type) {
		return null;
	}

	@Override
	public Type parenthesis(List<Type> type, ExpressionFunctionInvocation v) {
		return null;
	}
	
	@Override
	public int getSizeOfType() {
		return 0;
	}

	@Override
	public char suffix() {
		return ' ';
	}

	@Override
	public Field getField(String identifier) {
		return null;
	}
	
	
	

	
}
