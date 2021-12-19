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
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\5\1\0"+
    "\1\6\2\7\2\0\1\10\1\11\1\12\1\13\1\14"+
    "\1\1\1\15\1\16\1\17\12\20\3\7\1\21\1\7"+
    "\2\0\32\22\1\23\1\24\1\23\1\0\1\25\1\0"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\2\22\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\22\1\52\1\53"+
    "\1\54\1\55\1\0\1\55\7\0\1\3\u01a2\0\2\3"+
    "\326\0\u0100\3";

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
    "\1\7\1\10\1\11\1\12\1\2\1\13\1\14\1\15"+
    "\1\16\1\17\14\16\1\20\5\16\1\21\1\1\1\0"+
    "\1\1\1\22\2\23\1\24\1\0\1\25\5\0\1\3"+
    "\2\0\1\26\1\14\3\0\27\16\1\20\3\16\1\0"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\6\0\2\3\1\0\4\25\1\41\1\26"+
    "\3\25\1\42\2\25\21\16\1\20\14\16\5\0\1\3"+
    "\1\26\1\25\1\43\2\25\1\41\30\16\3\0\17\16"+
    "\1\0\1\44\1\0\43\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[240];
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
    "\0\0\0\56\0\134\0\212\0\270\0\212\0\212\0\212"+
    "\0\212\0\212\0\212\0\212\0\346\0\u0114\0\u0142\0\212"+
    "\0\u0170\0\212\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u0170\0\u03c6"+
    "\0\u03f4\0\u0422\0\u0450\0\u047e\0\212\0\u04ac\0\u04da\0\u0508"+
    "\0\u0536\0\212\0\u0564\0\212\0\u0592\0\u05c0\0\u05ee\0\u061c"+
    "\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c"+
    "\0\u07ba\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc"+
    "\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c"+
    "\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc"+
    "\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e\0\212"+
    "\0\u0d1e\0\212\0\212\0\212\0\212\0\212\0\212\0\212"+
    "\0\212\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\212"+
    "\0\u0e60\0\u0e8e\0\u0702\0\u0ebc\0\u0eea\0\u0f18\0\u075e\0\u0f46"+
    "\0\u07ba\0\u07e8\0\u0816\0\u0702\0\u0f74\0\u0fa2\0\u0fd0\0\u0ffe"+
    "\0\u102c\0\u105a\0\u1088\0\u10b6\0\u10e4\0\u1112\0\u1140\0\u116e"+
    "\0\u119c\0\u11ca\0\u11f8\0\u1226\0\u1254\0\u1282\0\u12b0\0\u12de"+
    "\0\u130c\0\u133a\0\u1368\0\u1396\0\u13c4\0\u13f2\0\u1420\0\u144e"+
    "\0\u147c\0\u14aa\0\u14d8\0\u1506\0\u1534\0\u1562\0\u1590\0\u15be"+
    "\0\u15ec\0\u0e04\0\u0e8e\0\u0e8e\0\u0702\0\u161a\0\u1648\0\u0f46"+
    "\0\u1676\0\u16a4\0\u16d2\0\u1700\0\u172e\0\u175c\0\u178a\0\u17b8"+
    "\0\u17e6\0\u1814\0\u1842\0\u1870\0\u189e\0\u18cc\0\u18fa\0\u1928"+
    "\0\u1956\0\u1984\0\u19b2\0\u19e0\0\u1a0e\0\u1a3c\0\u1a6a\0\u1a98"+
    "\0\u1ac6\0\u1af4\0\u1b22\0\u1b50\0\u1b7e\0\u1bac\0\u1bda\0\u1c08"+
    "\0\u1c36\0\u1c64\0\u1c92\0\u1cc0\0\u1cee\0\u1d1c\0\u1d4a\0\u1d78"+
    "\0\u1da6\0\u1dd4\0\u1e02\0\212\0\u1e30\0\u1e5e\0\u1e8c\0\u1eba"+
    "\0\u1ee8\0\u1f16\0\u1f44\0\u1f72\0\u1fa0\0\u1fce\0\u1ffc\0\u202a"+
    "\0\u2058\0\u2086\0\u20b4\0\u20e2\0\u2110\0\u213e\0\u216c\0\u219a"+
    "\0\u21c8\0\u21f6\0\u2224\0\u2252\0\u2280\0\u22ae\0\u22dc\0\u230a"+
    "\0\u2338\0\u2366\0\u2394\0\u23c2\0\u23f0\0\u241e\0\u244c\0\u247a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[240];
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
    "\1\21\1\22\1\4\1\21\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\21\1\41\1\42\1\43\1\21\1\44"+
    "\1\21\1\37\1\21\1\45\13\46\1\47\3\46\1\50"+
    "\36\46\2\51\1\52\1\51\1\53\1\51\1\54\15\51"+
    "\1\55\31\51\57\0\2\5\1\0\2\5\70\0\1\56"+
    "\5\0\1\57\3\0\1\60\1\0\1\61\6\0\1\62"+
    "\25\0\1\63\3\0\1\64\36\0\2\65\3\0\1\66"+
    "\10\65\1\67\1\65\1\70\14\65\1\71\2\65\1\72"+
    "\5\65\1\73\7\65\20\0\1\21\1\0\1\21\2\0"+
    "\30\21\21\0\1\21\1\0\1\21\2\0\16\21\1\74"+
    "\11\21\21\0\1\21\1\0\1\21\2\0\12\21\1\75"+
    "\15\21\21\0\1\21\1\0\1\21\2\0\1\21\1\76"+
    "\13\21\1\77\12\21\21\0\1\21\1\0\1\21\2\0"+
    "\5\21\1\100\3\21\1\101\16\21\21\0\1\21\1\0"+
    "\1\21\2\0\14\21\1\102\4\21\1\103\6\21\21\0"+
    "\1\21\1\0\1\21\2\0\1\21\1\104\7\21\1\105"+
    "\16\21\21\0\1\21\1\0\1\21\2\0\11\21\1\106"+
    "\6\21\1\107\7\21\21\0\1\21\1\0\1\21\2\0"+
    "\1\21\1\110\16\21\1\37\7\21\21\0\1\21\1\0"+
    "\1\21\2\0\14\21\1\111\12\21\1\112\21\0\1\21"+
    "\1\0\1\21\2\0\5\21\1\113\7\21\1\114\12\21"+
    "\21\0\1\21\1\0\1\21\2\0\11\21\1\115\3\21"+
    "\1\116\12\21\21\0\1\21\1\0\1\21\2\0\15\21"+
    "\1\37\12\21\21\0\1\21\1\0\1\21\2\0\20\21"+
    "\1\117\7\21\21\0\1\21\1\0\1\21\2\0\5\21"+
    "\1\120\22\21\21\0\1\21\1\0\1\21\2\0\1\21"+
    "\1\121\3\21\1\122\3\21\1\123\16\21\21\0\1\21"+
    "\1\0\1\21\2\0\5\21\1\124\3\21\1\125\16\21"+
    "\21\0\1\21\1\0\1\21\2\0\5\21\1\126\22\21"+
    "\1\0\13\46\1\127\55\46\1\127\3\46\1\130\51\46"+
    "\1\131\42\46\2\51\1\0\1\51\1\0\1\51\1\0"+
    "\15\51\1\0\31\51\2\0\1\52\53\0\2\52\3\0"+
    "\1\52\1\132\1\52\1\133\13\52\1\134\2\52\1\135"+
    "\3\52\1\136\5\52\1\137\3\52\1\140\1\52\1\141"+
    "\6\52\20\0\1\56\100\0\1\142\60\0\1\143\45\0"+
    "\1\144\64\0\1\145\10\0\13\146\1\147\42\146\2\64"+
    "\1\150\1\64\1\151\51\64\2\65\3\0\11\65\1\152"+
    "\1\65\1\153\1\65\1\153\2\65\30\153\3\65\3\0"+
    "\11\65\1\152\1\65\1\153\1\65\1\153\2\65\10\153"+
    "\1\154\2\153\1\155\5\153\1\156\6\153\3\65\3\0"+
    "\11\65\1\152\1\65\1\157\1\65\1\153\2\65\30\153"+
    "\3\65\3\0\1\66\10\65\1\160\1\65\1\70\1\65"+
    "\1\153\2\65\10\153\1\161\2\153\1\162\5\153\1\163"+
    "\6\153\3\65\3\0\11\65\1\152\1\65\1\153\1\65"+
    "\1\153\2\65\20\153\1\164\7\153\3\65\3\0\11\65"+
    "\1\152\1\65\1\153\1\65\1\153\2\65\11\153\1\165"+
    "\16\153\3\65\3\0\11\65\1\152\1\65\1\153\1\65"+
    "\1\153\2\65\5\153\1\166\22\153\1\65\20\0\1\21"+
    "\1\0\1\21\2\0\1\21\1\167\26\21\21\0\1\21"+
    "\1\0\1\21\2\0\15\21\1\170\12\21\21\0\1\21"+
    "\1\0\1\21\2\0\21\21\1\36\6\21\21\0\1\21"+
    "\1\0\1\21\2\0\13\21\1\36\14\21\21\0\1\21"+
    "\1\0\1\21\2\0\3\21\1\171\2\21\1\172\11\21"+
    "\1\173\7\21\21\0\1\21\1\0\1\21\2\0\21\21"+
    "\1\174\6\21\21\0\1\21\1\0\1\21\2\0\22\21"+
    "\1\175\5\21\21\0\1\21\1\0\1\21\2\0\22\21"+
    "\1\176\5\21\21\0\1\21\1\0\1\21\2\0\3\21"+
    "\1\177\6\21\1\76\15\21\21\0\1\21\1\0\1\21"+
    "\2\0\14\21\1\200\13\21\21\0\1\21\1\0\1\21"+
    "\2\0\20\21\1\201\7\21\21\0\1\21\1\0\1\21"+
    "\2\0\1\21\1\202\26\21\21\0\1\21\1\0\1\21"+
    "\2\0\3\21\1\203\24\21\21\0\1\21\1\0\1\21"+
    "\2\0\3\21\1\204\5\21\1\205\10\21\1\206\5\21"+
    "\21\0\1\21\1\0\1\21\2\0\17\21\1\207\10\21"+
    "\21\0\1\21\1\0\1\21\2\0\4\21\1\210\23\21"+
    "\21\0\1\21\1\0\1\21\2\0\7\21\1\211\20\21"+
    "\21\0\1\21\1\0\1\21\2\0\5\21\1\212\6\21"+
    "\1\37\13\21\21\0\1\21\1\0\1\21\2\0\21\21"+
    "\1\213\1\214\5\21\21\0\1\21\1\0\1\21\2\0"+
    "\5\21\1\215\22\21\21\0\1\21\1\0\1\21\2\0"+
    "\16\21\1\216\11\21\21\0\1\21\1\0\1\21\2\0"+
    "\12\21\1\217\15\21\21\0\1\21\1\0\1\21\2\0"+
    "\7\21\1\37\2\21\1\220\15\21\21\0\1\21\1\0"+
    "\1\21\2\0\14\21\1\36\13\21\21\0\1\21\1\0"+
    "\1\21\2\0\25\21\1\221\2\21\21\0\1\21\1\0"+
    "\1\21\2\0\5\21\1\222\22\21\21\0\1\21\1\0"+
    "\1\21\2\0\3\21\1\223\14\21\1\224\7\21\1\0"+
    "\13\46\1\127\3\46\1\0\36\46\26\0\1\225\76\0"+
    "\1\226\53\0\1\227\42\0\1\230\23\0\13\146\1\231"+
    "\55\146\1\231\3\146\1\232\36\146\2\0\1\150\53\0"+
    "\2\65\3\0\11\65\1\233\1\65\1\234\1\65\1\234"+
    "\2\65\30\234\3\65\3\0\11\65\1\152\1\65\1\153"+
    "\1\65\1\153\2\65\20\153\1\235\7\153\3\65\3\0"+
    "\11\65\1\152\1\65\1\153\1\65\1\153\2\65\11\153"+
    "\1\236\16\153\3\65\3\0\11\65\1\152\1\65\1\153"+
    "\1\65\1\153\2\65\5\153\1\237\22\153\3\65\3\0"+
    "\11\65\1\233\1\65\1\240\1\65\1\234\2\65\30\234"+
    "\3\65\3\0\11\65\1\152\1\65\1\153\1\65\1\153"+
    "\2\65\14\153\1\164\13\153\3\65\3\0\11\65\1\152"+
    "\1\65\1\153\1\65\1\153\2\65\7\153\1\164\20\153"+
    "\1\65\20\0\1\21\1\0\1\21\2\0\7\21\1\201"+
    "\20\21\21\0\1\21\1\0\1\21\2\0\17\21\1\241"+
    "\10\21\21\0\1\21\1\0\1\21\2\0\11\21\1\242"+
    "\16\21\21\0\1\21\1\0\1\21\2\0\11\21\1\243"+
    "\16\21\21\0\1\21\1\0\1\21\2\0\5\21\1\244"+
    "\22\21\21\0\1\21\1\0\1\21\2\0\16\21\1\245"+
    "\11\21\21\0\1\21\1\0\1\21\2\0\5\21\1\246"+
    "\22\21\21\0\1\21\1\0\1\21\2\0\1\21\1\247"+
    "\26\21\21\0\1\21\1\0\1\21\2\0\11\21\1\250"+
    "\16\21\21\0\1\21\1\0\1\21\2\0\1\251\27\21"+
    "\21\0\1\21\1\0\1\21\2\0\1\21\1\252\26\21"+
    "\21\0\1\21\1\0\1\21\2\0\4\21\1\253\23\21"+
    "\21\0\1\21\1\0\1\21\2\0\5\21\1\252\22\21"+
    "\21\0\1\21\1\0\1\21\2\0\12\21\1\254\15\21"+
    "\21\0\1\21\1\0\1\21\2\0\3\21\1\255\24\21"+
    "\21\0\1\21\1\0\1\21\2\0\5\21\1\256\22\21"+
    "\21\0\1\21\1\0\1\21\2\0\23\21\1\257\4\21"+
    "\21\0\1\21\1\0\1\21\2\0\1\260\27\21\21\0"+
    "\1\21\1\0\1\21\2\0\11\21\1\261\16\21\21\0"+
    "\1\21\1\0\1\21\2\0\14\21\1\262\13\21\21\0"+
    "\1\21\1\0\1\21\2\0\22\21\1\106\5\21\21\0"+
    "\1\21\1\0\1\21\2\0\15\21\1\252\12\21\21\0"+
    "\1\21\1\0\1\21\2\0\14\21\1\263\13\21\21\0"+
    "\1\21\1\0\1\21\2\0\5\21\1\264\22\21\21\0"+
    "\1\21\1\0\1\21\2\0\11\21\1\252\16\21\21\0"+
    "\1\21\1\0\1\21\2\0\5\21\1\265\22\21\21\0"+
    "\1\21\1\0\1\21\2\0\22\21\1\36\5\21\21\0"+
    "\1\21\1\0\1\21\2\0\13\21\1\266\14\21\21\0"+
    "\1\21\1\0\1\21\2\0\5\21\1\267\22\21\21\0"+
    "\1\21\1\0\1\21\2\0\4\21\1\270\23\21\35\0"+
    "\1\227\47\0\1\271\55\0\1\272\70\0\1\273\14\0"+
    "\13\146\1\231\3\146\1\150\36\146\2\65\3\0\11\65"+
    "\1\152\1\65\1\153\1\65\1\153\2\65\14\153\1\235"+
    "\13\153\3\65\3\0\11\65\1\152\1\65\1\153\1\65"+
    "\1\153\2\65\7\153\1\235\20\153\1\65\20\0\1\21"+
    "\1\0\1\21\2\0\23\21\1\274\4\21\21\0\1\21"+
    "\1\0\1\21\2\0\13\21\1\275\14\21\21\0\1\21"+
    "\1\0\1\21\2\0\14\21\1\217\13\21\21\0\1\21"+
    "\1\0\1\21\2\0\3\21\1\276\24\21\21\0\1\21"+
    "\1\0\1\21\2\0\12\21\1\277\15\21\21\0\1\21"+
    "\1\0\1\21\2\0\20\21\1\36\7\21\21\0\1\21"+
    "\1\0\1\21\2\0\4\21\1\36\23\21\21\0\1\21"+
    "\1\0\1\21\2\0\12\21\1\300\15\21\21\0\1\21"+
    "\1\0\1\21\2\0\2\21\1\24\13\21\1\301\5\21"+
    "\1\201\3\21\21\0\1\21\1\0\1\21\2\0\20\21"+
    "\1\37\7\21\21\0\1\21\1\0\1\21\2\0\15\21"+
    "\1\267\12\21\21\0\1\21\1\0\1\21\2\0\23\21"+
    "\1\217\4\21\21\0\1\21\1\0\1\21\2\0\11\21"+
    "\1\302\16\21\21\0\1\21\1\0\1\21\2\0\14\21"+
    "\1\303\13\21\21\0\1\21\1\0\1\21\2\0\11\21"+
    "\1\304\16\21\21\0\1\21\1\0\1\21\2\0\16\21"+
    "\1\305\1\21\1\306\1\307\6\21\21\0\1\21\1\0"+
    "\1\21\2\0\3\21\1\36\24\21\21\0\1\21\1\0"+
    "\1\21\2\0\22\21\1\310\5\21\21\0\1\21\1\0"+
    "\1\21\2\0\4\21\1\203\23\21\21\0\1\21\1\0"+
    "\1\21\2\0\22\21\1\217\5\21\21\0\1\21\1\0"+
    "\1\21\2\0\3\21\1\311\24\21\21\0\1\21\1\0"+
    "\1\21\2\0\16\21\1\36\11\21\21\0\1\21\1\0"+
    "\1\21\2\0\21\21\1\37\6\21\21\0\1\21\1\0"+
    "\1\21\2\0\1\21\1\312\26\21\32\0\1\313\71\0"+
    "\1\314\41\0\1\315\44\0\1\21\1\0\1\21\2\0"+
    "\5\21\1\37\22\21\21\0\1\21\1\0\1\21\2\0"+
    "\1\21\1\316\26\21\21\0\1\21\1\0\1\21\2\0"+
    "\10\21\1\317\17\21\21\0\1\21\1\0\1\21\2\0"+
    "\1\21\1\320\26\21\21\0\1\21\1\0\1\21\2\0"+
    "\1\321\27\21\21\0\1\21\1\0\1\21\2\0\20\21"+
    "\1\322\7\21\21\0\1\21\1\0\1\21\2\0\15\21"+
    "\1\323\12\21\21\0\1\21\1\0\1\21\2\0\21\21"+
    "\1\324\6\21\21\0\1\21\1\0\1\21\2\0\5\21"+
    "\1\325\22\21\21\0\1\21\1\0\1\21\2\0\1\21"+
    "\1\326\26\21\21\0\1\21\1\0\1\21\2\0\7\21"+
    "\1\327\20\21\21\0\1\21\1\0\1\21\2\0\5\21"+
    "\1\330\22\21\21\0\1\21\1\0\1\21\2\0\20\21"+
    "\1\331\7\21\21\0\1\21\1\0\1\21\2\0\22\21"+
    "\1\214\5\21\21\0\1\21\1\0\1\21\2\0\4\21"+
    "\1\175\23\21\43\0\1\314\45\0\1\272\43\0\1\21"+
    "\1\0\1\21\2\0\12\21\1\37\15\21\21\0\1\21"+
    "\1\0\1\21\2\0\1\21\1\37\26\21\21\0\1\21"+
    "\1\0\1\21\2\0\26\21\1\37\1\21\21\0\1\21"+
    "\1\0\1\21\2\0\2\21\1\24\5\21\1\332\2\21"+
    "\1\333\4\21\1\41\1\334\6\21\21\0\1\21\1\0"+
    "\1\21\2\0\15\21\1\335\12\21\21\0\1\21\1\0"+
    "\1\21\2\0\1\336\27\21\21\0\1\21\1\0\1\21"+
    "\2\0\11\21\1\337\16\21\21\0\1\21\1\0\1\21"+
    "\2\0\20\21\1\340\7\21\21\0\1\21\1\0\1\21"+
    "\2\0\14\21\1\341\13\21\21\0\1\21\1\0\1\21"+
    "\2\0\2\21\1\37\25\21\21\0\1\21\1\0\1\21"+
    "\2\0\13\21\1\342\14\21\21\0\1\21\1\0\1\21"+
    "\2\0\1\21\1\267\26\21\21\0\1\21\1\0\1\21"+
    "\2\0\1\21\1\343\26\21\21\0\1\21\1\0\1\21"+
    "\2\0\11\21\1\344\16\21\21\0\1\21\1\0\1\21"+
    "\2\0\5\21\1\345\3\21\1\123\16\21\21\0\1\21"+
    "\1\0\1\21\2\0\7\21\1\346\20\21\21\0\1\21"+
    "\1\0\1\21\2\0\16\21\1\301\5\21\1\201\3\21"+
    "\21\0\1\21\1\0\1\21\2\0\4\21\1\347\23\21"+
    "\21\0\1\21\1\0\1\21\2\0\4\21\1\317\23\21"+
    "\21\0\1\21\1\0\1\21\2\0\5\21\1\316\22\21"+
    "\21\0\1\21\1\0\1\21\2\0\1\21\1\350\26\21"+
    "\21\0\1\21\1\0\1\21\2\0\3\21\1\351\24\21"+
    "\21\0\1\21\1\0\1\21\2\0\5\21\1\212\22\21"+
    "\21\0\1\21\1\0\1\21\2\0\12\21\1\220\15\21"+
    "\21\0\1\21\1\0\1\21\2\0\20\21\1\352\7\21"+
    "\21\0\1\21\1\0\1\21\2\0\1\21\1\353\26\21"+
    "\21\0\1\21\1\0\1\21\2\0\6\21\1\354\21\21"+
    "\21\0\1\21\1\0\1\21\2\0\5\21\1\355\22\21"+
    "\21\0\1\21\1\0\1\21\2\0\1\21\1\356\26\21"+
    "\21\0\1\21\1\0\1\21\2\0\4\21\1\37\23\21"+
    "\21\0\1\21\1\0\1\21\2\0\15\21\1\246\12\21"+
    "\21\0\1\21\1\0\1\21\2\0\20\21\1\357\7\21"+
    "\21\0\1\21\1\0\1\21\2\0\13\21\1\317\14\21"+
    "\21\0\1\21\1\0\1\21\2\0\1\360\27\21\21\0"+
    "\1\21\1\0\1\21\2\0\13\21\1\333\14\21\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9384];
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
    "\1\1\1\11\1\0\1\1\5\0\1\1\2\0\2\1"+
    "\3\0\33\1\1\0\1\11\1\1\10\11\6\0\1\11"+
    "\1\1\1\0\52\1\5\0\37\1\3\0\17\1\1\0"+
    "\1\11\1\0\43\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[240];
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
          case 37: break;
          case 2:
            { this.msg = "Código de error 1: Símbolo no reconocido ";lexeme=yytext();linea=this.yyline+1;return ERROR;
            }
            // fall through
          case 38: break;
          case 3:
            { /*Ignore*/
            }
            // fall through
          case 39: break;
          case 4:
            { yybegin(STRING); string.setLength(0); string.append("\"");
            }
            // fall through
          case 40: break;
          case 5:
            { lexeme=yytext();linea = this.yyline+1; return Simbolo_Especial;
            }
            // fall through
          case 41: break;
          case 6:
            { par_apcount++;
        lexeme=yytext();linea = this.yyline+1; return SA_Parentesis;
            }
            // fall through
          case 42: break;
          case 7:
            { par_apcount--;
        lexeme=yytext();linea = this.yyline+1; return SA_Parentesis;
            }
            // fall through
          case 43: break;
          case 8:
            { lexeme=yytext();linea = this.yyline+1; return Multiplicacion;
            }
            // fall through
          case 44: break;
          case 9:
            { lexeme=yytext();linea = this.yyline+1; return Suma;
            }
            // fall through
          case 45: break;
          case 10:
            { lexeme=yytext();linea = this.yyline+1; return Resta;
            }
            // fall through
          case 46: break;
          case 11:
            { lexeme=yytext();linea = this.yyline+1; return Division;
            }
            // fall through
          case 47: break;
          case 12:
            { lexeme=yytext(); linea = this.yyline+1; return Numero;
            }
            // fall through
          case 48: break;
          case 13:
            { lexeme=yytext();linea = this.yyline+1; return Asignacion;
            }
            // fall through
          case 49: break;
          case 14:
            { lexeme=yytext(); linea = this.yyline+1; return Identificador;
            }
            // fall through
          case 50: break;
          case 15:
            { lexeme=yytext();linea = this.yyline+1; return SA_Corchetes;
            }
            // fall through
          case 51: break;
          case 16:
            { lexeme=yytext();linea = this.yyline+1; return P_Reservada;
            }
            // fall through
          case 52: break;
          case 17:
            { lexeme=yytext();linea = this.yyline+1; return SA_Llaves;
            }
            // fall through
          case 53: break;
          case 18:
            { string.append( yytext() );
            }
            // fall through
          case 54: break;
          case 19:
            { this.msg = "Código de error 4: La cadena no esta cerrada "; lexeme=string.toString(); linea = this.yyline+1; yybegin(YYINITIAL); return ERROR;
            }
            // fall through
          case 55: break;
          case 20:
            { yybegin(YYINITIAL);string.append("\"");lexeme=string.toString();linea=this.yyline+1;return Texto;
            }
            // fall through
          case 56: break;
          case 21:
            { this.msg = "Código de error 3: Formato de número incorrecto "; lexeme=yytext(); linea = this.yyline+1; return ERROR;
            }
            // fall through
          case 57: break;
          case 22:
            { this.msg = "Código de error 2: Formato de número decimal incorrecto "; lexeme=yytext(); linea = this.yyline+1; return ERROR;
            }
            // fall through
          case 58: break;
          case 23:
            { if (--comment_count == 0) yybegin(YYINITIAL);
            }
            // fall through
          case 59: break;
          case 24:
            { comment_count++;
            }
            // fall through
          case 60: break;
          case 25:
            { string.append( '\"' );
            }
            // fall through
          case 61: break;
          case 26:
            { string.append( '\'' );
            }
            // fall through
          case 62: break;
          case 27:
            { string.append( '\\' );
            }
            // fall through
          case 63: break;
          case 28:
            { string.append( '\b' );
            }
            // fall through
          case 64: break;
          case 29:
            { string.append( '\f' );
            }
            // fall through
          case 65: break;
          case 30:
            { string.append( '\n' );
            }
            // fall through
          case 66: break;
          case 31:
            { string.append( '\r' );
            }
            // fall through
          case 67: break;
          case 32:
            { string.append( '\t' );
            }
            // fall through
          case 68: break;
          case 33:
            { lexeme=yytext();linea = this.yyline+1; return Decimal;
            }
            // fall through
          case 69: break;
          case 34:
            { this.msg = "Código de error 5: Formato de tiempo incorrecto, debe estar separado por un espacio "; lexeme=yytext(); linea = this.yyline+1; return ERROR;
            }
            // fall through
          case 70: break;
          case 35:
            { lexeme=yytext();linea = this.yyline+1; return Tiempo;
            }
            // fall through
          case 71: break;
          case 36:
            { lexeme=yytext();linea = this.yyline+1; return Propiedad;
            }
            // fall through
          case 72: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
