// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/java/aux_tools/lexico/lexer.flex

package aux_tools.lexico;
import static aux_tools.lexico.Tokens.*;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\5\1\6"+
    "\1\7\2\6\2\0\1\10\1\11\1\12\1\13\1\14"+
    "\1\1\1\15\1\16\1\17\12\20\3\6\1\21\1\6"+
    "\2\0\1\22\1\23\4\22\1\24\12\22\1\25\10\22"+
    "\1\26\1\27\1\26\1\0\1\30\1\0\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\22\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\22\1\56\1\57\1\60"+
    "\1\61\1\0\1\61\7\0\1\3\u01a2\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\4\1\13\1\14\1\15"+
    "\1\16\1\17\13\16\1\20\6\16\1\21\1\1\1\0"+
    "\1\1\1\22\2\23\1\24\1\0\1\25\6\0\4\26"+
    "\1\3\1\0\1\27\1\14\4\0\33\16\1\20\4\16"+
    "\1\0\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\10\0\4\26\2\3\3\0\1\27"+
    "\1\42\1\0\1\27\4\26\1\0\1\26\1\43\2\26"+
    "\23\16\1\20\16\16\10\0\1\26\2\0\1\3\1\44"+
    "\2\0\1\26\1\27\1\0\1\42\1\26\1\0\32\16"+
    "\1\0\1\45\5\0\1\3\1\26\1\27\2\0\17\16"+
    "\3\0\3\26\11\16\1\0\2\26\1\20\20\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[280];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\226\0\226\0\226"+
    "\0\226\0\226\0\226\0\226\0\372\0\u012c\0\u015e\0\226"+
    "\0\u0190\0\226\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u0190\0\u03e8\0\u041a"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\226\0\u0514\0\u0546\0\u0578"+
    "\0\u05aa\0\226\0\u05dc\0\226\0\u060e\0\u0640\0\u0672\0\u06a4"+
    "\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\226\0\u07d0\0\u0802"+
    "\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992"+
    "\0\u09c4\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22"+
    "\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2"+
    "\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42"+
    "\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2"+
    "\0\u1004\0\226\0\u1004\0\226\0\226\0\226\0\226\0\226"+
    "\0\226\0\226\0\226\0\u1036\0\u1068\0\u109a\0\u10cc\0\u10fe"+
    "\0\u1130\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u125c\0\226"+
    "\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356\0\u1388\0\u13ba\0\u13ec"+
    "\0\u08fc\0\u092e\0\u0960\0\u0992\0\u141e\0\u1450\0\u08fc\0\u1482"+
    "\0\u14b4\0\u14e6\0\u1518\0\u154a\0\u157c\0\u15ae\0\u15e0\0\u1612"+
    "\0\u1644\0\u1676\0\u16a8\0\u16da\0\u170c\0\u173e\0\u1770\0\u17a2"+
    "\0\u17d4\0\u1806\0\u1838\0\u186a\0\u189c\0\u18ce\0\u1900\0\u1932"+
    "\0\u1964\0\u1996\0\u19c8\0\u19fa\0\u1a2c\0\u1a5e\0\u1a90\0\u1ac2"+
    "\0\u1af4\0\u1b26\0\u1b58\0\u1b8a\0\u1bbc\0\u1bee\0\u1c20\0\u1c52"+
    "\0\u1c84\0\u1cb6\0\u1ce8\0\u1d1a\0\u11f8\0\u1d4c\0\u11c6\0\226"+
    "\0\u1d7e\0\u1db0\0\u1de2\0\u1e14\0\u1e46\0\u1e78\0\u1eaa\0\u1edc"+
    "\0\u1f0e\0\u1f40\0\u1f72\0\u1fa4\0\u1fd6\0\u2008\0\u203a\0\u206c"+
    "\0\u209e\0\u20d0\0\u2102\0\u2134\0\u2166\0\u2198\0\u21ca\0\u21fc"+
    "\0\u222e\0\u2260\0\u2292\0\u22c4\0\u22f6\0\u2328\0\u235a\0\u238c"+
    "\0\u23be\0\u23f0\0\u2422\0\226\0\u2454\0\u2486\0\u24b8\0\u24ea"+
    "\0\u251c\0\u079e\0\u254e\0\u2580\0\u25b2\0\u25e4\0\u2616\0\u2648"+
    "\0\u267a\0\u26ac\0\u26de\0\u2710\0\u2742\0\u2774\0\u27a6\0\u27d8"+
    "\0\u280a\0\u283c\0\u286e\0\u28a0\0\u28d2\0\u2904\0\u2936\0\u2968"+
    "\0\u299a\0\u29cc\0\u29fe\0\u2a30\0\u2a62\0\u2a94\0\u2ac6\0\u2af8"+
    "\0\u2b2a\0\u2b5c\0\u2b8e\0\u2bc0\0\u2bf2\0\u2c24\0\u2c56\0\u2c88"+
    "\0\u2cba\0\u2cec\0\u2d1e\0\u2d50\0\u2d82\0\u2db4\0\u2de6\0\u2e18"+
    "\0\u2e4a\0\u2e7c\0\u2eae\0\u2ee0\0\u2f12\0\u2f44\0\u2f76\0\u2fa8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[280];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\2\5\1\0\2\5\1\6\1\7\1\4\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\4\21\1\22\1\4\1\21\1\23\1\21\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\21\1\33\1\34"+
    "\1\35\1\36\1\37\1\21\1\40\1\41\1\42\1\43"+
    "\1\44\1\21\1\36\1\21\1\45\13\46\1\47\3\46"+
    "\1\50\42\46\2\51\1\52\1\51\1\53\2\51\1\54"+
    "\17\51\1\55\32\51\63\0\2\5\1\0\2\5\74\0"+
    "\1\56\10\0\1\57\3\0\1\60\1\0\1\61\7\0"+
    "\1\62\1\0\1\63\3\0\1\64\4\0\2\65\1\66"+
    "\1\65\1\67\6\65\1\70\3\65\1\71\42\65\5\0"+
    "\1\72\10\0\1\73\1\0\1\74\1\0\4\75\2\0"+
    "\10\75\1\76\3\75\1\77\5\75\1\100\6\75\21\0"+
    "\1\21\1\0\4\21\2\0\31\21\21\0\1\21\1\0"+
    "\4\21\2\0\17\21\1\101\1\21\1\102\1\103\5\21"+
    "\1\104\21\0\1\21\1\0\4\21\2\0\1\21\1\105"+
    "\14\21\1\106\12\21\21\0\1\21\1\0\4\21\2\0"+
    "\5\21\1\107\3\21\1\110\17\21\21\0\1\21\1\0"+
    "\4\21\2\0\15\21\1\111\4\21\1\112\6\21\21\0"+
    "\1\21\1\0\4\21\2\0\1\21\1\113\7\21\1\114"+
    "\17\21\21\0\1\21\1\0\4\21\2\0\11\21\1\115"+
    "\7\21\1\116\7\21\21\0\1\21\1\0\4\21\2\0"+
    "\1\21\1\117\17\21\1\36\7\21\21\0\1\21\1\0"+
    "\4\21\2\0\15\21\1\120\12\21\1\121\21\0\1\21"+
    "\1\0\4\21\2\0\5\21\1\122\10\21\1\123\12\21"+
    "\21\0\1\21\1\0\4\21\2\0\11\21\1\124\4\21"+
    "\1\125\12\21\21\0\1\21\1\0\4\21\2\0\16\21"+
    "\1\36\12\21\21\0\1\21\1\0\4\21\2\0\1\21"+
    "\1\126\17\21\1\127\7\21\21\0\1\21\1\0\4\21"+
    "\2\0\5\21\1\130\10\21\1\131\12\21\21\0\1\21"+
    "\1\0\4\21\2\0\1\21\1\132\3\21\1\133\3\21"+
    "\1\134\17\21\21\0\1\21\1\0\4\21\2\0\5\21"+
    "\1\135\3\21\1\136\17\21\21\0\1\21\1\0\4\21"+
    "\2\0\22\21\1\137\6\21\21\0\1\21\1\0\4\21"+
    "\2\0\5\21\1\140\23\21\1\0\13\46\1\141\61\46"+
    "\1\141\3\46\1\142\55\46\1\143\46\46\2\51\1\0"+
    "\1\51\1\0\2\51\1\0\17\51\1\0\32\51\2\0"+
    "\1\52\57\0\2\52\3\0\2\52\1\144\1\145\16\52"+
    "\1\146\2\52\1\147\3\52\1\150\6\52\1\151\3\52"+
    "\1\152\1\52\1\153\6\52\20\0\1\56\110\0\1\154"+
    "\10\0\1\155\46\0\1\156\4\0\1\157\50\0\1\160"+
    "\71\0\1\161\56\0\1\162\50\0\1\163\24\0\2\65"+
    "\1\66\1\65\1\67\55\65\2\0\1\66\57\0\2\164"+
    "\1\165\1\164\1\166\6\164\1\167\46\164\2\71\1\170"+
    "\1\71\1\171\55\71\40\0\1\172\3\0\1\173\5\0"+
    "\1\174\25\0\1\175\1\0\1\176\1\0\4\177\2\0"+
    "\31\177\6\0\1\72\10\0\1\200\1\0\1\74\1\0"+
    "\4\201\2\0\10\201\1\202\3\201\1\203\5\201\1\204"+
    "\6\201\17\0\1\205\1\0\1\206\1\0\4\201\2\0"+
    "\31\201\17\0\1\205\1\0\1\206\1\0\4\201\2\0"+
    "\21\201\1\207\7\201\17\0\1\205\1\0\1\206\1\0"+
    "\4\201\2\0\11\201\1\210\17\201\17\0\1\205\1\0"+
    "\1\206\1\0\4\201\2\0\5\201\1\211\23\201\21\0"+
    "\1\21\1\0\4\21\2\0\1\21\1\212\27\21\21\0"+
    "\1\21\1\0\4\21\2\0\21\21\1\213\7\21\21\0"+
    "\1\21\1\0\4\21\2\0\11\21\1\214\17\21\21\0"+
    "\1\21\1\0\4\21\2\0\24\21\1\215\4\21\21\0"+
    "\1\21\1\0\4\21\2\0\22\21\1\35\6\21\21\0"+
    "\1\21\1\0\4\21\2\0\14\21\1\35\14\21\21\0"+
    "\1\21\1\0\4\21\2\0\3\21\1\216\2\21\1\217"+
    "\12\21\1\220\1\21\1\221\5\21\21\0\1\21\1\0"+
    "\4\21\2\0\22\21\1\222\6\21\21\0\1\21\1\0"+
    "\4\21\2\0\23\21\1\223\5\21\21\0\1\21\1\0"+
    "\4\21\2\0\23\21\1\224\5\21\21\0\1\21\1\0"+
    "\4\21\2\0\3\21\1\225\7\21\1\105\15\21\21\0"+
    "\1\21\1\0\4\21\2\0\15\21\1\226\13\21\21\0"+
    "\1\21\1\0\4\21\2\0\21\21\1\137\7\21\21\0"+
    "\1\21\1\0\4\21\2\0\1\21\1\227\27\21\21\0"+
    "\1\21\1\0\4\21\2\0\3\21\1\230\25\21\21\0"+
    "\1\21\1\0\4\21\2\0\3\21\1\231\5\21\1\232"+
    "\11\21\1\233\5\21\21\0\1\21\1\0\4\21\2\0"+
    "\20\21\1\234\10\21\21\0\1\21\1\0\4\21\2\0"+
    "\4\21\1\235\24\21\21\0\1\21\1\0\4\21\2\0"+
    "\7\21\1\236\21\21\21\0\1\21\1\0\4\21\2\0"+
    "\5\21\1\237\7\21\1\36\13\21\21\0\1\21\1\0"+
    "\4\21\2\0\22\21\1\240\1\241\5\21\21\0\1\21"+
    "\1\0\4\21\2\0\21\21\1\242\7\21\21\0\1\21"+
    "\1\0\4\21\2\0\5\21\1\243\23\21\21\0\1\21"+
    "\1\0\4\21\2\0\17\21\1\244\11\21\21\0\1\21"+
    "\1\0\4\21\2\0\12\21\1\35\16\21\21\0\1\21"+
    "\1\0\4\21\2\0\13\21\1\245\15\21\21\0\1\21"+
    "\1\0\4\21\2\0\7\21\1\36\3\21\1\246\15\21"+
    "\21\0\1\21\1\0\4\21\2\0\15\21\1\35\13\21"+
    "\21\0\1\21\1\0\4\21\2\0\26\21\1\247\2\21"+
    "\21\0\1\21\1\0\4\21\2\0\5\21\1\250\23\21"+
    "\21\0\1\21\1\0\4\21\2\0\1\21\1\251\27\21"+
    "\21\0\1\21\1\0\4\21\2\0\3\21\1\252\15\21"+
    "\1\253\7\21\1\0\13\46\1\141\3\46\1\0\42\46"+
    "\31\0\1\254\104\0\1\255\40\0\1\256\101\0\1\257"+
    "\57\0\1\260\45\0\1\261\66\0\1\262\70\0\1\263"+
    "\10\0\2\164\1\165\1\164\1\166\6\164\1\264\46\164"+
    "\13\265\1\266\50\265\1\165\10\265\1\266\46\265\2\164"+
    "\1\165\1\164\1\166\6\164\1\264\3\164\1\267\42\164"+
    "\2\0\1\170\130\0\1\270\51\0\1\271\55\0\1\272"+
    "\42\0\1\175\1\0\1\273\1\0\4\177\2\0\31\177"+
    "\17\0\1\274\1\0\1\176\57\0\1\275\3\0\4\177"+
    "\2\0\31\177\17\0\1\175\1\0\1\276\1\0\4\177"+
    "\2\0\31\177\17\0\1\275\1\0\1\277\1\0\4\177"+
    "\2\0\31\177\17\0\1\300\1\0\1\206\1\0\4\206"+
    "\2\0\31\206\17\0\1\205\1\0\1\206\1\0\4\201"+
    "\2\0\15\201\1\207\13\201\17\0\1\205\1\0\1\206"+
    "\1\0\4\201\2\0\7\201\1\207\21\201\21\0\1\21"+
    "\1\0\4\21\2\0\7\21\1\137\21\21\21\0\1\21"+
    "\1\0\4\21\2\0\5\21\1\301\23\21\21\0\1\21"+
    "\1\0\4\21\2\0\7\21\1\302\21\21\21\0\1\21"+
    "\1\0\4\21\2\0\13\21\1\36\15\21\21\0\1\21"+
    "\1\0\4\21\2\0\11\21\1\303\7\21\1\304\7\21"+
    "\21\0\1\21\1\0\4\21\2\0\11\21\1\305\17\21"+
    "\21\0\1\21\1\0\4\21\2\0\5\21\1\306\23\21"+
    "\21\0\1\21\1\0\4\21\2\0\5\21\1\307\23\21"+
    "\21\0\1\21\1\0\4\21\2\0\17\21\1\310\11\21"+
    "\21\0\1\21\1\0\4\21\2\0\5\21\1\311\23\21"+
    "\21\0\1\21\1\0\4\21\2\0\1\21\1\312\27\21"+
    "\21\0\1\21\1\0\4\21\2\0\11\21\1\313\17\21"+
    "\21\0\1\21\1\0\4\21\2\0\1\314\30\21\21\0"+
    "\1\21\1\0\4\21\2\0\4\21\1\315\24\21\21\0"+
    "\1\21\1\0\4\21\2\0\5\21\1\251\23\21\21\0"+
    "\1\21\1\0\4\21\2\0\13\21\1\316\5\21\1\304"+
    "\7\21\21\0\1\21\1\0\4\21\2\0\3\21\1\317"+
    "\25\21\21\0\1\21\1\0\4\21\2\0\5\21\1\320"+
    "\23\21\21\0\1\21\1\0\4\21\2\0\24\21\1\321"+
    "\4\21\21\0\1\21\1\0\3\21\1\322\2\0\31\21"+
    "\21\0\1\21\1\0\4\21\2\0\11\21\1\323\17\21"+
    "\21\0\1\21\1\0\4\21\2\0\15\21\1\324\13\21"+
    "\21\0\1\21\1\0\4\21\2\0\23\21\1\115\5\21"+
    "\21\0\1\21\1\0\4\21\2\0\16\21\1\251\12\21"+
    "\21\0\1\21\1\0\4\21\2\0\1\21\1\36\27\21"+
    "\21\0\1\21\1\0\4\21\2\0\15\21\1\325\13\21"+
    "\21\0\1\21\1\0\4\21\2\0\5\21\1\326\23\21"+
    "\21\0\1\21\1\0\4\21\2\0\11\21\1\251\17\21"+
    "\21\0\1\21\1\0\4\21\2\0\5\21\1\327\23\21"+
    "\21\0\1\21\1\0\4\21\2\0\23\21\1\35\5\21"+
    "\21\0\1\21\1\0\4\21\2\0\14\21\1\330\14\21"+
    "\21\0\1\21\1\0\4\21\2\0\21\21\1\36\7\21"+
    "\21\0\1\21\1\0\4\21\2\0\5\21\1\331\23\21"+
    "\21\0\1\21\1\0\4\21\2\0\4\21\1\332\24\21"+
    "\40\0\1\333\65\0\1\334\53\0\1\335\55\0\1\336"+
    "\61\0\1\337\75\0\1\340\62\0\1\334\47\0\1\341"+
    "\25\0\2\164\1\165\1\164\1\166\6\164\1\264\3\164"+
    "\1\342\42\164\13\265\1\266\3\265\1\170\42\265\45\0"+
    "\1\270\53\0\1\270\40\0\1\274\1\0\1\273\57\0"+
    "\1\274\1\0\1\274\57\0\1\275\1\0\1\343\1\0"+
    "\4\177\2\0\31\177\17\0\1\344\1\0\1\276\57\0"+
    "\1\345\1\0\1\277\61\0\1\346\61\0\1\21\1\0"+
    "\4\21\2\0\7\21\1\347\21\21\21\0\1\21\1\0"+
    "\4\21\2\0\15\21\1\137\13\21\21\0\1\21\1\0"+
    "\4\21\2\0\14\21\1\350\14\21\21\0\1\21\1\0"+
    "\4\21\2\0\5\21\1\351\23\21\21\0\1\21\1\0"+
    "\4\21\2\0\15\21\1\245\13\21\21\0\1\21\1\0"+
    "\4\21\2\0\3\21\1\352\25\21\21\0\1\21\1\0"+
    "\4\21\2\0\15\21\1\230\13\21\21\0\1\21\1\0"+
    "\4\21\2\0\13\21\1\353\15\21\21\0\1\21\1\0"+
    "\4\21\2\0\21\21\1\35\7\21\21\0\1\21\1\0"+
    "\4\21\2\0\4\21\1\35\24\21\21\0\1\21\1\0"+
    "\4\21\2\0\13\21\1\354\15\21\21\0\1\21\1\0"+
    "\4\21\2\0\2\21\1\355\14\21\1\356\5\21\1\137"+
    "\3\21\21\0\1\21\1\0\4\21\2\0\16\21\1\331"+
    "\12\21\21\0\1\21\1\0\4\21\2\0\24\21\1\245"+
    "\4\21\21\0\1\21\1\0\4\21\2\0\11\21\1\357"+
    "\17\21\21\0\1\21\1\0\4\21\2\0\15\21\1\360"+
    "\13\21\21\0\1\21\1\0\4\21\2\0\11\21\1\361"+
    "\17\21\21\0\1\21\1\0\2\21\1\362\1\21\2\0"+
    "\31\21\21\0\1\21\1\0\4\21\2\0\3\21\1\35"+
    "\25\21\21\0\1\21\1\0\4\21\2\0\23\21\1\363"+
    "\5\21\21\0\1\21\1\0\4\21\2\0\4\21\1\230"+
    "\24\21\21\0\1\21\1\0\4\21\2\0\23\21\1\245"+
    "\5\21\21\0\1\21\1\0\4\21\2\0\3\21\1\364"+
    "\25\21\21\0\1\21\1\0\4\21\2\0\17\21\1\35"+
    "\11\21\21\0\1\21\1\0\4\21\2\0\22\21\1\36"+
    "\6\21\21\0\1\21\1\0\4\21\2\0\1\21\1\365"+
    "\3\21\1\36\23\21\32\0\1\366\75\0\1\367\50\0"+
    "\1\262\76\0\1\334\44\0\1\370\62\0\1\334\44\0"+
    "\1\343\57\0\1\371\1\0\1\372\57\0\1\373\1\0"+
    "\1\277\57\0\1\345\1\0\1\346\61\0\1\21\1\0"+
    "\4\21\2\0\13\21\1\374\15\21\21\0\1\21\1\0"+
    "\4\21\2\0\1\21\1\215\27\21\21\0\1\21\1\0"+
    "\4\21\2\0\14\21\1\375\14\21\21\0\1\21\1\0"+
    "\4\21\2\0\10\21\1\242\20\21\21\0\1\21\1\0"+
    "\4\21\2\0\1\21\1\376\27\21\21\0\1\21\1\0"+
    "\4\21\2\0\1\377\30\21\21\0\1\21\1\0\4\21"+
    "\2\0\13\21\1\u0100\15\21\21\0\1\21\1\0\4\21"+
    "\2\0\21\21\1\u0101\7\21\21\0\1\21\1\0\4\21"+
    "\2\0\16\21\1\226\12\21\21\0\1\21\1\0\4\21"+
    "\2\0\22\21\1\u0102\6\21\21\0\1\21\1\0\4\21"+
    "\2\0\5\21\1\u0103\23\21\21\0\1\21\1\0\1\21"+
    "\1\36\2\21\2\0\31\21\21\0\1\21\1\0\4\21"+
    "\2\0\21\21\1\u0104\7\21\21\0\1\21\1\0\4\21"+
    "\2\0\23\21\1\241\5\21\21\0\1\21\1\0\4\21"+
    "\2\0\4\21\1\223\24\21\35\0\1\262\14\0\1\334"+
    "\44\0\1\u0105\62\0\1\337\42\0\1\u0106\1\0\1\274"+
    "\57\0\1\344\1\0\1\372\57\0\1\u0107\63\0\1\21"+
    "\1\0\4\21\2\0\16\21\1\u0108\12\21\21\0\1\21"+
    "\1\0\4\21\2\0\5\21\1\u0109\23\21\21\0\1\21"+
    "\1\0\4\21\2\0\27\21\1\36\1\21\21\0\1\21"+
    "\1\0\4\21\2\0\21\21\1\u010a\1\u010b\6\21\21\0"+
    "\1\21\1\0\4\21\2\0\16\21\1\u010c\12\21\21\0"+
    "\1\21\1\0\4\21\2\0\16\21\1\u010d\12\21\21\0"+
    "\1\21\1\0\4\21\2\0\11\21\1\u010e\17\21\21\0"+
    "\1\21\1\0\4\21\2\0\21\21\1\u010f\7\21\21\0"+
    "\1\21\1\0\4\21\2\0\1\21\1\331\27\21\42\0"+
    "\1\336\36\0\1\u0106\1\0\1\372\57\0\1\u0107\1\0"+
    "\1\277\61\0\1\21\1\0\1\21\1\u0110\2\21\2\0"+
    "\31\21\21\0\1\21\1\0\4\21\2\0\15\21\1\u0111"+
    "\13\21\21\0\1\21\1\0\4\21\2\0\5\21\1\130"+
    "\23\21\21\0\1\21\1\0\4\21\2\0\11\21\1\134"+
    "\17\21\21\0\1\21\1\0\4\21\2\0\20\21\1\u0112"+
    "\10\21\21\0\1\21\1\0\4\21\2\0\7\21\1\u0113"+
    "\21\21\21\0\1\21\1\0\4\21\2\0\4\21\1\u0114"+
    "\24\21\21\0\1\21\1\0\4\21\2\0\4\21\1\242"+
    "\24\21\21\0\1\21\1\0\4\21\2\0\11\21\1\36"+
    "\17\21\21\0\1\21\1\0\4\21\2\0\23\21\1\137"+
    "\5\21\21\0\1\21\1\0\4\21\2\0\24\21\1\u0115"+
    "\4\21\21\0\1\21\1\0\4\21\2\0\21\21\1\u0116"+
    "\7\21\21\0\1\21\1\0\4\21\2\0\1\21\1\u0117"+
    "\27\21\21\0\1\21\1\0\4\21\2\0\5\21\1\36"+
    "\23\21\21\0\1\21\1\0\4\21\2\0\1\21\1\u0118"+
    "\27\21\21\0\1\21\1\0\4\21\2\0\4\21\1\36"+
    "\24\21\21\0\1\21\1\0\4\21\2\0\14\21\1\242"+
    "\14\21\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12250];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\0\1\11\1\1\7\11\3\1\1\11"+
    "\1\1\1\11\22\1\1\11\1\1\1\0\2\1\1\11"+
    "\1\1\1\11\1\0\1\1\6\0\1\1\1\11\3\1"+
    "\1\0\2\1\4\0\40\1\1\0\1\11\1\1\10\11"+
    "\10\0\4\1\1\11\1\1\3\0\2\1\1\0\5\1"+
    "\1\0\46\1\10\0\1\1\2\0\1\1\1\11\2\0"+
    "\2\1\1\0\2\1\1\0\32\1\1\0\1\11\5\0"+
    "\3\1\2\0\17\1\3\0\14\1\1\0\23\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[280];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    StringBuilder string = new StringBuilder();
    public String lexeme;
    public int linea;
    public int columna;
    private int comment_count = 0;
    public String msg = "";
    private int par_apcount = 0;
    public boolean parentesisIguales(){return par_apcount==0;}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 38: break;
          case 2:
            { this.msg = "Código de error 1: Símbolo no reconocido ";lexeme=yytext();linea=this.yyline+1;return ERROR;
            }
            // fall through
          case 39: break;
          case 3:
            { /*Ignore*/
            }
            // fall through
          case 40: break;
          case 4:
            { lexeme=yytext();linea = this.yyline+1; return Simbolo_Especial;
            }
            // fall through
          case 41: break;
          case 5:
            { yybegin(STRING); string.setLength(0); string.append("\"");
            }
            // fall through
          case 42: break;
          case 6:
            { par_apcount++;
        lexeme=yytext();linea = this.yyline+1; return SA_Parentesis;
            }
            // fall through
          case 43: break;
          case 7:
            { par_apcount--;
        lexeme=yytext();linea = this.yyline+1; return SA_Parentesis;
            }
            // fall through
          case 44: break;
          case 8:
            { lexeme=yytext();linea = this.yyline+1; return Multiplicacion;
            }
            // fall through
          case 45: break;
          case 9:
            { lexeme=yytext();linea = this.yyline+1; return Suma;
            }
            // fall through
          case 46: break;
          case 10:
            { lexeme=yytext();linea = this.yyline+1; return Resta;
            }
            // fall through
          case 47: break;
          case 11:
            { lexeme=yytext();linea = this.yyline+1; return Division;
            }
            // fall through
          case 48: break;
          case 12:
            { lexeme=yytext(); linea = this.yyline+1; return Numero;
            }
            // fall through
          case 49: break;
          case 13:
            { lexeme=yytext();linea = this.yyline+1; return Asignacion;
            }
            // fall through
          case 50: break;
          case 14:
            { lexeme=yytext(); linea = this.yyline+1; return Identificador;
            }
            // fall through
          case 51: break;
          case 15:
            { lexeme=yytext();linea = this.yyline+1; return SA_Corchetes;
            }
            // fall through
          case 52: break;
          case 16:
            { lexeme=yytext();linea = this.yyline+1; return P_Reservada;
            }
            // fall through
          case 53: break;
          case 17:
            { lexeme=yytext();linea = this.yyline+1; return SA_Llaves;
            }
            // fall through
          case 54: break;
          case 18:
            { string.append( yytext() );
            }
            // fall through
          case 55: break;
          case 19:
            { this.msg = "Código de error 4: La cadena no esta cerrada "; lexeme=string.toString(); linea = this.yyline+1; yybegin(YYINITIAL); return ERROR;
            }
            // fall through
          case 56: break;
          case 20:
            { yybegin(YYINITIAL);string.append("\"");lexeme=string.toString();linea=this.yyline+1;return Texto;
            }
            // fall through
          case 57: break;
          case 21:
            { this.msg = "Código de error 3: Formato de número decimal incorrecto, debe tener al menos un dígito antes del punto "; lexeme=yytext(); linea = this.yyline+1; return ERROR;
            }
            // fall through
          case 58: break;
          case 22:
            { this.msg = "Código de error 6: Cadena inválida "; lexeme=yytext(); linea = this.yyline+1; return ERROR;
            }
            // fall through
          case 59: break;
          case 23:
            { this.msg = "Código de error 2: Formato de número decimal incorrecto "; lexeme=yytext(); linea = this.yyline+1; return ERROR;
            }
            // fall through
          case 60: break;
          case 24:
            { if (--comment_count == 0) yybegin(YYINITIAL);
            }
            // fall through
          case 61: break;
          case 25:
            { comment_count++;
            }
            // fall through
          case 62: break;
          case 26:
            { string.append( '\"' );
            }
            // fall through
          case 63: break;
          case 27:
            { string.append( '\'' );
            }
            // fall through
          case 64: break;
          case 28:
            { string.append( '\\' );
            }
            // fall through
          case 65: break;
          case 29:
            { string.append( '\b' );
            }
            // fall through
          case 66: break;
          case 30:
            { string.append( '\f' );
            }
            // fall through
          case 67: break;
          case 31:
            { string.append( '\n' );
            }
            // fall through
          case 68: break;
          case 32:
            { string.append( '\r' );
            }
            // fall through
          case 69: break;
          case 33:
            { string.append( '\t' );
            }
            // fall through
          case 70: break;
          case 34:
            { lexeme=yytext();linea = this.yyline+1; return Decimal;
            }
            // fall through
          case 71: break;
          case 35:
            { this.msg = "Código de error 5: Formato de tiempo incorrecto, debe estar separado por un espacio "; lexeme=yytext(); linea = this.yyline+1; return ERROR;
            }
            // fall through
          case 72: break;
          case 36:
            { lexeme=yytext();linea = this.yyline+1; return Tiempo;
            }
            // fall through
          case 73: break;
          case 37:
            { lexeme=yytext();linea = this.yyline+1; return Propiedad;
            }
            // fall through
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
