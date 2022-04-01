// Generated from /Users/natalia/Projects/me_compiladores/GrammarMe.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarMeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ID=31, NUM=32, 
		EOE=33, STRING=34, COMMENT=35, WS=36;
	public static final int
		RULE_program = 0, RULE_loop = 1, RULE_statement = 2, RULE_expression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "loop", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'program'", "':'", "'end'", "'while'", "'do'", "'false'", 
			"'true'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'<>'", "'~'", "'OR'", "'AND'", "'.'", "':='", "'integer'", "'boolean'", 
			"'var'", "'('", "')'", "'read'", "'write'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "NUM", "EOE", "STRING", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "GrammarMe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarMeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode WS() { return getToken(GrammarMeParser.WS, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(T__0);
				setState(9);
				match(T__1);
				setState(10);
				match(T__2);
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(11);
					statement(0);
					}
					}
					setState(14); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << NUM) | (1L << EOE) | (1L << STRING) | (1L << COMMENT) | (1L << WS))) != 0) );
				setState(16);
				match(T__3);
				setState(17);
				match(T__1);
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(WS);
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

	public static class LoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__4);
			setState(23);
			expression(0);
			setState(24);
			match(T__5);
			setState(25);
			match(T__2);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				statement(0);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << NUM) | (1L << EOE) | (1L << STRING) | (1L << COMMENT) | (1L << WS))) != 0) );
			setState(31);
			match(T__3);
			setState(32);
			match(T__4);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOE() { return getToken(GrammarMeParser.EOE, 0); }
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(GrammarMeParser.COMMENT, 0); }
		public TerminalNode WS() { return getToken(GrammarMeParser.WS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(35);
				expression(0);
				setState(36);
				match(EOE);
				}
				break;
			case 2:
				{
				setState(38);
				loop();
				}
				break;
			case 3:
				{
				setState(39);
				match(EOE);
				}
				break;
			case 4:
				{
				setState(40);
				match(COMMENT);
				}
				break;
			case 5:
				{
				setState(41);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(44);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(45);
					match(COMMENT);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token OP;
		public TerminalNode STRING() { return getToken(GrammarMeParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(GrammarMeParser.NUM, 0); }
		public TerminalNode ID() { return getToken(GrammarMeParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WS() { return getToken(GrammarMeParser.WS, 0); }
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(52);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(53);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(54);
				match(ID);
				}
				break;
			case 4:
				{
				setState(55);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(56);
				match(T__7);
				}
				break;
			case 6:
				{
				setState(57);
				((ExpressionContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
					((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				match(NUM);
				}
				break;
			case 7:
				{
				setState(59);
				match(T__18);
				setState(60);
				expression(8);
				}
				break;
			case 8:
				{
				setState(61);
				match(ID);
				setState(62);
				match(T__22);
				setState(63);
				expression(5);
				}
				break;
			case 9:
				{
				setState(64);
				((ExpressionContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
					((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(ID);
				setState(66);
				match(T__22);
				setState(67);
				expression(4);
				}
				break;
			case 10:
				{
				setState(68);
				match(T__26);
				setState(69);
				expression(0);
				setState(70);
				match(T__27);
				}
				break;
			case 11:
				{
				setState(72);
				((ExpressionContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				expression(2);
				}
				break;
			case 12:
				{
				setState(74);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(78);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(81);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(84);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(87);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(90);
						match(T__21);
						setState(91);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(96);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&d\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\2\3"+
		"\2\5\2\27\n\2\3\3\3\3\3\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\5\2\4\6\b\6"+
		"\2\4\6\b\2\b\3\2\13\f\3\2\32\34\3\2\37 \3\2\r\16\3\2\17\24\3\2\26\27\2"+
		"w\2\26\3\2\2\2\4\30\3\2\2\2\6,\3\2\2\2\bM\3\2\2\2\n\13\7\3\2\2\13\f\7"+
		"\4\2\2\f\16\7\5\2\2\r\17\5\6\4\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2"+
		"\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\23\7\6\2\2\23\24\7\4\2\2\24\27\3\2"+
		"\2\2\25\27\7&\2\2\26\n\3\2\2\2\26\25\3\2\2\2\27\3\3\2\2\2\30\31\7\7\2"+
		"\2\31\32\5\b\5\2\32\33\7\b\2\2\33\35\7\5\2\2\34\36\5\6\4\2\35\34\3\2\2"+
		"\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\6\2\2\"#\7\7"+
		"\2\2#\5\3\2\2\2$%\b\4\1\2%&\5\b\5\2&\'\7#\2\2\'-\3\2\2\2(-\5\4\3\2)-\7"+
		"#\2\2*-\7%\2\2+-\7&\2\2,$\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2"+
		"\2\2-\62\3\2\2\2./\f\b\2\2/\61\7%\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65\66\b\5\1\2\66N\7"+
		"$\2\2\67N\7\"\2\28N\7!\2\29N\7\t\2\2:N\7\n\2\2;<\t\2\2\2<N\7\"\2\2=>\7"+
		"\25\2\2>N\5\b\5\n?@\7!\2\2@A\7\31\2\2AN\5\b\5\7BC\t\3\2\2CD\7!\2\2DE\7"+
		"\31\2\2EN\5\b\5\6FG\7\35\2\2GH\5\b\5\2HI\7\36\2\2IN\3\2\2\2JK\t\4\2\2"+
		"KN\5\b\5\4LN\7&\2\2M\65\3\2\2\2M\67\3\2\2\2M8\3\2\2\2M9\3\2\2\2M:\3\2"+
		"\2\2M;\3\2\2\2M=\3\2\2\2M?\3\2\2\2MB\3\2\2\2MF\3\2\2\2MJ\3\2\2\2ML\3\2"+
		"\2\2N`\3\2\2\2OP\f\r\2\2PQ\t\2\2\2Q_\5\b\5\16RS\f\f\2\2ST\t\5\2\2T_\5"+
		"\b\5\rUV\f\13\2\2VW\t\6\2\2W_\5\b\5\fXY\f\t\2\2YZ\t\7\2\2Z_\5\b\5\n[\\"+
		"\f\b\2\2\\]\7\30\2\2]_\5\b\5\t^O\3\2\2\2^R\3\2\2\2^U\3\2\2\2^X\3\2\2\2"+
		"^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t\3\2\2\2b`\3\2\2\2\n\20\26"+
		"\37,\62M^`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}