package symboltable;

import java.util.*;

import ast.definitions.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	
	public SymbolTable()  {
		table = new ArrayList<Map<String,Definition>>();
		table.add(new HashMap<String,Definition>());
	}

	public void set() {
		scope++;
		Map<String,Definition> map = new HashMap<String,Definition>();
		table.add(scope,map);
	}
	
	public void reset() {
		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		if (this.findInCurrentScope(definition.getName()) == null && definition!=null) {
			table.get(scope).put(definition.getName(), definition);
			definition.setScope(scope);
			return true;
		}
		return false;
		
	}
	
	public Definition find(String id) {
		for(int i= this.scope; i>=0; i--) {
			Map<String,Definition> mapScope = table.get(i);
			if(mapScope.containsKey(id)) {
				return mapScope.get(id);
			}
		}
		return null;
		
	}

	public Definition findInCurrentScope(String id) {
		Map<String,Definition> mapScope = table.get(scope);
		Definition def = mapScope.get(id);
		return def;
	}
}
