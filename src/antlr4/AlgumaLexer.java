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
		T__0=1, TIPO=2, ID=3, STRING=4, WS=5, NUM=6, BOOL=7, OPERADOR=8, DECLARACAO=9, 
		ALGORITMO=10, ATRIBUIR=11, A=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TIPO", "ID", "STRING", "WS", "NUM", "BOOL", "OPERADOR", "DECLARACAO", 
			"ALGORITMO", "ATRIBUIR", "A"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, null, null, null, null, null, null, "':DECLARACAO'", 
			"':ALGORITMO'", "'ATRIBUIR'", "'A'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TIPO", "ID", "STRING", "WS", "NUM", "BOOL", "OPERADOR", 
			"DECLARACAO", "ALGORITMO", "ATRIBUIR", "A"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\6\4\64\n\4\r\4\16"+
		"\4\65\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\6\7\6B\n\6\f\6\16\6E\13"+
		"\6\3\6\3\6\3\7\6\7J\n\7\r\7\16\7K\3\7\3\7\6\7P\n\7\r\7\16\7Q\5\7T\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3;\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\3\2\7\3\2c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2\62;\7"+
		"\2,-//\61\61>>@@\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5/\3\2\2\2\7\61\3\2\2"+
		"\2\t\67\3\2\2\2\13C\3\2\2\2\rI\3\2\2\2\17^\3\2\2\2\21g\3\2\2\2\23i\3\2"+
		"\2\2\25u\3\2\2\2\27\u0080\3\2\2\2\31\u0089\3\2\2\2\33\34\7?\2\2\34\4\3"+
		"\2\2\2\35\36\7k\2\2\36\37\7p\2\2\37\60\7v\2\2 !\7h\2\2!\"\7n\2\2\"#\7"+
		"q\2\2#$\7c\2\2$\60\7v\2\2%&\7D\2\2&\'\7q\2\2\'(\7q\2\2(\60\7n\2\2)*\7"+
		"u\2\2*+\7v\2\2+,\7t\2\2,-\7k\2\2-.\7p\2\2.\60\7i\2\2/\35\3\2\2\2/ \3\2"+
		"\2\2/%\3\2\2\2/)\3\2\2\2\60\6\3\2\2\2\61\63\t\2\2\2\62\64\t\3\2\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\b\3\2\2\2\67;\7"+
		"$\2\28:\13\2\2\298\3\2\2\2:=\3\2\2\2;<\3\2\2\2;9\3\2\2\2<>\3\2\2\2=;\3"+
		"\2\2\2>?\7$\2\2?\n\3\2\2\2@B\t\4\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DF\3\2\2\2EC\3\2\2\2FG\b\6\2\2G\f\3\2\2\2HJ\t\5\2\2IH\3\2\2\2JK"+
		"\3\2\2\2KI\3\2\2\2KL\3\2\2\2LS\3\2\2\2MO\7.\2\2NP\t\5\2\2ON\3\2\2\2PQ"+
		"\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SM\3\2\2\2ST\3\2\2\2T\16\3\2\2\2"+
		"UV\7H\2\2VW\7c\2\2WX\7n\2\2XY\7u\2\2Y_\7g\2\2Z[\7V\2\2[\\\7t\2\2\\]\7"+
		"w\2\2]_\7g\2\2^U\3\2\2\2^Z\3\2\2\2_\20\3\2\2\2`h\t\6\2\2ab\7@\2\2bh\7"+
		"?\2\2cd\7>\2\2dh\7?\2\2ef\7?\2\2fh\7?\2\2g`\3\2\2\2ga\3\2\2\2gc\3\2\2"+
		"\2ge\3\2\2\2h\22\3\2\2\2ij\7<\2\2jk\7F\2\2kl\7G\2\2lm\7E\2\2mn\7N\2\2"+
		"no\7C\2\2op\7T\2\2pq\7C\2\2qr\7E\2\2rs\7C\2\2st\7Q\2\2t\24\3\2\2\2uv\7"+
		"<\2\2vw\7C\2\2wx\7N\2\2xy\7I\2\2yz\7Q\2\2z{\7T\2\2{|\7K\2\2|}\7V\2\2}"+
		"~\7O\2\2~\177\7Q\2\2\177\26\3\2\2\2\u0080\u0081\7C\2\2\u0081\u0082\7V"+
		"\2\2\u0082\u0083\7T\2\2\u0083\u0084\7K\2\2\u0084\u0085\7D\2\2\u0085\u0086"+
		"\7W\2\2\u0086\u0087\7K\2\2\u0087\u0088\7T\2\2\u0088\30\3\2\2\2\u0089\u008a"+
		"\7C\2\2\u008a\32\3\2\2\2\r\2/\63\65;CKQS^g\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}