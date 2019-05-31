package offsetgeneration;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.statements.Statement;
import ast.types.Field;
import ast.types.TypeFunction;
import ast.types.TypeRecord;
import sintactic.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor{
	
	private int globalOffsetSize = 0;
	private int localOffsetSize = 0;
	private int paramOffsetSize = 4;

	@Override
	public Object visit(VarDefinition v, Object p) {
		//Variable global
		if(v.getScope() == 0) {
			v.setOffset(globalOffsetSize);
			globalOffsetSize += v.getType().getSizeOfType();
		}
		//Variable local
		else {
			localOffsetSize += v.getType().getSizeOfType();
			v.setOffset(localOffsetSize * (-1));
		}
		return null;
	}

	@Override
	public Object visit(FuncDefinition v, Object p) {
		localOffsetSize = 0;
		
		v.getType().accept(this, p);
		for(Statement s: v.getStatements()) {
			s.accept(this, p);
		}
		//v.localVariablesBytes = localOffsetSize;
		v.setLocal(localOffsetSize);
		return null;
	}

	@Override
	public Object visit(TypeFunction v, Object p) {
		paramOffsetSize = 4;
		
		v.getTypeReturn().accept(this, p);
		
		for(int i=v.getListVariable().size()-1 ;i >= 0;i--) {
			//Calcular los parámetros
			v.getListVariable().get(i).setOffset(paramOffsetSize);
			paramOffsetSize += v.getListVariable().get(i).getType().getSizeOfType();
		}
		v.setParamsSize(paramOffsetSize-4);
		return null;
	}

	@Override
	public Object visit(TypeRecord v, Object p) {
		int fieldScopeSize = 0;
		for(Field fields : v.getListFields()) {
			fields.setOffset(fieldScopeSize);
			fieldScopeSize += fields.getTipo().getSizeOfType();
		}
		return null;
	}
	
	
	

}
