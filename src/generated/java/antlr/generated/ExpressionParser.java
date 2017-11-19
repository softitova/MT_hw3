// Generated from Expression.g4 by ANTLR 4.5.3
package antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NEWLINE=9, 
		Number=10, Digit=11, Variable=12, Letter=13, LetterOrDigit=14, WS=15;
	public static final int
		RULE_parse = 0, RULE_expr = 1, RULE_lVal = 2, RULE_rVal = 3, RULE_expr1 = 4, 
		RULE_term = 5, RULE_expr2 = 6, RULE_fact = 7, RULE_unaryOp = 8;
	public static final String[] ruleNames = {
		"parse", "expr", "lVal", "rVal", "expr1", "term", "expr2", "fact", "unaryOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "NEWLINE", "Number", 
		"Digit", "Variable", "Letter", "LetterOrDigit", "WS"
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public java.util.HashMap<String, Integer> map =  new java.util.HashMap<>();
		public TerminalNode EOF() { return getToken(ExpressionParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				expr(_localctx.map);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Variable );
			setState(23);
			match(EOF);

			        for (java.util.Map.Entry<String, Integer> i : _localctx.map.entrySet()) {
			            System.out.println(i.getKey() + " = " + i.getValue() + ";");
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

	public static class ExprContext extends ParserRuleContext {
		public java.util.HashMap<String, Integer> map;
		public LValContext lVal;
		public RValContext rVal;
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public RValContext rVal() {
			return getRuleContext(RValContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExpressionParser.NEWLINE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, java.util.HashMap<String, Integer> map) {
			super(parent, invokingState);
			this.map = map;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(java.util.HashMap<String, Integer> map) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), map);
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((ExprContext)_localctx).lVal = lVal();
			setState(27);
			match(T__0);
			setState(28);
			((ExprContext)_localctx).rVal = rVal(_localctx.map);
			setState(29);
			match(T__1);
			setState(30);
			match(NEWLINE);
			_localctx.map.put((((ExprContext)_localctx).lVal!=null?_input.getText(((ExprContext)_localctx).lVal.start,((ExprContext)_localctx).lVal.stop):null), ((ExprContext)_localctx).rVal.val);
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

	public static class LValContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(ExpressionParser.Variable, 0); }
		public LValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterLVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitLVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitLVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValContext lVal() throws RecognitionException {
		LValContext _localctx = new LValContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(Variable);
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

	public static class RValContext extends ParserRuleContext {
		public java.util.HashMap<String, Integer> map;
		public int val;
		public TermContext term;
		public Expr1Context expr1;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public RValContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RValContext(ParserRuleContext parent, int invokingState, java.util.HashMap<String, Integer> map) {
			super(parent, invokingState);
			this.map = map;
		}
		@Override public int getRuleIndex() { return RULE_rVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitRVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RValContext rVal(java.util.HashMap<String, Integer> map) throws RecognitionException {
		RValContext _localctx = new RValContext(_ctx, getState(), map);
		enterRule(_localctx, 6, RULE_rVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((RValContext)_localctx).term = term(_localctx.map);
			setState(36);
			((RValContext)_localctx).expr1 = expr1(((RValContext)_localctx).term.val, _localctx.map);
			((RValContext)_localctx).val =  ((RValContext)_localctx).expr1.val;
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

	public static class Expr1Context extends ParserRuleContext {
		public int i;
		public java.util.HashMap<String, Integer> map;
		public int val;
		public TermContext term;
		public Expr2Context expr2;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr1Context(ParserRuleContext parent, int invokingState, int i, java.util.HashMap<String, Integer> map) {
			super(parent, invokingState);
			this.i = i;
			this.map = map;
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1(int i,java.util.HashMap<String, Integer> map) throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState(), i, map);
		enterRule(_localctx, 8, RULE_expr1);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__2);
				setState(40);
				((Expr1Context)_localctx).term = term(_localctx.map);
				setState(41);
				((Expr1Context)_localctx).expr2 = expr2(_localctx.i + ((Expr1Context)_localctx).term.val, _localctx.map);
				 ((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__3);
				setState(45);
				((Expr1Context)_localctx).term = term(_localctx.map);
				setState(46);
				((Expr1Context)_localctx).expr2 = expr2(_localctx.i - ((Expr1Context)_localctx).term.val, _localctx.map);
				 ((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ((Expr1Context)_localctx).val =  _localctx.i; 
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

	public static class TermContext extends ParserRuleContext {
		public java.util.HashMap<String, Integer> map;
		public int val;
		public FactContext fact;
		public Expr2Context expr2;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermContext(ParserRuleContext parent, int invokingState, java.util.HashMap<String, Integer> map) {
			super(parent, invokingState);
			this.map = map;
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term(java.util.HashMap<String, Integer> map) throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState(), map);
		enterRule(_localctx, 10, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((TermContext)_localctx).fact = fact(_localctx.map);
			setState(53);
			((TermContext)_localctx).expr2 = expr2(((TermContext)_localctx).fact.val, _localctx.map);
			 ((TermContext)_localctx).val =  ((TermContext)_localctx).expr2.val; 
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

	public static class Expr2Context extends ParserRuleContext {
		public int i;
		public java.util.HashMap<String, Integer> map;
		public int val;
		public FactContext fact;
		public Expr1Context expr1;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr2Context(ParserRuleContext parent, int invokingState, int i, java.util.HashMap<String, Integer> map) {
			super(parent, invokingState);
			this.i = i;
			this.map = map;
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2(int i,java.util.HashMap<String, Integer> map) throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState(), i, map);
		enterRule(_localctx, 12, RULE_expr2);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__4);
				setState(57);
				((Expr2Context)_localctx).fact = fact(_localctx.map);
				setState(58);
				((Expr2Context)_localctx).expr1 = expr1(_localctx.i * ((Expr2Context)_localctx).fact.val, _localctx.map);
				 ((Expr2Context)_localctx).val =  ((Expr2Context)_localctx).expr1.val; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__5);
				setState(62);
				((Expr2Context)_localctx).fact = fact(_localctx.map);
				setState(63);
				((Expr2Context)_localctx).expr1 = expr1(_localctx.i / ((Expr2Context)_localctx).fact.val, _localctx.map);
				 ((Expr2Context)_localctx).val =  ((Expr2Context)_localctx).expr1.val; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ((Expr2Context)_localctx).val =  _localctx.i; 
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

	public static class FactContext extends ParserRuleContext {
		public java.util.HashMap<String, Integer> map;
		public int val;
		public UnaryOpContext unaryOp;
		public RValContext rVal;
		public Token Variable;
		public Token Number;
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public RValContext rVal() {
			return getRuleContext(RValContext.class,0);
		}
		public TerminalNode Variable() { return getToken(ExpressionParser.Variable, 0); }
		public TerminalNode Number() { return getToken(ExpressionParser.Number, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactContext(ParserRuleContext parent, int invokingState, java.util.HashMap<String, Integer> map) {
			super(parent, invokingState);
			this.map = map;
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact(java.util.HashMap<String, Integer> map) throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState(), map);
		enterRule(_localctx, 14, RULE_fact);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((FactContext)_localctx).unaryOp = unaryOp(_localctx.map);
				 ((FactContext)_localctx).val =  ((FactContext)_localctx).unaryOp.val; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__6);
				setState(73);
				((FactContext)_localctx).rVal = rVal(_localctx.map);
				setState(74);
				match(T__7);
				 ((FactContext)_localctx).val =  ((FactContext)_localctx).rVal.val; 
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((FactContext)_localctx).Variable = match(Variable);
				 ((FactContext)_localctx).val =  _localctx.map.get((((FactContext)_localctx).Variable!=null?((FactContext)_localctx).Variable.getText():null)); 
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				((FactContext)_localctx).Number = match(Number);
				 ((FactContext)_localctx).val =  Integer.parseInt((((FactContext)_localctx).Number!=null?((FactContext)_localctx).Number.getText():null)); 
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

	public static class UnaryOpContext extends ParserRuleContext {
		public java.util.HashMap<String, Integer> map;
		public int val;
		public FactContext fact;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public UnaryOpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState, java.util.HashMap<String, Integer> map) {
			super(parent, invokingState);
			this.map = map;
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp(java.util.HashMap<String, Integer> map) throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState(), map);
		enterRule(_localctx, 16, RULE_unaryOp);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__3);
				setState(84);
				((UnaryOpContext)_localctx).fact = fact(_localctx.map);
				 ((UnaryOpContext)_localctx).val =  (-1) * ((UnaryOpContext)_localctx).fact.val; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__2);
				setState(88);
				((UnaryOpContext)_localctx).fact = fact(_localctx.map);
				 ((UnaryOpContext)_localctx).val =  ((UnaryOpContext)_localctx).fact.val; 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\65\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bF\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n^\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2_\2\25\3"+
		"\2\2\2\4\34\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16"+
		"E\3\2\2\2\20S\3\2\2\2\22]\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\33\b"+
		"\2\1\2\33\3\3\2\2\2\34\35\5\6\4\2\35\36\7\3\2\2\36\37\5\b\5\2\37 \7\4"+
		"\2\2 !\7\13\2\2!\"\b\3\1\2\"\5\3\2\2\2#$\7\16\2\2$\7\3\2\2\2%&\5\f\7\2"+
		"&\'\5\n\6\2\'(\b\5\1\2(\t\3\2\2\2)*\7\5\2\2*+\5\f\7\2+,\5\16\b\2,-\b\6"+
		"\1\2-\65\3\2\2\2./\7\6\2\2/\60\5\f\7\2\60\61\5\16\b\2\61\62\b\6\1\2\62"+
		"\65\3\2\2\2\63\65\b\6\1\2\64)\3\2\2\2\64.\3\2\2\2\64\63\3\2\2\2\65\13"+
		"\3\2\2\2\66\67\5\20\t\2\678\5\16\b\289\b\7\1\29\r\3\2\2\2:;\7\7\2\2;<"+
		"\5\20\t\2<=\5\n\6\2=>\b\b\1\2>F\3\2\2\2?@\7\b\2\2@A\5\20\t\2AB\5\n\6\2"+
		"BC\b\b\1\2CF\3\2\2\2DF\b\b\1\2E:\3\2\2\2E?\3\2\2\2ED\3\2\2\2F\17\3\2\2"+
		"\2GH\5\22\n\2HI\b\t\1\2IT\3\2\2\2JK\7\t\2\2KL\5\b\5\2LM\7\n\2\2MN\b\t"+
		"\1\2NT\3\2\2\2OP\7\16\2\2PT\b\t\1\2QR\7\f\2\2RT\b\t\1\2SG\3\2\2\2SJ\3"+
		"\2\2\2SO\3\2\2\2SQ\3\2\2\2T\21\3\2\2\2UV\7\6\2\2VW\5\20\t\2WX\b\n\1\2"+
		"X^\3\2\2\2YZ\7\5\2\2Z[\5\20\t\2[\\\b\n\1\2\\^\3\2\2\2]U\3\2\2\2]Y\3\2"+
		"\2\2^\23\3\2\2\2\7\27\64ES]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}