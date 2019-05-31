// Generated from src/parser/Pmm.g4 by ANTLR 4.7
package parser;

	import ast.*;
	import ast.types.*;
 	import ast.definitions.*;
 	import ast.expressions.*;
 	import ast.statements.*;
 	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		TRASH=39, COMENTARIODEUNALINEA=40, COMENTARIODEVARIASLINEAS=41, INT_CONSTANT=42, 
		REAL_CONSTANT=43, CHAR_CONSTANT=44, ID=45;
	public static final int
		RULE_program = 0, RULE_listDefinitions = 1, RULE_main = 2, RULE_body = 3, 
		RULE_var_definition = 4, RULE_listIds = 5, RULE_func_definition = 6, RULE_returnType = 7, 
		RULE_lista_parametros = 8, RULE_statement = 9, RULE_statement_if = 10, 
		RULE_statement_while = 11, RULE_block = 12, RULE_statement_print = 13, 
		RULE_statement_input = 14, RULE_statement_assigment = 15, RULE_statement_return = 16, 
		RULE_expressions = 17, RULE_expression = 18, RULE_funcInvocation = 19, 
		RULE_expressionList = 20, RULE_type = 21, RULE_fields = 22, RULE_typeSimple = 23;
	public static final String[] ruleNames = {
		"program", "listDefinitions", "main", "body", "var_definition", "listIds", 
		"func_definition", "returnType", "lista_parametros", "statement", "statement_if", 
		"statement_while", "block", "statement_print", "statement_input", "statement_assigment", 
		"statement_return", "expressions", "expression", "funcInvocation", "expressionList", 
		"type", "fields", "typeSimple"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def '", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "','", 
		"'if '", "'else'", "'while '", "'print '", "'input '", "'='", "'return'", 
		"'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", 
		"'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'struct'", "'void'", 
		"'int'", "'char'", "'double'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TRASH", "COMENTARIODEUNALINEA", "COMENTARIODEVARIASLINEAS", 
		"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ListDefinitionsContext l1;
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public ListDefinitionsContext listDefinitions() {
			return getRuleContext(ListDefinitionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((ProgramContext)_localctx).l1 = listDefinitions();
			setState(49);
			((ProgramContext)_localctx).main = main();
			setState(50);
			match(EOF);

					List<Definition> definitions = ((ProgramContext)_localctx).l1.ast;
					definitions.add(((ProgramContext)_localctx).main.ast);
					((ProgramContext)_localctx).ast =  new Program(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1, definitions);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListDefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Var_definitionContext var_definition;
		public Func_definitionContext func_definition;
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<Func_definitionContext> func_definition() {
			return getRuleContexts(Func_definitionContext.class);
		}
		public Func_definitionContext func_definition(int i) {
			return getRuleContext(Func_definitionContext.class,i);
		}
		public ListDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDefinitions; }
	}

	public final ListDefinitionsContext listDefinitions() throws RecognitionException {
		ListDefinitionsContext _localctx = new ListDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listDefinitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(59);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(53);
						((ListDefinitionsContext)_localctx).var_definition = var_definition();
						_localctx.ast.addAll(((ListDefinitionsContext)_localctx).var_definition.ast);
						}
						break;
					case T__0:
						{
						setState(56);
						((ListDefinitionsContext)_localctx).func_definition = func_definition();
						_localctx.ast.add(((ListDefinitionsContext)_localctx).func_definition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public Definition ast;
		public BodyContext body;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			match(T__1);
			setState(66);
			match(T__2);
			setState(67);
			match(T__3);
			setState(68);
			match(T__4);
			setState(69);
			match(T__5);
			setState(70);
			((MainContext)_localctx).body = body();
			setState(71);
			match(T__6);
			((MainContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,"main", 
				new TypeFunction(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,TypeVoid.getInstance(),new ArrayList()),((MainContext)_localctx).body.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Var_definitionContext var_definition;
		public StatementContext statement;
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					((BodyContext)_localctx).var_definition = var_definition();
					 
								for(VarDefinition v: ((BodyContext)_localctx).var_definition.ast)
									_localctx.ast.add(v);
							
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(82);
				((BodyContext)_localctx).statement = statement();

							for(Statement s: ((BodyContext)_localctx).statement.ast)
								_localctx.ast.add(s);
						
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_definitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public ListIdsContext listIds;
		public TypeContext type;
		public ListIdsContext listIds() {
			return getRuleContext(ListIdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((Var_definitionContext)_localctx).listIds = listIds();
			setState(91);
			match(T__4);
			setState(92);
			((Var_definitionContext)_localctx).type = type();
			setState(93);
			match(T__7);

					for(Identifier id : ((Var_definitionContext)_localctx).listIds.ast) 
						_localctx.ast.add(new VarDefinition(((Var_definitionContext)_localctx).type.ast,id.getIdentifier(),id.getLine(),id.getColumn()));
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIdsContext extends ParserRuleContext {
		public List<Identifier> ast = new ArrayList<Identifier>();
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public ListIdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIds; }
	}

	public final ListIdsContext listIds() throws RecognitionException {
		ListIdsContext _localctx = new ListIdsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listIds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((ListIdsContext)_localctx).ID = match(ID);
			_localctx.ast.add(new Identifier(((ListIdsContext)_localctx).ID.getLine(),((ListIdsContext)_localctx).ID.getCharPositionInLine()+1,(((ListIdsContext)_localctx).ID!=null?((ListIdsContext)_localctx).ID.getText():null)));
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(98);
				match(T__8);
				setState(99);
				((ListIdsContext)_localctx).ID = match(ID);

							Identifier idN = new Identifier(((ListIdsContext)_localctx).ID.getLine(),((ListIdsContext)_localctx).ID.getCharPositionInLine()+1,(((ListIdsContext)_localctx).ID!=null?((ListIdsContext)_localctx).ID.getText():null)); 
							if(!_localctx.ast.contains(idN)){
								_localctx.ast.add(idN);
							}
							else {
								new ErrorType(((ListIdsContext)_localctx).ID.getLine(),((ListIdsContext)_localctx).ID.getCharPositionInLine()+1,"Campo de ids duplicado" + idN.getIdentifier());
							}		
						
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_definitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token ID;
		public Lista_parametrosContext lista_parametros;
		public ReturnTypeContext returnType;
		public BodyContext body;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__0);
			setState(107);
			((Func_definitionContext)_localctx).ID = match(ID);
			setState(108);
			match(T__2);
			setState(109);
			((Func_definitionContext)_localctx).lista_parametros = lista_parametros();
			setState(110);
			match(T__3);
			setState(111);
			match(T__4);
			setState(112);
			((Func_definitionContext)_localctx).returnType = returnType();
			setState(113);
			match(T__5);
			setState(114);
			((Func_definitionContext)_localctx).body = body();
			setState(115);
			match(T__6);
			((Func_definitionContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((Func_definitionContext)_localctx).ID!=null?((Func_definitionContext)_localctx).ID.getText():null),
				new TypeFunction(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,((Func_definitionContext)_localctx).returnType.ast,((Func_definitionContext)_localctx).lista_parametros.ast),((Func_definitionContext)_localctx).body.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public Type ast;
		public TypeSimpleContext typeSimple;
		public TypeSimpleContext typeSimple() {
			return getRuleContext(TypeSimpleContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				((ReturnTypeContext)_localctx).ast =  TypeVoid.getInstance() ;
				}
				break;
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((ReturnTypeContext)_localctx).typeSimple = typeSimple();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).typeSimple.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_parametrosContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token ID;
		public TypeSimpleContext t;
		public TypeSimpleContext t2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypeSimpleContext> typeSimple() {
			return getRuleContexts(TypeSimpleContext.class);
		}
		public TypeSimpleContext typeSimple(int i) {
			return getRuleContext(TypeSimpleContext.class,i);
		}
		public Lista_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros; }
	}

	public final Lista_parametrosContext lista_parametros() throws RecognitionException {
		Lista_parametrosContext _localctx = new Lista_parametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista_parametros);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(125);
				((Lista_parametrosContext)_localctx).ID = match(ID);
				setState(126);
				match(T__4);
				setState(127);
				((Lista_parametrosContext)_localctx).t = typeSimple();
				}
				_localctx.ast.add(new VarDefinition(((Lista_parametrosContext)_localctx).t.ast,(((Lista_parametrosContext)_localctx).ID!=null?((Lista_parametrosContext)_localctx).ID.getText():null),((Lista_parametrosContext)_localctx).ID.getLine(),((Lista_parametrosContext)_localctx).ID.getCharPositionInLine()+1));
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(130);
					match(T__8);
					setState(131);
					((Lista_parametrosContext)_localctx).ID = match(ID);
					setState(132);
					match(T__4);
					setState(133);
					((Lista_parametrosContext)_localctx).t2 = typeSimple();
					_localctx.ast.add(new VarDefinition(((Lista_parametrosContext)_localctx).t2.ast,(((Lista_parametrosContext)_localctx).ID!=null?((Lista_parametrosContext)_localctx).ID.getText():null),((Lista_parametrosContext)_localctx).ID.getLine(),((Lista_parametrosContext)_localctx).ID.getCharPositionInLine()+1));
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Statement_ifContext statement_if;
		public Statement_whileContext statement_while;
		public Statement_printContext statement_print;
		public Statement_inputContext statement_input;
		public FuncInvocationContext f;
		public Statement_assigmentContext statement_assigment;
		public Statement_returnContext statement_return;
		public Statement_ifContext statement_if() {
			return getRuleContext(Statement_ifContext.class,0);
		}
		public Statement_whileContext statement_while() {
			return getRuleContext(Statement_whileContext.class,0);
		}
		public Statement_printContext statement_print() {
			return getRuleContext(Statement_printContext.class,0);
		}
		public Statement_inputContext statement_input() {
			return getRuleContext(Statement_inputContext.class,0);
		}
		public FuncInvocationContext funcInvocation() {
			return getRuleContext(FuncInvocationContext.class,0);
		}
		public Statement_assigmentContext statement_assigment() {
			return getRuleContext(Statement_assigmentContext.class,0);
		}
		public Statement_returnContext statement_return() {
			return getRuleContext(Statement_returnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				((StatementContext)_localctx).statement_if = statement_if();
				_localctx.ast.add(((StatementContext)_localctx).statement_if.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				((StatementContext)_localctx).statement_while = statement_while();
				_localctx.ast.add(((StatementContext)_localctx).statement_while.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				((StatementContext)_localctx).statement_print = statement_print();
				_localctx.ast.addAll(((StatementContext)_localctx).statement_print.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				((StatementContext)_localctx).statement_input = statement_input();
				_localctx.ast.addAll(((StatementContext)_localctx).statement_input.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				((StatementContext)_localctx).f = funcInvocation();
				setState(156);
				match(T__7);
				_localctx.ast.add(((StatementContext)_localctx).f.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				((StatementContext)_localctx).statement_assigment = statement_assigment();
				_localctx.ast.add(((StatementContext)_localctx).statement_assigment.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				((StatementContext)_localctx).statement_return = statement_return();
				_localctx.ast.add(((StatementContext)_localctx).statement_return.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_ifContext extends ParserRuleContext {
		public StatementIf ast;
		public ExpressionContext e1;
		public BlockContext b1;
		public BlockContext b2;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Statement_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_if; }
	}

	public final Statement_ifContext statement_if() throws RecognitionException {
		Statement_ifContext _localctx = new Statement_ifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement_if);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__9);
				setState(168);
				((Statement_ifContext)_localctx).e1 = expression(0);
				setState(169);
				match(T__4);
				setState(170);
				((Statement_ifContext)_localctx).b1 = block();
				((Statement_ifContext)_localctx).ast =  new StatementIf(((Statement_ifContext)_localctx).e1.ast,((Statement_ifContext)_localctx).b1.ast,new ArrayList(),_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__9);
				setState(174);
				((Statement_ifContext)_localctx).e1 = expression(0);
				setState(175);
				match(T__4);
				setState(176);
				((Statement_ifContext)_localctx).b1 = block();
				setState(177);
				match(T__10);
				setState(178);
				((Statement_ifContext)_localctx).b2 = block();
				((Statement_ifContext)_localctx).ast =  new StatementIf(((Statement_ifContext)_localctx).e1.ast,((Statement_ifContext)_localctx).b1.ast,((Statement_ifContext)_localctx).b2.ast,_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_whileContext extends ParserRuleContext {
		public StatementWhile ast;
		public ExpressionContext e2;
		public BlockContext b;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Statement_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_while; }
	}

	public final Statement_whileContext statement_while() throws RecognitionException {
		Statement_whileContext _localctx = new Statement_whileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__11);
			setState(184);
			((Statement_whileContext)_localctx).e2 = expression(0);
			setState(185);
			match(T__4);
			setState(186);
			((Statement_whileContext)_localctx).b = block();
			((Statement_whileContext)_localctx).ast =  new StatementWhile(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((Statement_whileContext)_localctx).e2.ast,((Statement_whileContext)_localctx).b.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext s1;
		public StatementContext s2;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__5);
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					((BlockContext)_localctx).s1 = statement();

									for (Statement s: ((BlockContext)_localctx).s1.ast)
										_localctx.ast.add(s);
								
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
				setState(197);
				match(T__6);
				}
				break;
			case T__2:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__19:
			case T__20:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((BlockContext)_localctx).s2 = statement();

								for (Statement s: ((BlockContext)_localctx).s2.ast)
									_localctx.ast.add(s);
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_printContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public ExpressionsContext e1;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Statement_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_print; }
	}

	public final Statement_printContext statement_print() throws RecognitionException {
		Statement_printContext _localctx = new Statement_printContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__12);
			setState(205);
			((Statement_printContext)_localctx).e1 = expressions();
			setState(206);
			match(T__7);

						for(Expression ex: ((Statement_printContext)_localctx).e1.ast)
							_localctx.ast.add(new StatementPrint(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,ex));
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_inputContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public ExpressionsContext e1;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Statement_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_input; }
	}

	public final Statement_inputContext statement_input() throws RecognitionException {
		Statement_inputContext _localctx = new Statement_inputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__13);
			setState(210);
			((Statement_inputContext)_localctx).e1 = expressions();
			setState(211);
			match(T__7);

						for(Expression ex: ((Statement_inputContext)_localctx).e1.ast)
							_localctx.ast.add(new StatementInput(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,ex));
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_assigmentContext extends ParserRuleContext {
		public StatementAssignment ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Statement_assigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_assigment; }
	}

	public final Statement_assigmentContext statement_assigment() throws RecognitionException {
		Statement_assigmentContext _localctx = new Statement_assigmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((Statement_assigmentContext)_localctx).e1 = expression(0);
			setState(215);
			match(T__14);
			setState(216);
			((Statement_assigmentContext)_localctx).e2 = expression(0);
			((Statement_assigmentContext)_localctx).ast =  new StatementAssignment(((Statement_assigmentContext)_localctx).e1.ast.getLine(),((Statement_assigmentContext)_localctx).e1.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast,((Statement_assigmentContext)_localctx).e2.ast);
			setState(218);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_returnContext extends ParserRuleContext {
		public StatementReturn ast;
		public Token as;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_return; }
	}

	public final Statement_returnContext statement_return() throws RecognitionException {
		Statement_returnContext _localctx = new Statement_returnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((Statement_returnContext)_localctx).as = match(T__15);
			setState(221);
			((Statement_returnContext)_localctx).expression = expression(0);
			setState(222);
			match(T__7);
			((Statement_returnContext)_localctx).ast =  new StatementReturn(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,((Statement_returnContext)_localctx).expression.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((ExpressionsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ExpressionsContext)_localctx).e1.ast);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(227);
				match(T__8);
				setState(228);
				((ExpressionsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).e2.ast);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext le;
		public ExpressionContext e1;
		public ExpressionContext expression;
		public TypeSimpleContext typeSimple;
		public ExpressionContext ex;
		public FuncInvocationContext funcInvocation;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public Token O;
		public ExpressionContext ri;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeSimpleContext typeSimple() {
			return getRuleContext(TypeSimpleContext.class,0);
		}
		public FuncInvocationContext funcInvocation() {
			return getRuleContext(FuncInvocationContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(237);
				match(T__2);
				setState(238);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(239);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 2:
				{
				setState(242);
				match(T__2);
				setState(243);
				((ExpressionContext)_localctx).typeSimple = typeSimple();
				setState(244);
				match(T__3);
				setState(245);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(12);
				((ExpressionContext)_localctx).ast =  new ExpressionCast(((ExpressionContext)_localctx).ex.ast.getLine(),((ExpressionContext)_localctx).ex.ast.getColumn(),((ExpressionContext)_localctx).ex.ast, ((ExpressionContext)_localctx).typeSimple.ast);
				}
				break;
			case 3:
				{
				setState(248);
				match(T__19);
				setState(249);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(11);
				((ExpressionContext)_localctx).ast =  new ExpressionUnary(((ExpressionContext)_localctx).ex.ast.getLine(),((ExpressionContext)_localctx).ex.ast.getColumn(),((ExpressionContext)_localctx).ex.ast);
				}
				break;
			case 4:
				{
				setState(252);
				match(T__20);
				setState(253);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(10);
				((ExpressionContext)_localctx).ast =  new ExpressionNegation (((ExpressionContext)_localctx).ex.ast.getLine(), ((ExpressionContext)_localctx).ex.ast.getColumn(),((ExpressionContext)_localctx).ex.ast);
				}
				break;
			case 5:
				{
				setState(256);
				((ExpressionContext)_localctx).funcInvocation = funcInvocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).funcInvocation.ast;
				}
				break;
			case 6:
				{
				setState(259);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ExpressionInt(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(261);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ExpressionReal(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(263);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ExpressionChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(265);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Identifier(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.le = _prevctx;
						_localctx.le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(270);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						((ExpressionContext)_localctx).ri = ((ExpressionContext)_localctx).expression = expression(10);
						((ExpressionContext)_localctx).ast =  new ExpressionArithmetic(((ExpressionContext)_localctx).le.ast.getLine(),((ExpressionContext)_localctx).le.ast.getColumn(),((ExpressionContext)_localctx).le.ast,((ExpressionContext)_localctx).ri.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(275);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(276);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);
						((ExpressionContext)_localctx).ast =  new ExpressionArithmetic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(280);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);
						((ExpressionContext)_localctx).ast =  new ExpressionComparison(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(285);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);
						((ExpressionContext)_localctx).ast =  new ExpressionLogic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e2.ast,((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.le = _prevctx;
						_localctx.le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(290);
						match(T__16);
						setState(291);
						((ExpressionContext)_localctx).ri = ((ExpressionContext)_localctx).expression = expression(0);
						setState(292);
						match(T__17);
						((ExpressionContext)_localctx).ast =  new ExpressionAccessArray(((ExpressionContext)_localctx).le.ast.getLine(),((ExpressionContext)_localctx).ri.ast.getColumn(),((ExpressionContext)_localctx).le.ast,((ExpressionContext)_localctx).ri.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(296);
						match(T__18);
						setState(297);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new ExpressionAccessField(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncInvocationContext extends ParserRuleContext {
		public ExpressionFunctionInvocation ast;
		public Token ID;
		public ExpressionListContext expressionList;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FuncInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvocation; }
	}

	public final FuncInvocationContext funcInvocation() throws RecognitionException {
		FuncInvocationContext _localctx = new FuncInvocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((FuncInvocationContext)_localctx).ID = match(ID);
			setState(305);
			match(T__2);
			setState(306);
			((FuncInvocationContext)_localctx).expressionList = expressionList();
			setState(307);
			match(T__3);
			((FuncInvocationContext)_localctx).ast =  new ExpressionFunctionInvocation(((FuncInvocationContext)_localctx).ID.getLine(),((FuncInvocationContext)_localctx).ID.getCharPositionInLine()+1,new Identifier(((FuncInvocationContext)_localctx).ID.getLine(),((FuncInvocationContext)_localctx).ID.getCharPositionInLine()+1,(((FuncInvocationContext)_localctx).ID!=null?((FuncInvocationContext)_localctx).ID.getText():null)), ((FuncInvocationContext)_localctx).expressionList.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionList);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__19:
			case T__20:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((ExpressionListContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionListContext)_localctx).e1.ast);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(312);
					match(T__8);
					setState(313);
					((ExpressionListContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ExpressionListContext)_localctx).e2.ast);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeSimpleContext typeSimple;
		public Token INT_CONSTANT;
		public TypeContext arr_type;
		public FieldsContext fields;
		public TypeSimpleContext typeSimple() {
			return getRuleContext(TypeSimpleContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				((TypeContext)_localctx).typeSimple = typeSimple();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).typeSimple.ast;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(T__16);
				setState(328);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(329);
				match(T__17);
				setState(330);
				((TypeContext)_localctx).arr_type = type();
				((TypeContext)_localctx).ast =  new TypeArray(((TypeContext)_localctx).INT_CONSTANT.getLine(),((TypeContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).arr_type.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(T__33);
				setState(334);
				match(T__5);
				setState(335);
				((TypeContext)_localctx).fields = fields();
				setState(336);
				match(T__6);
				((TypeContext)_localctx).ast =  new TypeRecord(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,((TypeContext)_localctx).fields.ast);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				match(T__34);
				((TypeContext)_localctx).ast =  TypeVoid.getInstance();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsContext extends ParserRuleContext {
		public List<Field> ast = new ArrayList<Field>();
		public ListIdsContext listIds;
		public TypeContext type;
		public List<ListIdsContext> listIds() {
			return getRuleContexts(ListIdsContext.class);
		}
		public ListIdsContext listIds(int i) {
			return getRuleContext(ListIdsContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				((FieldsContext)_localctx).listIds = listIds();
				setState(344);
				match(T__4);
				setState(345);
				((FieldsContext)_localctx).type = type();
				setState(346);
				match(T__7);

							for(Identifier id: ((FieldsContext)_localctx).listIds.ast){
								Field f = new Field(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,id.getIdentifier(),((FieldsContext)_localctx).type.ast);
								if(!_localctx.ast.contains(f))
									_localctx.ast.add(f);
								else {
									new ErrorType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,"Campo de struct duplicado: " + id.getIdentifier());
								}
							}		
						
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSimpleContext extends ParserRuleContext {
		public Type ast;
		public TypeSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSimple; }
	}

	public final TypeSimpleContext typeSimple() throws RecognitionException {
		TypeSimpleContext _localctx = new TypeSimpleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeSimple);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(T__35);
				((TypeSimpleContext)_localctx).ast =  TypeInt.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(T__36);
				((TypeSimpleContext)_localctx).ast =  TypeChar.getInstance();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(T__37);
				((TypeSimpleContext)_localctx).ast =  TypeDouble.getInstance();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S"+
		"\13\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\5\n\u0090\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u00c4\n\16\r\16\16\16\u00c5\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00cd\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ea\n\23\f\23\16\23\u00ed\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u010e\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u012e\n\24\f\24\16\24\u0131"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u013f\n\26\f\26\16\26\u0142\13\26\3\26\5\26\u0145\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0158\n\27\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0160\n\30\r\30\16"+
		"\30\u0161\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016a\n\31\3\31\2\3&\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\30\32\4\2\26"+
		"\26\33\33\3\2\34!\3\2\"#\2\u017b\2\62\3\2\2\2\4?\3\2\2\2\6B\3\2\2\2\b"+
		"Q\3\2\2\2\n\\\3\2\2\2\fb\3\2\2\2\16l\3\2\2\2\20|\3\2\2\2\22\u008f\3\2"+
		"\2\2\24\u00a7\3\2\2\2\26\u00b7\3\2\2\2\30\u00b9\3\2\2\2\32\u00cc\3\2\2"+
		"\2\34\u00ce\3\2\2\2\36\u00d3\3\2\2\2 \u00d8\3\2\2\2\"\u00de\3\2\2\2$\u00e3"+
		"\3\2\2\2&\u010d\3\2\2\2(\u0132\3\2\2\2*\u0144\3\2\2\2,\u0157\3\2\2\2."+
		"\u015f\3\2\2\2\60\u0169\3\2\2\2\62\63\5\4\3\2\63\64\5\6\4\2\64\65\7\2"+
		"\2\3\65\66\b\2\1\2\66\3\3\2\2\2\678\5\n\6\289\b\3\1\29>\3\2\2\2:;\5\16"+
		"\b\2;<\b\3\1\2<>\3\2\2\2=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3"+
		"\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\7\3\2\2CD\7\4\2\2DE\7\5\2\2EF\7\6\2\2FG"+
		"\7\7\2\2GH\7\b\2\2HI\5\b\5\2IJ\7\t\2\2JK\b\4\1\2K\7\3\2\2\2LM\5\n\6\2"+
		"MN\b\5\1\2NP\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RY\3\2\2\2"+
		"SQ\3\2\2\2TU\5\24\13\2UV\b\5\1\2VX\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2\2\\]\5\f\7\2]^\7\7\2\2^_\5,\27\2_`\7\n"+
		"\2\2`a\b\6\1\2a\13\3\2\2\2bc\7/\2\2ci\b\7\1\2de\7\13\2\2ef\7/\2\2fh\b"+
		"\7\1\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2lm"+
		"\7\3\2\2mn\7/\2\2no\7\5\2\2op\5\22\n\2pq\7\6\2\2qr\7\7\2\2rs\5\20\t\2"+
		"st\7\b\2\2tu\5\b\5\2uv\7\t\2\2vw\b\b\1\2w\17\3\2\2\2x}\b\t\1\2yz\5\60"+
		"\31\2z{\b\t\1\2{}\3\2\2\2|x\3\2\2\2|y\3\2\2\2}\21\3\2\2\2~\u0090\3\2\2"+
		"\2\177\u0080\7/\2\2\u0080\u0081\7\7\2\2\u0081\u0082\5\60\31\2\u0082\u0083"+
		"\3\2\2\2\u0083\u008c\b\n\1\2\u0084\u0085\7\13\2\2\u0085\u0086\7/\2\2\u0086"+
		"\u0087\7\7\2\2\u0087\u0088\5\60\31\2\u0088\u0089\b\n\1\2\u0089\u008b\3"+
		"\2\2\2\u008a\u0084\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f~\3\2\2\2"+
		"\u008f\177\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\b"+
		"\13\1\2\u0093\u00a8\3\2\2\2\u0094\u0095\5\30\r\2\u0095\u0096\b\13\1\2"+
		"\u0096\u00a8\3\2\2\2\u0097\u0098\5\34\17\2\u0098\u0099\b\13\1\2\u0099"+
		"\u00a8\3\2\2\2\u009a\u009b\5\36\20\2\u009b\u009c\b\13\1\2\u009c\u00a8"+
		"\3\2\2\2\u009d\u009e\5(\25\2\u009e\u009f\7\n\2\2\u009f\u00a0\b\13\1\2"+
		"\u00a0\u00a8\3\2\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\b\13\1\2\u00a3\u00a8"+
		"\3\2\2\2\u00a4\u00a5\5\"\22\2\u00a5\u00a6\b\13\1\2\u00a6\u00a8\3\2\2\2"+
		"\u00a7\u0091\3\2\2\2\u00a7\u0094\3\2\2\2\u00a7\u0097\3\2\2\2\u00a7\u009a"+
		"\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8"+
		"\25\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\7\7\2"+
		"\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\b\f\1\2\u00ae\u00b8\3\2\2\2\u00af"+
		"\u00b0\7\f\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5\32"+
		"\16\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\b\f\1\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00af\3\2\2\2\u00b8\27\3\2\2"+
		"\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\5&\24\2\u00bb\u00bc\7\7\2\2\u00bc"+
		"\u00bd\5\32\16\2\u00bd\u00be\b\r\1\2\u00be\31\3\2\2\2\u00bf\u00c3\7\b"+
		"\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\b\16\1\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00cd\3\2\2\2\u00c9"+
		"\u00ca\5\24\13\2\u00ca\u00cb\b\16\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00bf"+
		"\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\7\17\2\2\u00cf"+
		"\u00d0\5$\23\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2\b\17\1\2\u00d2\35\3\2\2"+
		"\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\5$\23\2\u00d5\u00d6\7\n\2\2\u00d6"+
		"\u00d7\b\20\1\2\u00d7\37\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\7\21"+
		"\2\2\u00da\u00db\5&\24\2\u00db\u00dc\b\21\1\2\u00dc\u00dd\7\n\2\2\u00dd"+
		"!\3\2\2\2\u00de\u00df\7\22\2\2\u00df\u00e0\5&\24\2\u00e0\u00e1\7\n\2\2"+
		"\u00e1\u00e2\b\22\1\2\u00e2#\3\2\2\2\u00e3\u00e4\5&\24\2\u00e4\u00eb\b"+
		"\23\1\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8\b\23\1\2"+
		"\u00e8\u00ea\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec%\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\b\24\1\2\u00ef\u00f0\7\5\2\2\u00f0\u00f1\5&\24\2\u00f1\u00f2\7"+
		"\6\2\2\u00f2\u00f3\b\24\1\2\u00f3\u010e\3\2\2\2\u00f4\u00f5\7\5\2\2\u00f5"+
		"\u00f6\5\60\31\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\5&\24\16\u00f8\u00f9"+
		"\b\24\1\2\u00f9\u010e\3\2\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\5&\24\r"+
		"\u00fc\u00fd\b\24\1\2\u00fd\u010e\3\2\2\2\u00fe\u00ff\7\27\2\2\u00ff\u0100"+
		"\5&\24\f\u0100\u0101\b\24\1\2\u0101\u010e\3\2\2\2\u0102\u0103\5(\25\2"+
		"\u0103\u0104\b\24\1\2\u0104\u010e\3\2\2\2\u0105\u0106\7,\2\2\u0106\u010e"+
		"\b\24\1\2\u0107\u0108\7-\2\2\u0108\u010e\b\24\1\2\u0109\u010a\7.\2\2\u010a"+
		"\u010e\b\24\1\2\u010b\u010c\7/\2\2\u010c\u010e\b\24\1\2\u010d\u00ee\3"+
		"\2\2\2\u010d\u00f4\3\2\2\2\u010d\u00fa\3\2\2\2\u010d\u00fe\3\2\2\2\u010d"+
		"\u0102\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u012f\3\2\2\2\u010f\u0110\f\13\2\2\u0110"+
		"\u0111\t\2\2\2\u0111\u0112\5&\24\f\u0112\u0113\b\24\1\2\u0113\u012e\3"+
		"\2\2\2\u0114\u0115\f\n\2\2\u0115\u0116\t\3\2\2\u0116\u0117\5&\24\13\u0117"+
		"\u0118\b\24\1\2\u0118\u012e\3\2\2\2\u0119\u011a\f\t\2\2\u011a\u011b\t"+
		"\4\2\2\u011b\u011c\5&\24\n\u011c\u011d\b\24\1\2\u011d\u012e\3\2\2\2\u011e"+
		"\u011f\f\b\2\2\u011f\u0120\t\5\2\2\u0120\u0121\5&\24\t\u0121\u0122\b\24"+
		"\1\2\u0122\u012e\3\2\2\2\u0123\u0124\f\20\2\2\u0124\u0125\7\23\2\2\u0125"+
		"\u0126\5&\24\2\u0126\u0127\7\24\2\2\u0127\u0128\b\24\1\2\u0128\u012e\3"+
		"\2\2\2\u0129\u012a\f\17\2\2\u012a\u012b\7\25\2\2\u012b\u012c\7/\2\2\u012c"+
		"\u012e\b\24\1\2\u012d\u010f\3\2\2\2\u012d\u0114\3\2\2\2\u012d\u0119\3"+
		"\2\2\2\u012d\u011e\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u0129\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\'\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0132\u0133\7/\2\2\u0133\u0134\7\5\2\2\u0134\u0135"+
		"\5*\26\2\u0135\u0136\7\6\2\2\u0136\u0137\b\25\1\2\u0137)\3\2\2\2\u0138"+
		"\u0139\5&\24\2\u0139\u0140\b\26\1\2\u013a\u013b\7\13\2\2\u013b\u013c\5"+
		"&\24\2\u013c\u013d\b\26\1\2\u013d\u013f\3\2\2\2\u013e\u013a\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0145\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0138\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145+\3\2\2\2\u0146\u0147\5\60\31\2\u0147\u0148\b\27\1"+
		"\2\u0148\u0158\3\2\2\2\u0149\u014a\7\23\2\2\u014a\u014b\7,\2\2\u014b\u014c"+
		"\7\24\2\2\u014c\u014d\5,\27\2\u014d\u014e\b\27\1\2\u014e\u0158\3\2\2\2"+
		"\u014f\u0150\7$\2\2\u0150\u0151\7\b\2\2\u0151\u0152\5.\30\2\u0152\u0153"+
		"\7\t\2\2\u0153\u0154\b\27\1\2\u0154\u0158\3\2\2\2\u0155\u0156\7%\2\2\u0156"+
		"\u0158\b\27\1\2\u0157\u0146\3\2\2\2\u0157\u0149\3\2\2\2\u0157\u014f\3"+
		"\2\2\2\u0157\u0155\3\2\2\2\u0158-\3\2\2\2\u0159\u015a\5\f\7\2\u015a\u015b"+
		"\7\7\2\2\u015b\u015c\5,\27\2\u015c\u015d\7\n\2\2\u015d\u015e\b\30\1\2"+
		"\u015e\u0160\3\2\2\2\u015f\u0159\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162/\3\2\2\2\u0163\u0164\7&\2\2\u0164\u016a"+
		"\b\31\1\2\u0165\u0166\7\'\2\2\u0166\u016a\b\31\1\2\u0167\u0168\7(\2\2"+
		"\u0168\u016a\b\31\1\2\u0169\u0163\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u016a\61\3\2\2\2\27=?QYi|\u008c\u008f\u00a7\u00b7\u00c5\u00cc"+
		"\u00eb\u010d\u012d\u012f\u0140\u0144\u0157\u0161\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}