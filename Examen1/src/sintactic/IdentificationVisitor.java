package sintactic;

import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Identifier;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor {
	
	private SymbolTable symbol = new SymbolTable();

	@Override
	public Object visit(Identifier v, Object p) {
		Definition def = symbol.find(v.getIdentifier());
		if(def == null) {
			return new ErrorType(v.getLine(), v.getColumn(), "Variable o función no definida");
		}
		v.setDefinition(def);
		return null;
	}

	@Override
	public Object visit(VarDefinition v, Object p) {
		if(!symbol.insert(v)) {
			return new ErrorType(v.getLine(), v.getColumn(), "Variable ya declarada");
		}
		return super.visit(v, p);
	}

	@Override
	public Object visit(FuncDefinition v, Object p) {
		if(symbol.insert(v)) {
			symbol.set();
			super.visit(v, p);
			symbol.reset();
			return null;
		}
		else {
			return new ErrorType(v.getLine(), v.getColumn(), "Función ya definida");
		}
		
	}
	
	
	
	
	

}
