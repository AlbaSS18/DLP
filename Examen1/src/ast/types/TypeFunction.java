package ast.types;

import java.util.List;

import ast.definitions.VarDefinition;
import ast.expressions.ExpressionFunctionInvocation;
import sintactic.Visitor;

public class TypeFunction extends TypeAbstract{
	
	private Type typeReturn;
	private List<VarDefinition> listVariable;
	private int paramsSize;

	public TypeFunction(int line, int column, Type typeReturn, List<VarDefinition> listVariable) {
		super(line, column);
		this.typeReturn = typeReturn;
		this.listVariable = listVariable;
	}

	public Type getTypeReturn() {
		return typeReturn;
	}

	public void setTypeReturn(Type typeReturn) {
		this.typeReturn = typeReturn;
	}

	public List<VarDefinition> getListVariable() {
		return listVariable;
	}

	public void setListVariable(List<VarDefinition> listVariable) {
		this.listVariable = listVariable;
	}

	@Override
	public String toString() {
		return "TypeFunction [typeReturn=" + typeReturn + ", listVariable=" + listVariable + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}

	@Override
	public Type parenthesis(List<Type> type, ExpressionFunctionInvocation v) {
		// Si el número de parámetros no coincide, se envía un error
		if(this.listVariable.size() != type.size()) {
			return new ErrorType(v.getLine(), v.getColumn(), "El número de parámetros no coincide");
		}
		// Miramos si los tipos son iguales
		for(int i=0; i<type.size(); i++) {
			if(type.get(i).promotesTo(listVariable.get(i).getType()) == null) {
				return new ErrorType(v.getLine(), v.getColumn(), "Los tipos de los parámetros no son iguales");
			}
		}			
		return this.typeReturn;
	}

	@Override
	public int getSizeOfType() {
		return 0;
	}
	
	public int getParamsSize() {
		return paramsSize;
	}

	public void setParamsSize(int paramsSize) {
		this.paramsSize = paramsSize;
	}

	
	
	
	

}
