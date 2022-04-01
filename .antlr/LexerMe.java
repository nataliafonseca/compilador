// Generated from /Users/natalia/Projects/me_compiladores/LexerMe.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerMe extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, SYMB=2, NUM=3, P_RES=4, PONT=5, EOE=6, APARENT=7, FPARENT=8, OP_ATR=9, 
		OP_REL=10, OP_ARIT=11, OP_LOG=12, NEWLINE=13, WS=14, STRING=15, COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "SYMB", "NUM", "P_RES", "PONT", "EOE", "APARENT", "FPARENT", "OP_ATR", 
			"OP_REL", "OP_ARIT", "OP_LOG", "NEWLINE", "WS", "STRING", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "';'", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "SYMB", "NUM", "P_RES", "PONT", "EOE", "APARENT", "FPARENT", 
			"OP_ATR", "OP_REL", "OP_ARIT", "OP_LOG", "NEWLINE", "WS", "STRING", "COMMENT"
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


	public LexerMe(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerMe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\4\5\4.\n\4\3\4\6\4\61\n\4\r\4\16"+
		"\4\62\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0084\n\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\5\16\u0091\n\16\3"+
		"\16\3\16\3\17\6\17\u0096\n\17\r\17\16\17\u0097\3\17\3\17\3\20\3\20\7\20"+
		"\u009e\n\20\f\20\16\20\u00a1\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"\u00a9\n\21\f\21\16\21\u00ac\13\21\3\21\5\21\u00af\n\21\3\21\3\21\4\u009f"+
		"\u00aa\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22\3\2\n\4\2C\\c|\5\2\62;C\\c|\4\2--//\3\2\62;\4\2\60"+
		"\60<<\4\2>>@@\5\2,-//\61\61\4\2\13\13\"\"\2\u00ca\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5*\3\2\2\2\7-\3\2"+
		"\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2"+
		"\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u008d\3\2\2\2\33\u0090\3\2\2"+
		"\2\35\u0095\3\2\2\2\37\u009b\3\2\2\2!\u00a4\3\2\2\2#\'\t\2\2\2$&\t\3\2"+
		"\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\4\3\2\2\2)\'\3\2\2\2*+\t"+
		"\4\2\2+\6\3\2\2\2,.\5\5\3\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\t\5\2"+
		"\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\b\3\2\2\2"+
		"\64\65\7r\2\2\65\66\7t\2\2\66\67\7q\2\2\678\7i\2\289\7t\2\29:\7c\2\2:"+
		"n\7o\2\2;<\7k\2\2<=\7p\2\2=>\7v\2\2>?\7g\2\2?@\7i\2\2@A\7g\2\2An\7t\2"+
		"\2BC\7d\2\2CD\7q\2\2DE\7q\2\2EF\7n\2\2FG\7g\2\2GH\7c\2\2Hn\7p\2\2IJ\7"+
		"d\2\2JK\7g\2\2KL\7i\2\2LM\7k\2\2Mn\7p\2\2NO\7g\2\2OP\7p\2\2Pn\7f\2\2Q"+
		"R\7y\2\2RS\7j\2\2ST\7k\2\2TU\7n\2\2Un\7g\2\2VW\7f\2\2Wn\7q\2\2XY\7t\2"+
		"\2YZ\7g\2\2Z[\7c\2\2[n\7f\2\2\\]\7x\2\2]^\7c\2\2^n\7t\2\2_`\7h\2\2`a\7"+
		"c\2\2ab\7n\2\2bc\7u\2\2cn\7g\2\2de\7v\2\2ef\7t\2\2fg\7w\2\2gn\7g\2\2h"+
		"i\7y\2\2ij\7t\2\2jk\7k\2\2kl\7v\2\2ln\7g\2\2m\64\3\2\2\2m;\3\2\2\2mB\3"+
		"\2\2\2mI\3\2\2\2mN\3\2\2\2mQ\3\2\2\2mV\3\2\2\2mX\3\2\2\2m\\\3\2\2\2m_"+
		"\3\2\2\2md\3\2\2\2mh\3\2\2\2n\n\3\2\2\2op\t\6\2\2p\f\3\2\2\2qr\7=\2\2"+
		"r\16\3\2\2\2st\7*\2\2t\20\3\2\2\2uv\7+\2\2v\22\3\2\2\2wx\7<\2\2xy\7?\2"+
		"\2y\24\3\2\2\2z\u0084\t\7\2\2{|\7@\2\2|\u0084\7?\2\2}~\7>\2\2~\u0084\7"+
		"?\2\2\177\u0080\7?\2\2\u0080\u0084\7?\2\2\u0081\u0082\7>\2\2\u0082\u0084"+
		"\7@\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\26\3\2\2\2\u0085\u0086\t\b\2\2\u0086\30\3\2"+
		"\2\2\u0087\u0088\7Q\2\2\u0088\u008e\7T\2\2\u0089\u008a\7C\2\2\u008a\u008b"+
		"\7P\2\2\u008b\u008e\7F\2\2\u008c\u008e\7\u0080\2\2\u008d\u0087\3\2\2\2"+
		"\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e\32\3\2\2\2\u008f\u0091"+
		"\7\17\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0093\7\f\2\2\u0093\34\3\2\2\2\u0094\u0096\t\t\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\b\17\2\2\u009a\36\3\2\2\2\u009b\u009f\7$\2"+
		"\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\7$\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6"+
		"\7\61\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\33\16\2\u00ae\u00ad\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\21\2\2\u00b1\""+
		"\3\2\2\2\16\2\'-\62m\u0083\u008d\u0090\u0097\u009f\u00aa\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}