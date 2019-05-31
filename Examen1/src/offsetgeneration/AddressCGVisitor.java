package offsetgeneration;

import ast.definitions.VarDefinition;
import ast.expressions.ExpressionAccessArray;
import ast.expressions.ExpressionAccessField;
import ast.expressions.Identifier;
import ast.types.TypeInt;

public class AddressCGVisitor extends AbstractCGVisitor{
	
	private ValueCGVisitor vCG;

	public AddressCGVisitor(CodeGenerator cg, ValueCGVisitor vg) {
		super(cg);
		this.vCG = vg;
	}

	@Override
	public Object visit(ExpressionAccessArray v, Object p) {
		v.getLeft().accept(this, p);
		v.getRight().accept(this.vCG, p);
		this.cg.push(v.getType().getSizeOfType()); //Al ser tipo array, en el m�todo getSizeOfType() ya lo multiplicas.
		this.cg.mul(TypeInt.getInstance());
		this.cg.add(TypeInt.getInstance());
		//Solo lo carga, no asigna nada. Por eso no pones las dos �ltimas instrucciones: push y store.
		
		return null;
	}

	@Override
	public Object visit(ExpressionAccessField v, Object p) {
		v.getExpression().accept(this, p);
		//Push del tama�o del campo del record.
		this.cg.push(v.getExpression().getType().getField(v.getId()).getOffset());
		this.cg.add(TypeInt.getInstance());
		return null;
	}

	@Override
	public Object visit(Identifier v, Object p) {
		
		VarDefinition varD = ((VarDefinition) v.getDefinition());
		
		//�Es variable global?
		if(varD.getScope() == 0) {
			this.cg.pushA(varD.getOffset());
		}
		//�Es variable local?
		else {
			this.cg.pushBP();
			this.cg.push(varD.getOffset());
			this.cg.add(TypeInt.getInstance());
		}
		return null;
	}
	
	

}
