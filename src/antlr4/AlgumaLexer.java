// Generated from Alguma.g4 by ANTLR 4.7.2

    package antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TIPO=5, ID=6, STRING=7, WS=8, NUM=9, BOOL=10, 
		OPERADOR=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TIPO", "ID", "STRING", "WS", "NUM", 
			"BOOL", "OPERADOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':DECLARACAO'", "'='", "':ALGORITMO'", "'A'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TIPO", "ID", "STRING", "WS", "NUM", "BOOL", 
			"OPERADOR"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u0081\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6G\n\6\3\7\3"+
		"\7\6\7K\n\7\r\7\16\7L\3\b\3\b\3\b\6\bR\n\b\r\b\16\bS\3\b\7\bW\n\b\f\b"+
		"\16\bZ\13\b\5\b\\\n\b\3\b\3\b\3\t\7\ta\n\t\f\t\16\td\13\t\3\t\3\t\3\n"+
		"\6\ni\n\n\r\n\16\nj\3\n\3\n\6\no\n\n\r\n\16\np\5\ns\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\b\3\2c|\3\2C\\\3\2$$\3\2\62"+
		";\5\2\13\f\17\17\"\"\5\2,-//\61\61\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5%\3\2\2\2\7\'"+
		"\3\2\2\2\t\62\3\2\2\2\13F\3\2\2\2\rJ\3\2\2\2\17N\3\2\2\2\21b\3\2\2\2\23"+
		"h\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\32\7<\2\2\32\33\7F\2\2\33\34\7"+
		"G\2\2\34\35\7E\2\2\35\36\7N\2\2\36\37\7C\2\2\37 \7T\2\2 !\7C\2\2!\"\7"+
		"E\2\2\"#\7C\2\2#$\7Q\2\2$\4\3\2\2\2%&\7?\2\2&\6\3\2\2\2\'(\7<\2\2()\7"+
		"C\2\2)*\7N\2\2*+\7I\2\2+,\7Q\2\2,-\7T\2\2-.\7K\2\2./\7V\2\2/\60\7O\2\2"+
		"\60\61\7Q\2\2\61\b\3\2\2\2\62\63\7C\2\2\63\n\3\2\2\2\64\65\7k\2\2\65\66"+
		"\7p\2\2\66G\7v\2\2\678\7h\2\289\7n\2\29:\7q\2\2:;\7c\2\2;G\7v\2\2<=\7"+
		"D\2\2=>\7q\2\2>?\7q\2\2?G\7n\2\2@A\7u\2\2AB\7v\2\2BC\7t\2\2CD\7k\2\2D"+
		"E\7p\2\2EG\7i\2\2F\64\3\2\2\2F\67\3\2\2\2F<\3\2\2\2F@\3\2\2\2G\f\3\2\2"+
		"\2HI\t\2\2\2IK\t\3\2\2JH\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\16\3\2"+
		"\2\2N[\t\4\2\2OQ\t\2\2\2PR\t\3\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TU\3\2\2\2UW\t\5\2\2VO\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3"+
		"\2\2\2ZX\3\2\2\2[X\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\t\4\2\2^\20\3\2\2\2"+
		"_a\t\6\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2"+
		"ef\b\t\2\2f\22\3\2\2\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2kr\3\2\2\2ln\7\60\2\2mo\t\5\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2"+
		"\2\2qs\3\2\2\2rl\3\2\2\2rs\3\2\2\2s\24\3\2\2\2tu\7H\2\2uv\7c\2\2vw\7n"+
		"\2\2wx\7u\2\2x~\7g\2\2yz\7V\2\2z{\7t\2\2{|\7w\2\2|~\7g\2\2}t\3\2\2\2}"+
		"y\3\2\2\2~\26\3\2\2\2\177\u0080\t\7\2\2\u0080\30\3\2\2\2\r\2FLSX[bjpr"+
		"}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}