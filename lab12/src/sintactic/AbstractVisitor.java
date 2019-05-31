package sintactic;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import ast.expressions.ExpressionAccessArray;
import ast.expressions.ExpressionAccessField;
import ast.expressions.ExpressionArithmetic;
import ast.expressions.ExpressionCast;
import ast.expressions.ExpressionChar;
import ast.expressions.ExpressionComparison;
import ast.expressions.ExpressionFunctionInvocation;
import ast.expressions.ExpressionInt;
import ast.expressions.ExpressionLogic;
import ast.expressions.ExpressionNegation;
import ast.expressions.ExpressionReal;
import ast.expressions.ExpressionUnary;
import ast.expressions.Identifier;
import ast.statements.Statement;
import ast.statements.StatementAssignment;
import ast.statements.StatementIf;
import ast.statements.StatementInput;
import ast.statements.StatementPrint;
import ast.statements.StatementReturn;
import ast.statements.StatementWhile;
import ast.types.ErrorType;
import ast.types.Field;
import ast.types.TypeArray;
import ast.types.TypeChar;
import ast.types.TypeDouble;
import ast.types.TypeFunction;
import ast.types.TypeInt;
import ast.types.TypeRecord;
import ast.types.TypeVoid;

public abstract class AbstractVisitor implements Visitor {
	
	
	//---------------DEFINITIONS-------------------

	@Override
	public Object visit(VarDefinition v, Object p) {
		v.getType().accept(this, p);
		return null;
	}

	@Override
	public Object visit(FuncDefinition v, Object p) {
		v.getType().accept(this, p);
		for(Statement st: v.getStatements()) {
			st.accept(this, p);
		}
		return null;
	}

	//---------------STATEMENTS-------------------
	
	@Override
	public Object visit(StatementAssignment v, Object p) {
		v.getExpressionLeft().accept(this, p);
		v.getExpressionRight().accept(this, p);
		return null;
	}

	@Override
	public Object visit(StatementIf v, Object p) {
		for(Statement st: v.getStatementIf()) {
			st.accept(this, p);
		}
		for(Statement st: v.getStatementElse()) {
			st.accept(this, p);
		}
		v.getExpression().accept(this, p);
		return null;
	}

	@Override
	public Object visit(StatementInput v, Object p) {
		v.getListExpressions().accept(this, p);
		return null;
	}

	@Override
	public Object visit(StatementReturn v, Object p) {
		v.getExpression().accept(this, p);
		return null;
	}

	@Override
	public Object visit(StatementWhile v, Object p) {
		for(Statement st: v.getListStatement()) {
			st.accept(this, p);
		}
		v.getExpression().accept(this, p);
		return null;
	}
	
	@Override
	public Object visit(StatementPrint v, Object p) {
		v.getExpression().accept(this, p);
		return null;
	}

	//---------------TYPES-------------------
	
	@Override
	public Object visit(TypeArray v, Object p) {
		v.getType().accept(this, p);
		return null;
	}

	@Override
	public Object visit(TypeChar v, Object p) {
		return null;
	}

	@Override
	public Object visit(TypeDouble v, Object p) {
		return null;
	}

	@Override
	public Object visit(TypeFunction v, Object p) {
		v.getTypeReturn().accept(this, p);
		for(VarDefinition varDefinition: v.getListVariable()) {
			varDefinition.accept(this, p);
		}
		return null;
	}

	@Override
	public Object visit(TypeInt v, Object p) {
		return null;
	}

	@Override
	public Object visit(TypeRecord v, Object p) {
		for(Field field: v.getListFields()) {
			field.accept(this, p);
		}
		return null;
	}

	@Override
	public Object visit(TypeVoid v, Object p) {
		return null;
	}

	@Override
	public Object visit(ErrorType v, Object p) {
		return null;
	}

	@Override
	public Object visit(Field v, Object p) {
		v.getTipo().accept(this, p);
		return null;
	}

	//---------------PROGRAM-------------------
	
	@Override
	public Object visit(Program v, Object p) {
		for(Definition definition: v.getListDefinitions() ) {
			definition.accept(this, p);
		}
		return null;
	}
	
	//---------------EXPRESSIONS-------------------

	@Override
	public Object visit(ExpressionArithmetic v, Object p) {
		v.getExprLeft().accept(this, p);
		v.getExprRight().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionAccessArray v, Object p) {
		v.getLeft().accept(this, p);
		v.getRight().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionAccessField v, Object p) {
		v.getExpression().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionCast v, Object p) {
		v.getExpression().accept(this, p);
		v.getTypeCast().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionChar v, Object p) {
		return null;
	}

	@Override
	public Object visit(ExpressionComparison v, Object p) {
		v.getExpreLeft().accept(this, p);
		v.getExpreRight().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionFunctionInvocation v, Object p) {
		for(Expression ex: v.getParam()) {
			ex.accept(this, p);
		}
		v.getIdent().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionInt v, Object p) {
		return null;
	}

	@Override
	public Object visit(ExpressionLogic v, Object p) {
		v.getExpreLeft().accept(this, p);
		v.getExpreRight().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionNegation v, Object p) {
		v.getExpression().accept(this, p);
		return null;
	}

	@Override
	public Object visit(ExpressionReal v, Object p) {
		return null;
	}

	@Override
	public Object visit(ExpressionUnary v, Object p) {
		v.getExpression().accept(this, p);
		return null;
	}

	@Override
	public Object visit(Identifier v, Object p) {
		v.getType().accept(this, p);
		return null;
	}

}
