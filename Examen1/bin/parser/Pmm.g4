grammar Pmm;	

@header {
	import ast.*;
	import ast.types.*;
 	import ast.definitions.*;
 	import ast.expressions.*;
 	import ast.statements.*;
 	import java.util.*;
}
 
program returns [Program ast] 
	:  l1=listDefinitions main EOF 
	{
		List<Definition> definitions = $l1.ast;
		definitions.add($main.ast);
		$ast = new Program($start.getLine(),$start.getCharPositionInLine()+1, definitions);
	}
    ;
       
listDefinitions returns [List<Definition> ast = new ArrayList<Definition>()]
	: (var_definition {$ast.addAll($var_definition.ast);}| func_definition{$ast.add($func_definition.ast);})*
	;

main returns [Definition ast]
	: 'def ' 'main' '('')' ':' '{' body '}' {$ast = new FuncDefinition($start.getLine(), $start.getCharPositionInLine()+1,"main", 
	new TypeFunction($start.getLine(), $start.getCharPositionInLine()+1,TypeVoid.getInstance(),new ArrayList()),$body.ast);}
	;
	
body returns [List<Statement> ast = new ArrayList<Statement>()]
	: (var_definition
		{ 
			for(VarDefinition v: $var_definition.ast)
				$ast.add(v);
		})* 
	  (statement
		{
			for(Statement s: $statement.ast)
				$ast.add(s);
		})* 
	;
          
var_definition returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]
	: listIds ':' type ';'  
	{
		for(Identifier id : $listIds.ast) 
			$ast.add(new VarDefinition($type.ast,id.getIdentifier(),id.getLine(),id.getColumn()));
	} 
	;
	
listIds returns [List<Identifier> ast = new ArrayList<Identifier>()]
	: ID {$ast.add(new Identifier($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text));} (',' ID
		{
			Identifier idN = new Identifier($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text); 
			if(!$ast.contains(idN)){
				$ast.add(idN);
			}
			else {
				new ErrorType($ID.getLine(),$ID.getCharPositionInLine()+1,"Campo de ids duplicado" + idN.getIdentifier());
			}		
		})*
	;
		
func_definition returns [FuncDefinition ast]
	: 'def ' ID '(' lista_parametros ')' ':' returnType '{' body '}' {$ast = new FuncDefinition($start.getLine(),$start.getCharPositionInLine()+1,$ID.text,
	new TypeFunction($start.getLine(), $start.getCharPositionInLine()+1,$returnType.ast,$lista_parametros.ast),$body.ast);}
	; 
	
returnType returns [Type ast]
	:  {$ast = TypeVoid.getInstance() ;}
	| typeSimple {$ast = $typeSimple.ast; }
	;
	
lista_parametros returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()] 
			: 
			| (ID ':' t=typeSimple) {$ast.add(new VarDefinition($t.ast,$ID.text,$ID.getLine(),$ID.getCharPositionInLine()+1));} (',' ID ':' t2=typeSimple{$ast.add(new VarDefinition($t2.ast,$ID.text,$ID.getLine(),$ID.getCharPositionInLine()+1));})*
			;
		
statement returns [List<Statement> ast = new ArrayList<Statement>()]
		: statement_if {$ast.add($statement_if.ast);}
		| statement_ternary {$ast.add ($statement_ternary.ast);}
		| statement_while {$ast.add($statement_while.ast);}
		| statement_do_while {$ast.add($statement_do_while.ast);}
		| statement_print {$ast.addAll($statement_print.ast);}
		| statement_input {$ast.addAll($statement_input.ast);}
		| f=funcInvocation ';' {$ast.add($f.ast);}
		| statement_assigment {$ast.add($statement_assigment.ast);}
		| statement_return {$ast.add($statement_return.ast);}
		;

statement_do_while returns [StatementDoWhile ast]
	: 'do' ':' b=block 'while ' expression {$ast = new StatementDoWhile ($start.getLine(),$start.getCharPositionInLine()+1,$b.ast, $expression.ast);} ';'
	;

statement_ternary returns [StatementIf ast]
	:  '(' e1=expression ')' '?' b1=bloqueStatement ':' b2=bloqueStatement ';' {$ast = new StatementIf($e1.ast,$b1.ast,$b2.ast,$start.getLine(),$start.getCharPositionInLine()+1);}
	| e1=expression '?' b1=bloqueStatement ':' b2=bloqueStatement ';' {$ast = new StatementIf($e1.ast,$b1.ast,$b2.ast,$start.getLine(),$start.getCharPositionInLine()+1);}
	;
	
bloqueStatement returns [List<Statement> ast = new ArrayList<Statement>()]
	: s=statement {$ast.addAll($s.ast);} 
	;

		
statement_if returns [StatementIf ast]
	: 'if ' e1=expression ':' b1=block  {$ast = new StatementIf($e1.ast,$b1.ast,new ArrayList(),$start.getLine(),$start.getCharPositionInLine()+1);} 
	| 'if ' e1=expression ':' b1=block 'else' b2=block {$ast = new StatementIf($e1.ast,$b1.ast,$b2.ast,$start.getLine(),$start.getCharPositionInLine()+1);} 
	| 'if ' e1=expression ':' b1=block 'elseif ' e2=expression b2=block {$ast = new StatementIf($e1.ast,$b1.ast,$b2.ast,$start.getLine(),$start.getCharPositionInLine()+1);} 
	| 'if ' e1=expression ':' b1=block 'elseif ' e2=expression b2=block 'else' b3=block 
		{ 
			List<Statement> bodyElseif = new ArrayList<Statement>();
			bodyElseif.add(new StatementIf($e2.ast,$b2.ast,$b3.ast,$e2.ast.getLine(),$e2.ast.getColumn()));
		
			$ast = new StatementIf($e1.ast,$b1.ast,bodyElseif,$start.getLine(),$start.getCharPositionInLine()+1);
		} 
	;


statement_while returns [StatementWhile ast]
	: 'while ' e2=expression ':'  b=block {$ast = new StatementWhile($start.getLine(),$start.getCharPositionInLine()+1,$e2.ast,$b.ast);}
	;
	
block returns [List<Statement> ast = new ArrayList<Statement>()]:
	'{' (s1=statement
			{
				for (Statement s: $s1.ast)
					$ast.add(s);
			})+
	'}'
	| s2=statement 
			{
				for (Statement s: $s2.ast)
					$ast.add(s);
			}
	
	;
statement_print returns [List<Statement> ast = new ArrayList<Statement>()]
	: 'print ' e1=expressions ';' 
		{
			for(Expression ex: $e1.ast)
				$ast.add(new StatementPrint($start.getLine(),$start.getCharPositionInLine()+1,ex));
		}
	;

statement_input returns [List<Statement> ast = new ArrayList<Statement>()]
	: 'input ' e1=expressions ';' 
		{
			for(Expression ex: $e1.ast)
				$ast.add(new StatementInput($start.getLine(),$start.getCharPositionInLine()+1,ex));
		}
	;

statement_assigment returns [StatementAssignment ast]
	: e1=expression '=' e2=expression {$ast = new StatementAssignment($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$e2.ast);} ';' 
	| e1=expression op=('++'| '--') {$ast = new StatementAssignment($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,new ExpressionArithmetic($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast,new ExpressionInt($e1.ast.getLine(),$e1.ast.getColumn(),1),$op.text));} ';'
	| e1=expression op=('+='| '-=' | '*=' | '/=') e2=expression {$ast = new StatementAssignment($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast, new ExpressionArithmetic($e2.ast.getLine(), $e2.ast.getColumn(),$e1.ast,$e2.ast,$op.text));} ';'
	| e1=expression op=('&&='|'||=') e2=expression {$ast = new StatementAssignment($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast, new ExpressionLogic($e2.ast.getLine(),$e2.ast.getColumn(),$e1.ast, $e2.ast, $op.text));} ';'
	| e1=expression op='^=' e2=expression {$ast = new StatementAssignment($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast, new ExpressionLogic($e2.ast.getLine(),$e2.ast.getColumn(),$e1.ast, $e2.ast, $op.text));} ';'
	;

statement_return returns [StatementReturn ast]
	: as='return' expression ';' {$ast = new StatementReturn($start.getLine(), $start.getCharPositionInLine()+1,$expression.ast);}
	;

expressions returns [List<Expression> ast = new ArrayList<Expression>()]
	: e1=expression{$ast.add($e1.ast);} (',' e2=expression{$ast.add($e2.ast);})*
	;
		
expression returns [Expression ast]: 
		'(' expression ')' {$ast = $expression.ast;}
		| le=expression '[' ri=expression ']' {$ast = new ExpressionAccessArray($le.ast.getLine(),$ri.ast.getColumn(),$le.ast,$ri.ast);}
		| e1=expression '.' ID {$ast = new ExpressionAccessField($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$ID.text);}
		| '(' typeSimple  ')' ex=expression {$ast = new ExpressionCast($ex.ast.getLine(),$ex.ast.getColumn(),$ex.ast, $typeSimple.ast);}
		| '-' ex=expression {$ast = new ExpressionUnary($ex.ast.getLine(),$ex.ast.getColumn(),$ex.ast);}
		| '!' ex=expression {$ast = new ExpressionNegation ($ex.ast.getLine(), $ex.ast.getColumn(),$ex.ast);}
		| le=expression O=('*'|'/'|'%') ri=expression {$ast = new ExpressionArithmetic($le.ast.getLine(),$le.ast.getColumn(),$le.ast,$ri.ast,$O.text);}
		| e1=expression O=('+'|'-') e2=expression {$ast = new ExpressionArithmetic($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$e2.ast,$O.text);}
		| e1=expression O=('>'|'>='|'<'|'<='|'!='|'==') e2=expression {$ast = new ExpressionComparison($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$e2.ast,$O.text);}
		| e1=expression O=('&&'|'||') e2=expression {$ast = new ExpressionLogic($e1.ast.getLine(),$e1.ast.getColumn(),$e2.ast,$e1.ast,$O.text);}   		
		| e1=expression '^' e2=expression {$ast = new ExpressionLogic($e1.ast.getLine(),$e1.ast.getColumn(), new ExpressionLogic($e1.ast.getLine(),$e1.ast.getColumn(),$e2.ast,new ExpressionUnary($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast),"&&"),new ExpressionLogic($e1.ast.getLine(),$e1.ast.getColumn(),new ExpressionUnary($e1.ast.getLine(),$e1.ast.getColumn(),$e2.ast),$e1.ast,"&&"),"||");}
		| e1=expression op=('++' | '--') {$ast = new ExpressionArithmetic($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast, new ExpressionInt($e1.ast.getLine(),$e1.ast.getColumn(),1), $op.text);}
		| funcInvocation {$ast = $funcInvocation.ast;}
		| INT_CONSTANT {$ast = new ExpressionInt($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text));}	
		| REAL_CONSTANT {$ast = new ExpressionReal($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal($REAL_CONSTANT.text));}	
		| CHAR_CONSTANT {$ast = new ExpressionChar($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
		| ID {$ast = new Identifier($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
		;
		
funcInvocation returns [ExpressionFunctionInvocation ast]
	: ID '(' expressionList ')' {$ast = new ExpressionFunctionInvocation($ID.getLine(),$ID.getCharPositionInLine()+1,new Identifier($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text), $expressionList.ast);} 
	;
		
expressionList returns [List<Expression> ast = new ArrayList<Expression>()]
	: e1=expression{$ast.add($e1.ast);} (',' e2=expression{$ast.add($e2.ast);})*
	| 
	;

type returns [Type ast] 
	: typeSimple {$ast = $typeSimple.ast;}
	| '[' INT_CONSTANT ']' arr_type=type {$ast = new TypeArray($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text),$arr_type.ast);}
	| 'struct' '{' fields '}' {$ast = new TypeRecord($start.getLine(), $start.getCharPositionInLine()+1,$fields.ast);}
	| 'void' {$ast = TypeVoid.getInstance();}
	;
	
fields returns [List<Field> ast = new ArrayList<Field>()]
	: (listIds ':' type ';'
		{
			for(Identifier id: $listIds.ast){
				Field f = new Field($start.getLine(), $start.getCharPositionInLine()+1,id.getIdentifier(),$type.ast);
				if(!$ast.contains(f))
					$ast.add(f);
				else {
					new ErrorType($start.getLine(), $start.getCharPositionInLine()+1,"Campo de struct duplicado: " + id.getIdentifier());
				}
			}		
		}	
	  )+
	;
	
typeSimple returns [Type ast] 
	: 'int' {$ast = TypeInt.getInstance();}
	| 'char' {$ast = TypeChar.getInstance();}
	| 'double' {$ast = TypeDouble.getInstance();}
	;
       
TRASH: [ \n\r\t] -> skip;

COMENTARIODEUNALINEA: '#' ~[\r\n\t]* ->skip;

COMENTARIODEVARIASLINEAS: '""" ' .*? '"""' ->skip; 
  		 
INT_CONSTANT: '0'|[1-9][0-9]* ;
           
REAL_CONSTANT: INT_CONSTANT ? '.' INT_CONSTANT 
			| INT_CONSTANT '.' 
			| INT_CONSTANT ('.' INT_CONSTANT)? [eE] [+-]? INT_CONSTANT;
            
CHAR_CONSTANT
			 : '\'' . '\'' 
				| '\'' '\\'[0-9][0-9][0-9] '\''
				| '\'' '\\n' '\''
				| '\'' '\\t' '\''
				| '\'' '-' '\'' 
				;

ID: [a-zA-Z_][a-zA-Z0-9_]*;


	