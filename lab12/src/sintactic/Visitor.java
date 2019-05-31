package sintactic;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
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

public interface Visitor {
	
	//Programa
	Object visit (Program v, Object p);
	//Definiciones
	Object visit (VarDefinition v, Object p);
	Object visit (FuncDefinition v, Object p);
	//Expresiones
	Object visit (ExpressionArithmetic v, Object p);
	Object visit (ExpressionAccessArray v, Object p);
	Object visit (ExpressionAccessField v, Object p);
	Object visit (ExpressionCast v, Object p);
	Object visit (ExpressionChar v, Object p);
	Object visit (ExpressionComparison v, Object p);
	Object visit (ExpressionFunctionInvocation v, Object p);
	Object visit (ExpressionInt v, Object p);
	Object visit (ExpressionLogic v, Object p);
	Object visit (ExpressionNegation v, Object p);
	Object visit (ExpressionReal v, Object p);
	Object visit (ExpressionUnary v, Object p);
	Object visit (Identifier v, Object p);
	//Statement
	Object visit (StatementAssignment v, Object p);
	Object visit (StatementIf v, Object p);
	Object visit (StatementInput v, Object p);
	Object visit (StatementReturn v, Object p);
	Object visit (StatementWhile v, Object p);
	Object visit (StatementPrint v, Object p);
	//Types
	Object visit (TypeArray v, Object p);
	Object visit (TypeChar v, Object p);
	Object visit (TypeDouble v, Object p);
	Object visit (TypeFunction v, Object p);
	Object visit (TypeInt v, Object p);
	Object visit (TypeRecord v, Object p);
	Object visit (TypeVoid v, Object p);
	Object visit (ErrorType v, Object p);
	Object visit (Field v, Object p);
}
