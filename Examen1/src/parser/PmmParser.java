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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, TRASH=52, 
		COMENTARIODEUNALINEA=53, COMENTARIODEVARIASLINEAS=54, INT_CONSTANT=55, 
		REAL_CONSTANT=56, CHAR_CONSTANT=57, ID=58;
	public static final int
		RULE_program = 0, RULE_listDefinitions = 1, RULE_main = 2, RULE_body = 3, 
		RULE_var_definition = 4, RULE_listIds = 5, RULE_func_definition = 6, RULE_returnType = 7, 
		RULE_lista_parametros = 8, RULE_statement = 9, RULE_statement_do_while = 10, 
		RULE_statement_ternary = 11, RULE_bloqueStatement = 12, RULE_statement_if = 13, 
		RULE_statement_while = 14, RULE_block = 15, RULE_statement_print = 16, 
		RULE_statement_input = 17, RULE_statement_assigment = 18, RULE_statement_return = 19, 
		RULE_expressions = 20, RULE_expression = 21, RULE_funcInvocation = 22, 
		RULE_expressionList = 23, RULE_type = 24, RULE_fields = 25, RULE_typeSimple = 26;
	public static final String[] ruleNames = {
		"program", "listDefinitions", "main", "body", "var_definition", "listIds", 
		"func_definition", "returnType", "lista_parametros", "statement", "statement_do_while", 
		"statement_ternary", "bloqueStatement", "statement_if", "statement_while", 
		"block", "statement_print", "statement_input", "statement_assigment", 
		"statement_return", "expressions", "expression", "funcInvocation", "expressionList", 
		"type", "fields", "typeSimple"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def '", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "','", 
		"'do'", "'while '", "'?'", "'if '", "'else'", "'elseif '", "'print '", 
		"'input '", "'='", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&&='", 
		"'||='", "'^='", "'return'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", 
		"'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
		"'||'", "'^'", "'struct'", "'void'", "'int'", "'char'", "'double'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "TRASH", "COMENTARIODEUNALINEA", "COMENTARIODEVARIASLINEAS", 
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
			setState(54);
			((ProgramContext)_localctx).l1 = listDefinitions();
			setState(55);
			((ProgramContext)_localctx).main = main();
			setState(56);
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
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(65);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(59);
						((ListDefinitionsContext)_localctx).var_definition = var_definition();
						_localctx.ast.addAll(((ListDefinitionsContext)_localctx).var_definition.ast);
						}
						break;
					case T__0:
						{
						setState(62);
						((ListDefinitionsContext)_localctx).func_definition = func_definition();
						_localctx.ast.add(((ListDefinitionsContext)_localctx).func_definition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(69);
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
			setState(70);
			match(T__0);
			setState(71);
			match(T__1);
			setState(72);
			match(T__2);
			setState(73);
			match(T__3);
			setState(74);
			match(T__4);
			setState(75);
			match(T__5);
			setState(76);
			((MainContext)_localctx).body = body();
			setState(77);
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
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					((BodyContext)_localctx).var_definition = var_definition();
					 
								for(VarDefinition v: ((BodyContext)_localctx).var_definition.ast)
									_localctx.ast.add(v);
							
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__27) | (1L << T__31) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				((BodyContext)_localctx).statement = statement();

							for(Statement s: ((BodyContext)_localctx).statement.ast)
								_localctx.ast.add(s);
						
				}
				}
				setState(95);
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
			setState(96);
			((Var_definitionContext)_localctx).listIds = listIds();
			setState(97);
			match(T__4);
			setState(98);
			((Var_definitionContext)_localctx).type = type();
			setState(99);
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
			setState(102);
			((ListIdsContext)_localctx).ID = match(ID);
			_localctx.ast.add(new Identifier(((ListIdsContext)_localctx).ID.getLine(),((ListIdsContext)_localctx).ID.getCharPositionInLine()+1,(((ListIdsContext)_localctx).ID!=null?((ListIdsContext)_localctx).ID.getText():null)));
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(104);
				match(T__8);
				setState(105);
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
				setState(111);
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
			setState(112);
			match(T__0);
			setState(113);
			((Func_definitionContext)_localctx).ID = match(ID);
			setState(114);
			match(T__2);
			setState(115);
			((Func_definitionContext)_localctx).lista_parametros = lista_parametros();
			setState(116);
			match(T__3);
			setState(117);
			match(T__4);
			setState(118);
			((Func_definitionContext)_localctx).returnType = returnType();
			setState(119);
			match(T__5);
			setState(120);
			((Func_definitionContext)_localctx).body = body();
			setState(121);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				((ReturnTypeContext)_localctx).ast =  TypeVoid.getInstance() ;
				}
				break;
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
			setState(147);
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
				setState(131);
				((Lista_parametrosContext)_localctx).ID = match(ID);
				setState(132);
				match(T__4);
				setState(133);
				((Lista_parametrosContext)_localctx).t = typeSimple();
				}
				_localctx.ast.add(new VarDefinition(((Lista_parametrosContext)_localctx).t.ast,(((Lista_parametrosContext)_localctx).ID!=null?((Lista_parametrosContext)_localctx).ID.getText():null),((Lista_parametrosContext)_localctx).ID.getLine(),((Lista_parametrosContext)_localctx).ID.getCharPositionInLine()+1));
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(136);
					match(T__8);
					setState(137);
					((Lista_parametrosContext)_localctx).ID = match(ID);
					setState(138);
					match(T__4);
					setState(139);
					((Lista_parametrosContext)_localctx).t2 = typeSimple();
					_localctx.ast.add(new VarDefinition(((Lista_parametrosContext)_localctx).t2.ast,(((Lista_parametrosContext)_localctx).ID!=null?((Lista_parametrosContext)_localctx).ID.getText():null),((Lista_parametrosContext)_localctx).ID.getLine(),((Lista_parametrosContext)_localctx).ID.getCharPositionInLine()+1));
					}
					}
					setState(146);
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
		public Statement_ternaryContext statement_ternary;
		public Statement_whileContext statement_while;
		public Statement_do_whileContext statement_do_while;
		public Statement_printContext statement_print;
		public Statement_inputContext statement_input;
		public FuncInvocationContext f;
		public Statement_assigmentContext statement_assigment;
		public Statement_returnContext statement_return;
		public Statement_ifContext statement_if() {
			return getRuleContext(Statement_ifContext.class,0);
		}
		public Statement_ternaryContext statement_ternary() {
			return getRuleContext(Statement_ternaryContext.class,0);
		}
		public Statement_whileContext statement_while() {
			return getRuleContext(Statement_whileContext.class,0);
		}
		public Statement_do_whileContext statement_do_while() {
			return getRuleContext(Statement_do_whileContext.class,0);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((StatementContext)_localctx).statement_if = statement_if();
				_localctx.ast.add(((StatementContext)_localctx).statement_if.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((StatementContext)_localctx).statement_ternary = statement_ternary();
				_localctx.ast.add (((StatementContext)_localctx).statement_ternary.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				((StatementContext)_localctx).statement_while = statement_while();
				_localctx.ast.add(((StatementContext)_localctx).statement_while.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				((StatementContext)_localctx).statement_do_while = statement_do_while();
				_localctx.ast.add(((StatementContext)_localctx).statement_do_while.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				((StatementContext)_localctx).statement_print = statement_print();
				_localctx.ast.addAll(((StatementContext)_localctx).statement_print.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				((StatementContext)_localctx).statement_input = statement_input();
				_localctx.ast.addAll(((StatementContext)_localctx).statement_input.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				((StatementContext)_localctx).f = funcInvocation();
				setState(168);
				match(T__7);
				_localctx.ast.add(((StatementContext)_localctx).f.ast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				((StatementContext)_localctx).statement_assigment = statement_assigment();
				_localctx.ast.add(((StatementContext)_localctx).statement_assigment.ast);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
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

	public static class Statement_do_whileContext extends ParserRuleContext {
		public StatementDoWhile ast;
		public BlockContext b;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Statement_do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_do_while; }
	}

	public final Statement_do_whileContext statement_do_while() throws RecognitionException {
		Statement_do_whileContext _localctx = new Statement_do_whileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__9);
			setState(180);
			match(T__4);
			setState(181);
			((Statement_do_whileContext)_localctx).b = block();
			setState(182);
			match(T__10);
			setState(183);
			((Statement_do_whileContext)_localctx).expression = expression(0);
			((Statement_do_whileContext)_localctx).ast =  new StatementDoWhile (_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((Statement_do_whileContext)_localctx).b.ast, ((Statement_do_whileContext)_localctx).expression.ast);
			setState(185);
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

	public static class Statement_ternaryContext extends ParserRuleContext {
		public StatementIf ast;
		public ExpressionContext e1;
		public BloqueStatementContext b1;
		public BloqueStatementContext b2;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BloqueStatementContext> bloqueStatement() {
			return getRuleContexts(BloqueStatementContext.class);
		}
		public BloqueStatementContext bloqueStatement(int i) {
			return getRuleContext(BloqueStatementContext.class,i);
		}
		public Statement_ternaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_ternary; }
	}

	public final Statement_ternaryContext statement_ternary() throws RecognitionException {
		Statement_ternaryContext _localctx = new Statement_ternaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_ternary);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__2);
				setState(188);
				((Statement_ternaryContext)_localctx).e1 = expression(0);
				setState(189);
				match(T__3);
				setState(190);
				match(T__11);
				setState(191);
				((Statement_ternaryContext)_localctx).b1 = bloqueStatement();
				setState(192);
				match(T__4);
				setState(193);
				((Statement_ternaryContext)_localctx).b2 = bloqueStatement();
				setState(194);
				match(T__7);
				((Statement_ternaryContext)_localctx).ast =  new StatementIf(((Statement_ternaryContext)_localctx).e1.ast,((Statement_ternaryContext)_localctx).b1.ast,((Statement_ternaryContext)_localctx).b2.ast,_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((Statement_ternaryContext)_localctx).e1 = expression(0);
				setState(198);
				match(T__11);
				setState(199);
				((Statement_ternaryContext)_localctx).b1 = bloqueStatement();
				setState(200);
				match(T__4);
				setState(201);
				((Statement_ternaryContext)_localctx).b2 = bloqueStatement();
				setState(202);
				match(T__7);
				((Statement_ternaryContext)_localctx).ast =  new StatementIf(((Statement_ternaryContext)_localctx).e1.ast,((Statement_ternaryContext)_localctx).b1.ast,((Statement_ternaryContext)_localctx).b2.ast,_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
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

	public static class BloqueStatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BloqueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueStatement; }
	}

	public final BloqueStatementContext bloqueStatement() throws RecognitionException {
		BloqueStatementContext _localctx = new BloqueStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloqueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((BloqueStatementContext)_localctx).s = statement();
			_localctx.ast.addAll(((BloqueStatementContext)_localctx).s.ast);
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
		public ExpressionContext e2;
		public BlockContext b3;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 26, RULE_statement_if);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__12);
				setState(211);
				((Statement_ifContext)_localctx).e1 = expression(0);
				setState(212);
				match(T__4);
				setState(213);
				((Statement_ifContext)_localctx).b1 = block();
				((Statement_ifContext)_localctx).ast =  new StatementIf(((Statement_ifContext)_localctx).e1.ast,((Statement_ifContext)_localctx).b1.ast,new ArrayList(),_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__12);
				setState(217);
				((Statement_ifContext)_localctx).e1 = expression(0);
				setState(218);
				match(T__4);
				setState(219);
				((Statement_ifContext)_localctx).b1 = block();
				setState(220);
				match(T__13);
				setState(221);
				((Statement_ifContext)_localctx).b2 = block();
				((Statement_ifContext)_localctx).ast =  new StatementIf(((Statement_ifContext)_localctx).e1.ast,((Statement_ifContext)_localctx).b1.ast,((Statement_ifContext)_localctx).b2.ast,_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(T__12);
				setState(225);
				((Statement_ifContext)_localctx).e1 = expression(0);
				setState(226);
				match(T__4);
				setState(227);
				((Statement_ifContext)_localctx).b1 = block();
				setState(228);
				match(T__14);
				setState(229);
				((Statement_ifContext)_localctx).e2 = expression(0);
				setState(230);
				((Statement_ifContext)_localctx).b2 = block();
				((Statement_ifContext)_localctx).ast =  new StatementIf(((Statement_ifContext)_localctx).e1.ast,((Statement_ifContext)_localctx).b1.ast,((Statement_ifContext)_localctx).b2.ast,_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__12);
				setState(234);
				((Statement_ifContext)_localctx).e1 = expression(0);
				setState(235);
				match(T__4);
				setState(236);
				((Statement_ifContext)_localctx).b1 = block();
				setState(237);
				match(T__14);
				setState(238);
				((Statement_ifContext)_localctx).e2 = expression(0);
				setState(239);
				((Statement_ifContext)_localctx).b2 = block();
				setState(240);
				match(T__13);
				setState(241);
				((Statement_ifContext)_localctx).b3 = block();
				 
							List<Statement> bodyElseif = new ArrayList<Statement>();
							bodyElseif.add(new StatementIf(((Statement_ifContext)_localctx).e2.ast,((Statement_ifContext)_localctx).b2.ast,((Statement_ifContext)_localctx).b3.ast,((Statement_ifContext)_localctx).e2.ast.getLine(),((Statement_ifContext)_localctx).e2.ast.getColumn()));
						
							((Statement_ifContext)_localctx).ast =  new StatementIf(((Statement_ifContext)_localctx).e1.ast,((Statement_ifContext)_localctx).b1.ast,bodyElseif,_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1);
						
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
		enterRule(_localctx, 28, RULE_statement_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__10);
			setState(247);
			((Statement_whileContext)_localctx).e2 = expression(0);
			setState(248);
			match(T__4);
			setState(249);
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
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__5);
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(253);
					((BlockContext)_localctx).s1 = statement();

									for (Statement s: ((BlockContext)_localctx).s1.ast)
										_localctx.ast.add(s);
								
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__27) | (1L << T__31) | (1L << T__32) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
				setState(260);
				match(T__6);
				}
				break;
			case T__2:
			case T__9:
			case T__10:
			case T__12:
			case T__15:
			case T__16:
			case T__27:
			case T__31:
			case T__32:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
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
		enterRule(_localctx, 32, RULE_statement_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__15);
			setState(268);
			((Statement_printContext)_localctx).e1 = expressions();
			setState(269);
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
		enterRule(_localctx, 34, RULE_statement_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__16);
			setState(273);
			((Statement_inputContext)_localctx).e1 = expressions();
			setState(274);
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
		public Token op;
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
		enterRule(_localctx, 36, RULE_statement_assigment);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				((Statement_assigmentContext)_localctx).e1 = expression(0);
				setState(278);
				match(T__17);
				setState(279);
				((Statement_assigmentContext)_localctx).e2 = expression(0);
				((Statement_assigmentContext)_localctx).ast =  new StatementAssignment(((Statement_assigmentContext)_localctx).e1.ast.getLine(),((Statement_assigmentContext)_localctx).e1.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast,((Statement_assigmentContext)_localctx).e2.ast);
				setState(281);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((Statement_assigmentContext)_localctx).e1 = expression(0);
				setState(284);
				((Statement_assigmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
					((Statement_assigmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Statement_assigmentContext)_localctx).ast =  new StatementAssignment(((Statement_assigmentContext)_localctx).e1.ast.getLine(),((Statement_assigmentContext)_localctx).e1.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast,new ExpressionArithmetic(((Statement_assigmentContext)_localctx).e1.ast.getLine(), ((Statement_assigmentContext)_localctx).e1.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast,new ExpressionInt(((Statement_assigmentContext)_localctx).e1.ast.getLine(),((Statement_assigmentContext)_localctx).e1.ast.getColumn(),1),(((Statement_assigmentContext)_localctx).op!=null?((Statement_assigmentContext)_localctx).op.getText():null)));
				setState(286);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				((Statement_assigmentContext)_localctx).e1 = expression(0);
				setState(289);
				((Statement_assigmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
					((Statement_assigmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(290);
				((Statement_assigmentContext)_localctx).e2 = expression(0);
				((Statement_assigmentContext)_localctx).ast =  new StatementAssignment(((Statement_assigmentContext)_localctx).e1.ast.getLine(),((Statement_assigmentContext)_localctx).e1.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast, new ExpressionArithmetic(((Statement_assigmentContext)_localctx).e2.ast.getLine(), ((Statement_assigmentContext)_localctx).e2.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast,((Statement_assigmentContext)_localctx).e2.ast,(((Statement_assigmentContext)_localctx).op!=null?((Statement_assigmentContext)_localctx).op.getText():null)));
				setState(292);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				((Statement_assigmentContext)_localctx).e1 = expression(0);
				setState(295);
				((Statement_assigmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
					((Statement_assigmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				((Statement_assigmentContext)_localctx).e2 = expression(0);
				((Statement_assigmentContext)_localctx).ast =  new StatementAssignment(((Statement_assigmentContext)_localctx).e1.ast.getLine(),((Statement_assigmentContext)_localctx).e1.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast, new ExpressionLogic(((Statement_assigmentContext)_localctx).e2.ast.getLine(),((Statement_assigmentContext)_localctx).e2.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast, ((Statement_assigmentContext)_localctx).e2.ast, (((Statement_assigmentContext)_localctx).op!=null?((Statement_assigmentContext)_localctx).op.getText():null)));
				setState(298);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				((Statement_assigmentContext)_localctx).e1 = expression(0);
				setState(301);
				((Statement_assigmentContext)_localctx).op = match(T__26);
				setState(302);
				((Statement_assigmentContext)_localctx).e2 = expression(0);
				((Statement_assigmentContext)_localctx).ast =  new StatementAssignment(((Statement_assigmentContext)_localctx).e1.ast.getLine(),((Statement_assigmentContext)_localctx).e1.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast, new ExpressionLogic(((Statement_assigmentContext)_localctx).e2.ast.getLine(),((Statement_assigmentContext)_localctx).e2.ast.getColumn(),((Statement_assigmentContext)_localctx).e1.ast, ((Statement_assigmentContext)_localctx).e2.ast, (((Statement_assigmentContext)_localctx).op!=null?((Statement_assigmentContext)_localctx).op.getText():null)));
				setState(304);
				match(T__7);
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
		enterRule(_localctx, 38, RULE_statement_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((Statement_returnContext)_localctx).as = match(T__27);
			setState(309);
			((Statement_returnContext)_localctx).expression = expression(0);
			setState(310);
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
		enterRule(_localctx, 40, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((ExpressionsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ExpressionsContext)_localctx).e1.ast);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(315);
				match(T__8);
				setState(316);
				((ExpressionsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).e2.ast);
				}
				}
				setState(323);
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
		public Token op;
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(325);
				match(T__2);
				setState(326);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(327);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 2:
				{
				setState(330);
				match(T__2);
				setState(331);
				((ExpressionContext)_localctx).typeSimple = typeSimple();
				setState(332);
				match(T__3);
				setState(333);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(14);
				((ExpressionContext)_localctx).ast =  new ExpressionCast(((ExpressionContext)_localctx).ex.ast.getLine(),((ExpressionContext)_localctx).ex.ast.getColumn(),((ExpressionContext)_localctx).ex.ast, ((ExpressionContext)_localctx).typeSimple.ast);
				}
				break;
			case 3:
				{
				setState(336);
				match(T__31);
				setState(337);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(13);
				((ExpressionContext)_localctx).ast =  new ExpressionUnary(((ExpressionContext)_localctx).ex.ast.getLine(),((ExpressionContext)_localctx).ex.ast.getColumn(),((ExpressionContext)_localctx).ex.ast);
				}
				break;
			case 4:
				{
				setState(340);
				match(T__32);
				setState(341);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(12);
				((ExpressionContext)_localctx).ast =  new ExpressionNegation (((ExpressionContext)_localctx).ex.ast.getLine(), ((ExpressionContext)_localctx).ex.ast.getColumn(),((ExpressionContext)_localctx).ex.ast);
				}
				break;
			case 5:
				{
				setState(344);
				((ExpressionContext)_localctx).funcInvocation = funcInvocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).funcInvocation.ast;
				}
				break;
			case 6:
				{
				setState(347);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ExpressionInt(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(349);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ExpressionReal(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(351);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ExpressionChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(353);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Identifier(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(395);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.le = _prevctx;
						_localctx.le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(358);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						((ExpressionContext)_localctx).ri = ((ExpressionContext)_localctx).expression = expression(12);
						((ExpressionContext)_localctx).ast =  new ExpressionArithmetic(((ExpressionContext)_localctx).le.ast.getLine(),((ExpressionContext)_localctx).le.ast.getColumn(),((ExpressionContext)_localctx).le.ast,((ExpressionContext)_localctx).ri.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(363);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__36) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(11);
						((ExpressionContext)_localctx).ast =  new ExpressionArithmetic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(368);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(369);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(10);
						((ExpressionContext)_localctx).ast =  new ExpressionComparison(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(373);
						((ExpressionContext)_localctx).O = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__43 || _la==T__44) ) {
							((ExpressionContext)_localctx).O = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(374);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);
						((ExpressionContext)_localctx).ast =  new ExpressionLogic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e2.ast,((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).O!=null?((ExpressionContext)_localctx).O.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(378);
						match(T__45);
						setState(379);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);
						((ExpressionContext)_localctx).ast =  new ExpressionLogic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(), new ExpressionLogic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e2.ast,new ExpressionUnary(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast),"&&"),new ExpressionLogic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),new ExpressionUnary(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e2.ast),((ExpressionContext)_localctx).e1.ast,"&&"),"||");
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.le = _prevctx;
						_localctx.le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(383);
						match(T__28);
						setState(384);
						((ExpressionContext)_localctx).ri = ((ExpressionContext)_localctx).expression = expression(0);
						setState(385);
						match(T__29);
						((ExpressionContext)_localctx).ast =  new ExpressionAccessArray(((ExpressionContext)_localctx).le.ast.getLine(),((ExpressionContext)_localctx).ri.ast.getColumn(),((ExpressionContext)_localctx).le.ast,((ExpressionContext)_localctx).ri.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(389);
						match(T__30);
						setState(390);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new ExpressionAccessField(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(392);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(393);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((ExpressionContext)_localctx).ast =  new ExpressionArithmetic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, new ExpressionInt(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),1), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 44, RULE_funcInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((FuncInvocationContext)_localctx).ID = match(ID);
			setState(401);
			match(T__2);
			setState(402);
			((FuncInvocationContext)_localctx).expressionList = expressionList();
			setState(403);
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
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__31:
			case T__32:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				((ExpressionListContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionListContext)_localctx).e1.ast);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(408);
					match(T__8);
					setState(409);
					((ExpressionListContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ExpressionListContext)_localctx).e2.ast);
					}
					}
					setState(416);
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
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((TypeContext)_localctx).typeSimple = typeSimple();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).typeSimple.ast;
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(T__28);
				setState(424);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(425);
				match(T__29);
				setState(426);
				((TypeContext)_localctx).arr_type = type();
				((TypeContext)_localctx).ast =  new TypeArray(((TypeContext)_localctx).INT_CONSTANT.getLine(),((TypeContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).arr_type.ast);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(T__46);
				setState(430);
				match(T__5);
				setState(431);
				((TypeContext)_localctx).fields = fields();
				setState(432);
				match(T__6);
				((TypeContext)_localctx).ast =  new TypeRecord(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1,((TypeContext)_localctx).fields.ast);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(T__47);
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
		enterRule(_localctx, 50, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(439);
				((FieldsContext)_localctx).listIds = listIds();
				setState(440);
				match(T__4);
				setState(441);
				((FieldsContext)_localctx).type = type();
				setState(442);
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
				setState(447); 
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
		enterRule(_localctx, 52, RULE_typeSimple);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__48);
				((TypeSimpleContext)_localctx).ast =  TypeInt.getInstance();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(T__49);
				((TypeSimpleContext)_localctx).ast =  TypeChar.getInstance();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(T__50);
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
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0083"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n"+
		"\16\n\u0094\13\n\5\n\u0096\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00d0\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00f7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\6\21"+
		"\u0103\n\21\r\21\16\21\u0104\3\21\3\21\3\21\3\21\3\21\5\21\u010c\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0135\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0142\n\26"+
		"\f\26\16\26\u0145\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0166\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u018e\n\27\f\27\16\27\u0191\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u019f"+
		"\n\31\f\31\16\31\u01a2\13\31\3\31\5\31\u01a5\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u01b8\n\32\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u01c0\n\33\r\33\16\33\u01c1"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01ca\n\34\3\34\2\3,\35\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\t\3\2\25\26\3\2\27"+
		"\32\3\2\33\34\3\2$&\4\2\"\"\'\'\3\2(-\3\2./\2\u01e3\28\3\2\2\2\4E\3\2"+
		"\2\2\6H\3\2\2\2\bW\3\2\2\2\nb\3\2\2\2\fh\3\2\2\2\16r\3\2\2\2\20\u0082"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u00b3\3\2\2\2\26\u00b5\3\2\2\2\30\u00cf\3"+
		"\2\2\2\32\u00d1\3\2\2\2\34\u00f6\3\2\2\2\36\u00f8\3\2\2\2 \u010b\3\2\2"+
		"\2\"\u010d\3\2\2\2$\u0112\3\2\2\2&\u0134\3\2\2\2(\u0136\3\2\2\2*\u013b"+
		"\3\2\2\2,\u0165\3\2\2\2.\u0192\3\2\2\2\60\u01a4\3\2\2\2\62\u01b7\3\2\2"+
		"\2\64\u01bf\3\2\2\2\66\u01c9\3\2\2\289\5\4\3\29:\5\6\4\2:;\7\2\2\3;<\b"+
		"\2\1\2<\3\3\2\2\2=>\5\n\6\2>?\b\3\1\2?D\3\2\2\2@A\5\16\b\2AB\b\3\1\2B"+
		"D\3\2\2\2C=\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2"+
		"GE\3\2\2\2HI\7\3\2\2IJ\7\4\2\2JK\7\5\2\2KL\7\6\2\2LM\7\7\2\2MN\7\b\2\2"+
		"NO\5\b\5\2OP\7\t\2\2PQ\b\4\1\2Q\7\3\2\2\2RS\5\n\6\2ST\b\5\1\2TV\3\2\2"+
		"\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X_\3\2\2\2YW\3\2\2\2Z[\5\24"+
		"\13\2[\\\b\5\1\2\\^\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t"+
		"\3\2\2\2a_\3\2\2\2bc\5\f\7\2cd\7\7\2\2de\5\62\32\2ef\7\n\2\2fg\b\6\1\2"+
		"g\13\3\2\2\2hi\7<\2\2io\b\7\1\2jk\7\13\2\2kl\7<\2\2ln\b\7\1\2mj\3\2\2"+
		"\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\r\3\2\2\2qo\3\2\2\2rs\7\3\2\2st\7<\2"+
		"\2tu\7\5\2\2uv\5\22\n\2vw\7\6\2\2wx\7\7\2\2xy\5\20\t\2yz\7\b\2\2z{\5\b"+
		"\5\2{|\7\t\2\2|}\b\b\1\2}\17\3\2\2\2~\u0083\b\t\1\2\177\u0080\5\66\34"+
		"\2\u0080\u0081\b\t\1\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0082\177\3"+
		"\2\2\2\u0083\21\3\2\2\2\u0084\u0096\3\2\2\2\u0085\u0086\7<\2\2\u0086\u0087"+
		"\7\7\2\2\u0087\u0088\5\66\34\2\u0088\u0089\3\2\2\2\u0089\u0092\b\n\1\2"+
		"\u008a\u008b\7\13\2\2\u008b\u008c\7<\2\2\u008c\u008d\7\7\2\2\u008d\u008e"+
		"\5\66\34\2\u008e\u008f\b\n\1\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2"+
		"\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0084\3\2\2\2\u0095\u0085\3\2\2\2\u0096"+
		"\23\3\2\2\2\u0097\u0098\5\34\17\2\u0098\u0099\b\13\1\2\u0099\u00b4\3\2"+
		"\2\2\u009a\u009b\5\30\r\2\u009b\u009c\b\13\1\2\u009c\u00b4\3\2\2\2\u009d"+
		"\u009e\5\36\20\2\u009e\u009f\b\13\1\2\u009f\u00b4\3\2\2\2\u00a0\u00a1"+
		"\5\26\f\2\u00a1\u00a2\b\13\1\2\u00a2\u00b4\3\2\2\2\u00a3\u00a4\5\"\22"+
		"\2\u00a4\u00a5\b\13\1\2\u00a5\u00b4\3\2\2\2\u00a6\u00a7\5$\23\2\u00a7"+
		"\u00a8\b\13\1\2\u00a8\u00b4\3\2\2\2\u00a9\u00aa\5.\30\2\u00aa\u00ab\7"+
		"\n\2\2\u00ab\u00ac\b\13\1\2\u00ac\u00b4\3\2\2\2\u00ad\u00ae\5&\24\2\u00ae"+
		"\u00af\b\13\1\2\u00af\u00b4\3\2\2\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\b"+
		"\13\1\2\u00b2\u00b4\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3\u009a\3\2\2\2\u00b3"+
		"\u009d\3\2\2\2\u00b3\u00a0\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a6\3\2"+
		"\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4"+
		"\25\3\2\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\5 \21"+
		"\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba\5,\27\2\u00ba\u00bb\b\f\1\2\u00bb\u00bc"+
		"\7\n\2\2\u00bc\27\3\2\2\2\u00bd\u00be\7\5\2\2\u00be\u00bf\5,\27\2\u00bf"+
		"\u00c0\7\6\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c3"+
		"\7\7\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\b\r\1\2"+
		"\u00c6\u00d0\3\2\2\2\u00c7\u00c8\5,\27\2\u00c8\u00c9\7\16\2\2\u00c9\u00ca"+
		"\5\32\16\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7\n\2"+
		"\2\u00cd\u00ce\b\r\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00c7"+
		"\3\2\2\2\u00d0\31\3\2\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\b\16\1\2\u00d3"+
		"\33\3\2\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7\7\2"+
		"\2\u00d7\u00d8\5 \21\2\u00d8\u00d9\b\17\1\2\u00d9\u00f7\3\2\2\2\u00da"+
		"\u00db\7\17\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7\7\2\2\u00dd\u00de\5"+
		" \21\2\u00de\u00df\7\20\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1\b\17\1\2\u00e1"+
		"\u00f7\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e4\5,\27\2\u00e4\u00e5\7"+
		"\7\2\2\u00e5\u00e6\5 \21\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\5,\27\2\u00e8"+
		"\u00e9\5 \21\2\u00e9\u00ea\b\17\1\2\u00ea\u00f7\3\2\2\2\u00eb\u00ec\7"+
		"\17\2\2\u00ec\u00ed\5,\27\2\u00ed\u00ee\7\7\2\2\u00ee\u00ef\5 \21\2\u00ef"+
		"\u00f0\7\21\2\2\u00f0\u00f1\5,\27\2\u00f1\u00f2\5 \21\2\u00f2\u00f3\7"+
		"\20\2\2\u00f3\u00f4\5 \21\2\u00f4\u00f5\b\17\1\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00d4\3\2\2\2\u00f6\u00da\3\2\2\2\u00f6\u00e2\3\2\2\2\u00f6\u00eb\3\2"+
		"\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\7\r\2\2\u00f9\u00fa\5,\27\2\u00fa\u00fb"+
		"\7\7\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\b\20\1\2\u00fd\37\3\2\2\2\u00fe"+
		"\u0102\7\b\2\2\u00ff\u0100\5\24\13\2\u0100\u0101\b\21\1\2\u0101\u0103"+
		"\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\t\2\2\u0107\u010c\3\2"+
		"\2\2\u0108\u0109\5\24\13\2\u0109\u010a\b\21\1\2\u010a\u010c\3\2\2\2\u010b"+
		"\u00fe\3\2\2\2\u010b\u0108\3\2\2\2\u010c!\3\2\2\2\u010d\u010e\7\22\2\2"+
		"\u010e\u010f\5*\26\2\u010f\u0110\7\n\2\2\u0110\u0111\b\22\1\2\u0111#\3"+
		"\2\2\2\u0112\u0113\7\23\2\2\u0113\u0114\5*\26\2\u0114\u0115\7\n\2\2\u0115"+
		"\u0116\b\23\1\2\u0116%\3\2\2\2\u0117\u0118\5,\27\2\u0118\u0119\7\24\2"+
		"\2\u0119\u011a\5,\27\2\u011a\u011b\b\24\1\2\u011b\u011c\7\n\2\2\u011c"+
		"\u0135\3\2\2\2\u011d\u011e\5,\27\2\u011e\u011f\t\2\2\2\u011f\u0120\b\24"+
		"\1\2\u0120\u0121\7\n\2\2\u0121\u0135\3\2\2\2\u0122\u0123\5,\27\2\u0123"+
		"\u0124\t\3\2\2\u0124\u0125\5,\27\2\u0125\u0126\b\24\1\2\u0126\u0127\7"+
		"\n\2\2\u0127\u0135\3\2\2\2\u0128\u0129\5,\27\2\u0129\u012a\t\4\2\2\u012a"+
		"\u012b\5,\27\2\u012b\u012c\b\24\1\2\u012c\u012d\7\n\2\2\u012d\u0135\3"+
		"\2\2\2\u012e\u012f\5,\27\2\u012f\u0130\7\35\2\2\u0130\u0131\5,\27\2\u0131"+
		"\u0132\b\24\1\2\u0132\u0133\7\n\2\2\u0133\u0135\3\2\2\2\u0134\u0117\3"+
		"\2\2\2\u0134\u011d\3\2\2\2\u0134\u0122\3\2\2\2\u0134\u0128\3\2\2\2\u0134"+
		"\u012e\3\2\2\2\u0135\'\3\2\2\2\u0136\u0137\7\36\2\2\u0137\u0138\5,\27"+
		"\2\u0138\u0139\7\n\2\2\u0139\u013a\b\25\1\2\u013a)\3\2\2\2\u013b\u013c"+
		"\5,\27\2\u013c\u0143\b\26\1\2\u013d\u013e\7\13\2\2\u013e\u013f\5,\27\2"+
		"\u013f\u0140\b\26\1\2\u0140\u0142\3\2\2\2\u0141\u013d\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144+\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\b\27\1\2\u0147\u0148\7\5\2\2\u0148\u0149\5"+
		",\27\2\u0149\u014a\7\6\2\2\u014a\u014b\b\27\1\2\u014b\u0166\3\2\2\2\u014c"+
		"\u014d\7\5\2\2\u014d\u014e\5\66\34\2\u014e\u014f\7\6\2\2\u014f\u0150\5"+
		",\27\20\u0150\u0151\b\27\1\2\u0151\u0166\3\2\2\2\u0152\u0153\7\"\2\2\u0153"+
		"\u0154\5,\27\17\u0154\u0155\b\27\1\2\u0155\u0166\3\2\2\2\u0156\u0157\7"+
		"#\2\2\u0157\u0158\5,\27\16\u0158\u0159\b\27\1\2\u0159\u0166\3\2\2\2\u015a"+
		"\u015b\5.\30\2\u015b\u015c\b\27\1\2\u015c\u0166\3\2\2\2\u015d\u015e\7"+
		"9\2\2\u015e\u0166\b\27\1\2\u015f\u0160\7:\2\2\u0160\u0166\b\27\1\2\u0161"+
		"\u0162\7;\2\2\u0162\u0166\b\27\1\2\u0163\u0164\7<\2\2\u0164\u0166\b\27"+
		"\1\2\u0165\u0146\3\2\2\2\u0165\u014c\3\2\2\2\u0165\u0152\3\2\2\2\u0165"+
		"\u0156\3\2\2\2\u0165\u015a\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u015f\3\2"+
		"\2\2\u0165\u0161\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u018f\3\2\2\2\u0167"+
		"\u0168\f\r\2\2\u0168\u0169\t\5\2\2\u0169\u016a\5,\27\16\u016a\u016b\b"+
		"\27\1\2\u016b\u018e\3\2\2\2\u016c\u016d\f\f\2\2\u016d\u016e\t\6\2\2\u016e"+
		"\u016f\5,\27\r\u016f\u0170\b\27\1\2\u0170\u018e\3\2\2\2\u0171\u0172\f"+
		"\13\2\2\u0172\u0173\t\7\2\2\u0173\u0174\5,\27\f\u0174\u0175\b\27\1\2\u0175"+
		"\u018e\3\2\2\2\u0176\u0177\f\n\2\2\u0177\u0178\t\b\2\2\u0178\u0179\5,"+
		"\27\13\u0179\u017a\b\27\1\2\u017a\u018e\3\2\2\2\u017b\u017c\f\t\2\2\u017c"+
		"\u017d\7\60\2\2\u017d\u017e\5,\27\n\u017e\u017f\b\27\1\2\u017f\u018e\3"+
		"\2\2\2\u0180\u0181\f\22\2\2\u0181\u0182\7\37\2\2\u0182\u0183\5,\27\2\u0183"+
		"\u0184\7 \2\2\u0184\u0185\b\27\1\2\u0185\u018e\3\2\2\2\u0186\u0187\f\21"+
		"\2\2\u0187\u0188\7!\2\2\u0188\u0189\7<\2\2\u0189\u018e\b\27\1\2\u018a"+
		"\u018b\f\b\2\2\u018b\u018c\t\2\2\2\u018c\u018e\b\27\1\2\u018d\u0167\3"+
		"\2\2\2\u018d\u016c\3\2\2\2\u018d\u0171\3\2\2\2\u018d\u0176\3\2\2\2\u018d"+
		"\u017b\3\2\2\2\u018d\u0180\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u018a\3\2"+
		"\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"-\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7<\2\2\u0193\u0194\7\5\2\2\u0194"+
		"\u0195\5\60\31\2\u0195\u0196\7\6\2\2\u0196\u0197\b\30\1\2\u0197/\3\2\2"+
		"\2\u0198\u0199\5,\27\2\u0199\u01a0\b\31\1\2\u019a\u019b\7\13\2\2\u019b"+
		"\u019c\5,\27\2\u019c\u019d\b\31\1\2\u019d\u019f\3\2\2\2\u019e\u019a\3"+
		"\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a5\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u0198\3\2"+
		"\2\2\u01a4\u01a3\3\2\2\2\u01a5\61\3\2\2\2\u01a6\u01a7\5\66\34\2\u01a7"+
		"\u01a8\b\32\1\2\u01a8\u01b8\3\2\2\2\u01a9\u01aa\7\37\2\2\u01aa\u01ab\7"+
		"9\2\2\u01ab\u01ac\7 \2\2\u01ac\u01ad\5\62\32\2\u01ad\u01ae\b\32\1\2\u01ae"+
		"\u01b8\3\2\2\2\u01af\u01b0\7\61\2\2\u01b0\u01b1\7\b\2\2\u01b1\u01b2\5"+
		"\64\33\2\u01b2\u01b3\7\t\2\2\u01b3\u01b4\b\32\1\2\u01b4\u01b8\3\2\2\2"+
		"\u01b5\u01b6\7\62\2\2\u01b6\u01b8\b\32\1\2\u01b7\u01a6\3\2\2\2\u01b7\u01a9"+
		"\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\63\3\2\2\2\u01b9"+
		"\u01ba\5\f\7\2\u01ba\u01bb\7\7\2\2\u01bb\u01bc\5\62\32\2\u01bc\u01bd\7"+
		"\n\2\2\u01bd\u01be\b\33\1\2\u01be\u01c0\3\2\2\2\u01bf\u01b9\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\65\3\2\2"+
		"\2\u01c3\u01c4\7\63\2\2\u01c4\u01ca\b\34\1\2\u01c5\u01c6\7\64\2\2\u01c6"+
		"\u01ca\b\34\1\2\u01c7\u01c8\7\65\2\2\u01c8\u01ca\b\34\1\2\u01c9\u01c3"+
		"\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\67\3\2\2\2\31C"+
		"EW_o\u0082\u0092\u0095\u00b3\u00cf\u00f6\u0104\u010b\u0134\u0143\u0165"+
		"\u018d\u018f\u01a0\u01a4\u01b7\u01c1\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}