package ast.expressions;

import sintactic.Visitor;

public class ExpressionInt extends ExpressionAbstractClass{
	
	private int valor;
	
	public ExpressionInt(int line, int column,int valor) {
		super(line, column);
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "ExpressionInt [valor=" + valor + "]";
	}

	@Override
	public Object accept(Visitor visitor, Object object) {
		return visitor.visit(this, object);
	}
	
	

}
