// Generated from C:/Users/majd/IdeaProjects/untitled\Dart2Parser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Dart2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Main=1, DataType=2, Int_type=3, String_type=4, Double_type=5, Bool_type=6, 
		Bool_value=7, MathMaticalSign=8, BooleanSign=9, EQFORNORMALMATH=10, EQFORBOOLEANMATH=11, 
		EQ=12, A=13, AA=14, AE=15, AT=16, C=17, CB=18, CBC=19, CIR=20, CIRE=21, 
		CO=22, CP=23, D=24, DD=25, DDD=26, DDDQ=27, EE=28, EG=29, GT=30, LT=31, 
		LTE=32, LTLT=33, LTLTE=34, ME=35, MINUS=36, MM=37, NE=38, NOT=39, OB=40, 
		OBC=41, OP=42, P=43, PC=44, PE=45, PL=46, PLE=47, PLPL=48, PO=49, POE=50, 
		PP=51, QU=52, QUD=53, QUDD=54, QUQU=55, QUQUEQ=56, SC=57, SE=58, SL=59, 
		SQS=60, SQSE=61, SQUIG=62, ST=63, STE=64, ABSTRACT_=65, AS_=66, ASSERT_=67, 
		ASYNC_=68, AWAIT_=69, BREAK_=70, CASE_=71, CATCH_=72, CLASS_=73, CONST_=74, 
		CONTINUE_=75, COVARIANT_=76, DEFAULT_=77, DEFERRED_=78, DO_=79, DYNAMIC_=80, 
		ELSE_=81, ENUM_=82, EXPORT_=83, EXTENDS_=84, EXTENSION_=85, EXTERNAL_=86, 
		FACTORY_=87, FALSE_=88, FINAL_=89, FINALLY_=90, FOR_=91, FUNCTION_=92, 
		GET_=93, GTILDE_=94, HIDE_=95, IF_=96, IMPLEMENTS_=97, IMPORT_=98, IN_=99, 
		INTERFACE_=100, IS_=101, LATE_=102, LET_=103, LIBRARY_=104, MIXIN_=105, 
		NATIVE_=106, NEW_=107, NULL_=108, OF_=109, ON_=110, OPERATOR_=111, PART_=112, 
		REQUIRED_=113, RETHROW_=114, RETURN_=115, SET_=116, SHOW_=117, STATIC_=118, 
		SUPER_=119, SWITCH_=120, SYNC_=121, THIS_=122, THROW_=123, TRUE_=124, 
		TRY_=125, TYPEDEF_=126, VAR_=127, VOID_=128, WHILE_=129, WITH_=130, YIELD_=131, 
		NUMBER=132, DOUBLE=133, HEX_NUMBER=134, SingleLineString=135, MultiLineString=136, 
		IDENTIFIER=137, WHITESPACE=138, SINGLE_LINE_COMMENT=139, MULTI_LINE_COMMENT=140;
	public static final int
		RULE_program = 0, RULE_content = 1, RULE_varDefinition = 2, RULE_intIncrease = 3, 
		RULE_boolVarDefnition = 4, RULE_varEQ = 5, RULE_boolVarEq = 6, RULE_exp = 7, 
		RULE_boolExp = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "content", "varDefinition", "intIncrease", "boolVarDefnition", 
			"varEQ", "boolVarEq", "exp", "boolExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main()'", null, "'int'", "'String'", "'double'", "'bool'", null, 
			null, null, null, null, "'='", "'&'", "'&&'", "'&='", "'@'", "','", "']'", 
			"'}'", "'^'", "'^='", "':'", "')'", "'.'", "'..'", "'...'", "'...?'", 
			"'=='", "'=>'", "'>'", "'<'", "'<='", "'<<'", "'<<='", "'-='", "'-'", 
			"'--'", "'!='", "'!'", "'['", "'{'", "'('", "'|'", "'%'", "'%='", "'+'", 
			"'+='", "'++'", "'#'", "'|='", "'||'", "'?'", "'?.'", "'?..'", "'??'", 
			"'??='", "';'", "'/='", "'/'", "'~/'", "'~/='", "'~'", "'*'", "'*='", 
			"'abstract'", "'as'", "'assert'", "'async'", "'await'", "'break'", "'case'", 
			"'catch'", "'class'", "'const'", "'continue'", "'covariant'", "'default'", 
			"'deferred'", "'do'", "'dynamic'", "'else'", "'enum'", "'export'", "'extends'", 
			"'extension'", "'external'", "'factory'", "'false'", "'final'", "'finally'", 
			"'for'", "'Function'", "'get'", "'gtilde'", "'hide'", "'if'", "'implements'", 
			"'import'", "'in'", "'interface'", "'is'", "'late'", "'let'", "'library'", 
			"'mixin'", "'native'", "'new'", "'null'", "'of'", "'on'", "'operator'", 
			"'part'", "'required'", "'rethrow'", "'return'", "'set'", "'show'", "'static'", 
			"'super'", "'switch'", "'sync'", "'this'", "'throw'", "'true'", "'try'", 
			"'typedef'", "'var'", "'void'", "'while'", "'with'", "'yield'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Main", "DataType", "Int_type", "String_type", "Double_type", "Bool_type", 
			"Bool_value", "MathMaticalSign", "BooleanSign", "EQFORNORMALMATH", "EQFORBOOLEANMATH", 
			"EQ", "A", "AA", "AE", "AT", "C", "CB", "CBC", "CIR", "CIRE", "CO", "CP", 
			"D", "DD", "DDD", "DDDQ", "EE", "EG", "GT", "LT", "LTE", "LTLT", "LTLTE", 
			"ME", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "P", "PC", "PE", 
			"PL", "PLE", "PLPL", "PO", "POE", "PP", "QU", "QUD", "QUDD", "QUQU", 
			"QUQUEQ", "SC", "SE", "SL", "SQS", "SQSE", "SQUIG", "ST", "STE", "ABSTRACT_", 
			"AS_", "ASSERT_", "ASYNC_", "AWAIT_", "BREAK_", "CASE_", "CATCH_", "CLASS_", 
			"CONST_", "CONTINUE_", "COVARIANT_", "DEFAULT_", "DEFERRED_", "DO_", 
			"DYNAMIC_", "ELSE_", "ENUM_", "EXPORT_", "EXTENDS_", "EXTENSION_", "EXTERNAL_", 
			"FACTORY_", "FALSE_", "FINAL_", "FINALLY_", "FOR_", "FUNCTION_", "GET_", 
			"GTILDE_", "HIDE_", "IF_", "IMPLEMENTS_", "IMPORT_", "IN_", "INTERFACE_", 
			"IS_", "LATE_", "LET_", "LIBRARY_", "MIXIN_", "NATIVE_", "NEW_", "NULL_", 
			"OF_", "ON_", "OPERATOR_", "PART_", "REQUIRED_", "RETHROW_", "RETURN_", 
			"SET_", "SHOW_", "STATIC_", "SUPER_", "SWITCH_", "SYNC_", "THIS_", "THROW_", 
			"TRUE_", "TRY_", "TYPEDEF_", "VAR_", "VOID_", "WHILE_", "WITH_", "YIELD_", 
			"NUMBER", "DOUBLE", "HEX_NUMBER", "SingleLineString", "MultiLineString", 
			"IDENTIFIER", "WHITESPACE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Dart2Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Dart2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DataType || _la==Bool_type || _la==IDENTIFIER) {
				{
				{
				setState(18);
				content();
				}
				}
				setState(23);
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

	public static class ContentContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public VarEQContext varEQ() {
			return getRuleContext(VarEQContext.class,0);
		}
		public IntIncreaseContext intIncrease() {
			return getRuleContext(IntIncreaseContext.class,0);
		}
		public BoolVarDefnitionContext boolVarDefnition() {
			return getRuleContext(BoolVarDefnitionContext.class,0);
		}
		public BoolVarEqContext boolVarEq() {
			return getRuleContext(BoolVarEqContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				varDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				varEQ();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				intIncrease();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				boolVarDefnition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				boolVarEq();
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public TerminalNode DataType() { return getToken(Dart2Parser.DataType, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Dart2Parser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(Dart2Parser.SC, 0); }
		public TerminalNode EQ() { return getToken(Dart2Parser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(DataType);
			setState(32);
			match(IDENTIFIER);
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				{
				setState(33);
				match(EQ);
				setState(34);
				exp(0);
				}
				break;
			case SC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(38);
			match(SC);
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

	public static class IntIncreaseContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Dart2Parser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(Dart2Parser.SC, 0); }
		public TerminalNode PLPL() { return getToken(Dart2Parser.PLPL, 0); }
		public TerminalNode MM() { return getToken(Dart2Parser.MM, 0); }
		public IntIncreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intIncrease; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterIntIncrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitIntIncrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitIntIncrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntIncreaseContext intIncrease() throws RecognitionException {
		IntIncreaseContext _localctx = new IntIncreaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intIncrease);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(IDENTIFIER);
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==MM || _la==PLPL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			match(SC);
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

	public static class BoolVarDefnitionContext extends ParserRuleContext {
		public TerminalNode Bool_type() { return getToken(Dart2Parser.Bool_type, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Dart2Parser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(Dart2Parser.SC, 0); }
		public TerminalNode EQ() { return getToken(Dart2Parser.EQ, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public BoolVarDefnitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVarDefnition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterBoolVarDefnition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitBoolVarDefnition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitBoolVarDefnition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVarDefnitionContext boolVarDefnition() throws RecognitionException {
		BoolVarDefnitionContext _localctx = new BoolVarDefnitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolVarDefnition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(Bool_type);
			setState(45);
			match(IDENTIFIER);
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				{
				setState(46);
				match(EQ);
				setState(47);
				boolExp(0);
				}
				break;
			case SC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(51);
			match(SC);
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

	public static class VarEQContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Dart2Parser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(Dart2Parser.SC, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EQFORNORMALMATH() { return getToken(Dart2Parser.EQFORNORMALMATH, 0); }
		public TerminalNode EQ() { return getToken(Dart2Parser.EQ, 0); }
		public VarEQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterVarEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitVarEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitVarEQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarEQContext varEQ() throws RecognitionException {
		VarEQContext _localctx = new VarEQContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varEQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(IDENTIFIER);
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQFORNORMALMATH:
			case EQ:
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==EQFORNORMALMATH || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				exp(0);
				}
				break;
			case SC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(59);
			match(SC);
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

	public static class BoolVarEqContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Dart2Parser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(Dart2Parser.SC, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode EQFORBOOLEANMATH() { return getToken(Dart2Parser.EQFORBOOLEANMATH, 0); }
		public TerminalNode EQ() { return getToken(Dart2Parser.EQ, 0); }
		public BoolVarEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVarEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterBoolVarEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitBoolVarEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitBoolVarEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVarEqContext boolVarEq() throws RecognitionException {
		BoolVarEqContext _localctx = new BoolVarEqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolVarEq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFIER);
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQFORBOOLEANMATH:
			case EQ:
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==EQFORBOOLEANMATH || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				boolExp(0);
				}
				break;
			case SC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(67);
			match(SC);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BetweenBracketContext extends ExpContext {
		public TerminalNode OP() { return getToken(Dart2Parser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(Dart2Parser.CP, 0); }
		public BetweenBracketContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterBetweenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitBetweenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitBetweenBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpContext {
		public TerminalNode IDENTIFIER() { return getToken(Dart2Parser.IDENTIFIER, 0); }
		public VariableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpContext {
		public TerminalNode NUMBER() { return getToken(Dart2Parser.NUMBER, 0); }
		public NumberContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathematicsLogicContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MathMaticalSign() { return getToken(Dart2Parser.MathMaticalSign, 0); }
		public MathematicsLogicContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterMathematicsLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitMathematicsLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitMathematicsLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpContext {
		public TerminalNode SingleLineString() { return getToken(Dart2Parser.SingleLineString, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExpContext {
		public TerminalNode DOUBLE() { return getToken(Dart2Parser.DOUBLE, 0); }
		public DoubleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				_localctx = new BetweenBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				match(OP);
				setState(71);
				exp(0);
				setState(72);
				match(CP);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(NUMBER);
				}
				break;
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(DOUBLE);
				}
				break;
			case SingleLineString:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(SingleLineString);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathematicsLogicContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(80);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(81);
					match(MathMaticalSign);
					setState(82);
					exp(7);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class BoolExpContext extends ParserRuleContext {
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
	 
		public BoolExpContext() { }
		public void copyFrom(BoolExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolMathematicsLogicContext extends BoolExpContext {
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public TerminalNode BooleanSign() { return getToken(Dart2Parser.BooleanSign, 0); }
		public BoolMathematicsLogicContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterBoolMathematicsLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitBoolMathematicsLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitBoolMathematicsLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends BoolExpContext {
		public TerminalNode Bool_value() { return getToken(Dart2Parser.Bool_value, 0); }
		public BoolContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVariableContext extends BoolExpContext {
		public TerminalNode IDENTIFIER() { return getToken(Dart2Parser.IDENTIFIER, 0); }
		public BoolVariableContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitBoolVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitBoolVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolBetweenBracketContext extends BoolExpContext {
		public TerminalNode OP() { return getToken(Dart2Parser.OP, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(Dart2Parser.CP, 0); }
		public BoolBetweenBracketContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).enterBoolBetweenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Dart2ParserListener ) ((Dart2ParserListener)listener).exitBoolBetweenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Dart2ParserVisitor ) return ((Dart2ParserVisitor<? extends T>)visitor).visitBoolBetweenBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				_localctx = new BoolBetweenBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				match(OP);
				setState(90);
				boolExp(0);
				setState(91);
				match(CP);
				}
				break;
			case Bool_value:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(Bool_value);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new BoolVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolMathematicsLogicContext(new BoolExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
					setState(97);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(98);
					match(BooleanSign);
					setState(99);
					boolExp(5);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 8:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008cj\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002%\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u00042\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006B\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007O\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b`\b\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\be\b\b\n\b\f\bh\t\b\u0001\b\u0000\u0002\u000e\u0010\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0003\u0002\u0000%%00\u0002\u0000\n\n\f"+
		"\f\u0001\u0000\u000b\fq\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001d"+
		"\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006(\u0001"+
		"\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000"+
		"\f=\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010_\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u001e\u0003"+
		"\u0004\u0002\u0000\u0019\u001e\u0003\n\u0005\u0000\u001a\u001e\u0003\u0006"+
		"\u0003\u0000\u001b\u001e\u0003\b\u0004\u0000\u001c\u001e\u0003\f\u0006"+
		"\u0000\u001d\u0018\u0001\u0000\u0000\u0000\u001d\u0019\u0001\u0000\u0000"+
		"\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\u0002\u0000\u0000 $\u0005\u0089\u0000\u0000!\"\u0005"+
		"\f\u0000\u0000\"%\u0003\u000e\u0007\u0000#%\u0001\u0000\u0000\u0000$!"+
		"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u00059\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000()\u0005\u0089"+
		"\u0000\u0000)*\u0007\u0000\u0000\u0000*+\u00059\u0000\u0000+\u0007\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0006\u0000\u0000-1\u0005\u0089\u0000\u0000"+
		"./\u0005\f\u0000\u0000/2\u0003\u0010\b\u000002\u0001\u0000\u0000\u0000"+
		"1.\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000034\u00059\u0000\u00004\t\u0001\u0000\u0000\u000059\u0005\u0089\u0000"+
		"\u000067\u0007\u0001\u0000\u00007:\u0003\u000e\u0007\u00008:\u0001\u0000"+
		"\u0000\u000096\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u00059\u0000\u0000<\u000b\u0001\u0000\u0000\u0000"+
		"=A\u0005\u0089\u0000\u0000>?\u0007\u0002\u0000\u0000?B\u0003\u0010\b\u0000"+
		"@B\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u00059\u0000\u0000D\r\u0001\u0000\u0000"+
		"\u0000EF\u0006\u0007\uffff\uffff\u0000FG\u0005*\u0000\u0000GH\u0003\u000e"+
		"\u0007\u0000HI\u0005\u0017\u0000\u0000IO\u0001\u0000\u0000\u0000JO\u0005"+
		"\u0089\u0000\u0000KO\u0005\u0084\u0000\u0000LO\u0005\u0085\u0000\u0000"+
		"MO\u0005\u0087\u0000\u0000NE\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000"+
		"\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000OU\u0001\u0000\u0000\u0000PQ\n\u0006\u0000\u0000QR\u0005\b"+
		"\u0000\u0000RT\u0003\u000e\u0007\u0007SP\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\u000f\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0006\b\uffff"+
		"\uffff\u0000YZ\u0005*\u0000\u0000Z[\u0003\u0010\b\u0000[\\\u0005\u0017"+
		"\u0000\u0000\\`\u0001\u0000\u0000\u0000]`\u0005\u0007\u0000\u0000^`\u0005"+
		"\u0089\u0000\u0000_X\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`f\u0001\u0000\u0000\u0000ab\n\u0004\u0000\u0000"+
		"bc\u0005\t\u0000\u0000ce\u0003\u0010\b\u0005da\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000g\u0011\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000\n\u0015"+
		"\u001d$19ANU_f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}