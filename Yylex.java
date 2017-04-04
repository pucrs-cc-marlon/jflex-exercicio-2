/* The following code was generated by JFlex 1.4.3 on 03/04/17 21:27 */



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 03/04/17 21:27 from the specification file
 * <tt>asdr_lex.flex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\32\1\33\1\1\1\1\2\0\1\1\16\32\4\0\1\1\3\0"+
    "\1\2\3\0\1\35\1\35\1\0\1\35\1\35\3\0\12\34\1\0"+
    "\1\35\1\0\1\35\3\0\1\5\1\31\1\6\1\31\1\7\1\13"+
    "\7\31\1\12\1\11\2\31\1\4\1\31\1\3\6\31\4\0\1\10"+
    "\1\0\1\31\1\22\1\31\1\17\1\24\1\27\1\31\1\26\1\14"+
    "\2\31\1\23\1\31\1\15\1\20\3\31\1\30\1\16\1\21\1\31"+
    "\1\25\3\31\1\35\1\0\1\35\1\0\41\32\2\0\4\31\4\0"+
    "\1\31\2\0\1\32\7\0\1\31\4\0\1\31\5\0\27\31\1\0"+
    "\37\31\1\0\u01ca\31\4\0\14\31\16\0\5\31\7\0\1\31\1\0"+
    "\1\31\21\0\160\32\5\31\1\0\2\31\2\0\4\31\10\0\1\31"+
    "\1\0\3\31\1\0\1\31\1\0\24\31\1\0\123\31\1\0\213\31"+
    "\1\0\5\32\2\0\236\31\11\0\46\31\2\0\1\31\7\0\47\31"+
    "\7\0\1\31\1\0\55\32\1\0\1\32\1\0\2\32\1\0\2\32"+
    "\1\0\1\32\10\0\33\31\5\0\3\31\15\0\5\32\6\0\1\31"+
    "\4\0\13\32\5\0\53\31\37\32\4\0\2\31\1\32\143\31\1\0"+
    "\1\31\10\32\1\0\6\32\2\31\2\32\1\0\4\32\2\31\12\32"+
    "\3\31\2\0\1\31\17\0\1\32\1\31\1\32\36\31\33\32\2\0"+
    "\131\31\13\32\1\31\16\0\12\32\41\31\11\32\2\31\4\0\1\31"+
    "\5\0\26\31\4\32\1\31\11\32\1\31\3\32\1\31\5\32\22\0"+
    "\31\31\3\32\104\0\1\31\1\0\13\31\67\0\33\32\1\0\4\32"+
    "\66\31\3\32\1\31\22\32\1\31\7\32\12\31\2\32\2\0\12\32"+
    "\1\0\7\31\1\0\7\31\1\0\3\32\1\0\10\31\2\0\2\31"+
    "\2\0\26\31\1\0\7\31\1\0\1\31\3\0\4\31\2\0\1\32"+
    "\1\31\7\32\2\0\2\32\2\0\3\32\1\31\10\0\1\32\4\0"+
    "\2\31\1\0\3\31\2\32\2\0\12\32\4\31\7\0\1\31\5\0"+
    "\3\32\1\0\6\31\4\0\2\31\2\0\26\31\1\0\7\31\1\0"+
    "\2\31\1\0\2\31\1\0\2\31\2\0\1\32\1\0\5\32\4\0"+
    "\2\32\2\0\3\32\3\0\1\32\7\0\4\31\1\0\1\31\7\0"+
    "\14\32\3\31\1\32\13\0\3\32\1\0\11\31\1\0\3\31\1\0"+
    "\26\31\1\0\7\31\1\0\2\31\1\0\5\31\2\0\1\32\1\31"+
    "\10\32\1\0\3\32\1\0\3\32\2\0\1\31\17\0\2\31\2\32"+
    "\2\0\12\32\1\0\1\31\17\0\3\32\1\0\10\31\2\0\2\31"+
    "\2\0\26\31\1\0\7\31\1\0\2\31\1\0\5\31\2\0\1\32"+
    "\1\31\7\32\2\0\2\32\2\0\3\32\10\0\2\32\4\0\2\31"+
    "\1\0\3\31\2\32\2\0\12\32\1\0\1\31\20\0\1\32\1\31"+
    "\1\0\6\31\3\0\3\31\1\0\4\31\3\0\2\31\1\0\1\31"+
    "\1\0\2\31\3\0\2\31\3\0\3\31\3\0\14\31\4\0\5\32"+
    "\3\0\3\32\1\0\4\32\2\0\1\31\6\0\1\32\16\0\12\32"+
    "\11\0\1\31\7\0\3\32\1\0\10\31\1\0\3\31\1\0\27\31"+
    "\1\0\12\31\1\0\5\31\3\0\1\31\7\32\1\0\3\32\1\0"+
    "\4\32\7\0\2\32\1\0\2\31\6\0\2\31\2\32\2\0\12\32"+
    "\22\0\2\32\1\0\10\31\1\0\3\31\1\0\27\31\1\0\12\31"+
    "\1\0\5\31\2\0\1\32\1\31\7\32\1\0\3\32\1\0\4\32"+
    "\7\0\2\32\7\0\1\31\1\0\2\31\2\32\2\0\12\32\1\0"+
    "\2\31\17\0\2\32\1\0\10\31\1\0\3\31\1\0\51\31\2\0"+
    "\1\31\7\32\1\0\3\32\1\0\4\32\1\31\10\0\1\32\10\0"+
    "\2\31\2\32\2\0\12\32\12\0\6\31\2\0\2\32\1\0\22\31"+
    "\3\0\30\31\1\0\11\31\1\0\1\31\2\0\7\31\3\0\1\32"+
    "\4\0\6\32\1\0\1\32\1\0\10\32\22\0\2\32\15\0\60\31"+
    "\1\32\2\31\7\32\4\0\10\31\10\32\1\0\12\32\47\0\2\31"+
    "\1\0\1\31\2\0\2\31\1\0\1\31\2\0\1\31\6\0\4\31"+
    "\1\0\7\31\1\0\3\31\1\0\1\31\1\0\1\31\2\0\2\31"+
    "\1\0\4\31\1\32\2\31\6\32\1\0\2\32\1\31\2\0\5\31"+
    "\1\0\1\31\1\0\6\32\2\0\12\32\2\0\4\31\40\0\1\31"+
    "\27\0\2\32\6\0\12\32\13\0\1\32\1\0\1\32\1\0\1\32"+
    "\4\0\2\32\10\31\1\0\44\31\4\0\24\32\1\0\2\32\5\31"+
    "\13\32\1\0\44\32\11\0\1\32\71\0\53\31\24\32\1\31\12\32"+
    "\6\0\6\31\4\32\4\31\3\32\1\31\3\32\2\31\7\32\3\31"+
    "\4\32\15\31\14\32\1\31\17\32\2\0\46\31\1\0\1\31\5\0"+
    "\1\31\2\0\53\31\1\0\u014d\31\1\0\4\31\2\0\7\31\1\0"+
    "\1\31\1\0\4\31\2\0\51\31\1\0\4\31\2\0\41\31\1\0"+
    "\4\31\2\0\7\31\1\0\1\31\1\0\4\31\2\0\17\31\1\0"+
    "\71\31\1\0\4\31\2\0\103\31\2\0\3\32\40\0\20\31\20\0"+
    "\125\31\14\0\u026c\31\2\0\21\31\1\0\32\31\5\0\113\31\3\0"+
    "\3\31\17\0\15\31\1\0\4\31\3\32\13\0\22\31\3\32\13\0"+
    "\22\31\2\32\14\0\15\31\1\0\3\31\1\0\2\32\14\0\64\31"+
    "\40\32\3\0\1\31\3\0\2\31\1\32\2\0\12\32\41\0\3\32"+
    "\2\0\12\32\6\0\130\31\10\0\51\31\1\32\1\31\5\0\106\31"+
    "\12\0\35\31\3\0\14\32\4\0\14\32\12\0\12\32\36\31\2\0"+
    "\5\31\13\0\54\31\4\0\21\32\7\31\2\32\6\0\12\32\46\0"+
    "\27\31\5\32\4\0\65\31\12\32\1\0\35\32\2\0\13\32\6\0"+
    "\12\32\15\0\1\31\130\0\5\32\57\31\21\32\7\31\4\0\12\32"+
    "\21\0\11\32\14\0\3\32\36\31\15\32\2\31\12\32\54\31\16\32"+
    "\14\0\44\31\24\32\10\0\12\32\3\0\3\31\12\32\44\31\122\0"+
    "\3\32\1\0\25\32\4\31\1\32\4\31\3\32\2\31\11\0\300\31"+
    "\47\32\25\0\4\32\u0116\31\2\0\6\31\2\0\46\31\2\0\6\31"+
    "\2\0\10\31\1\0\1\31\1\0\1\31\1\0\1\31\1\0\37\31"+
    "\2\0\65\31\1\0\7\31\1\0\1\31\3\0\3\31\1\0\7\31"+
    "\3\0\4\31\2\0\6\31\4\0\15\31\5\0\3\31\1\0\7\31"+
    "\16\0\5\32\32\0\5\32\20\0\2\31\23\0\1\31\13\0\5\32"+
    "\5\0\6\32\1\0\1\31\15\0\1\31\20\0\15\31\3\0\33\31"+
    "\25\0\15\32\4\0\1\32\3\0\14\32\21\0\1\31\4\0\1\31"+
    "\2\0\12\31\1\0\1\31\3\0\5\31\6\0\1\31\1\0\1\31"+
    "\1\0\1\31\1\0\4\31\1\0\13\31\2\0\4\31\5\0\5\31"+
    "\4\0\1\31\21\0\51\31\u0a77\0\57\31\1\0\57\31\1\0\205\31"+
    "\6\0\4\31\3\32\2\31\14\0\46\31\1\0\1\31\5\0\1\31"+
    "\2\0\70\31\7\0\1\31\17\0\1\32\27\31\11\0\7\31\1\0"+
    "\7\31\1\0\7\31\1\0\7\31\1\0\7\31\1\0\7\31\1\0"+
    "\7\31\1\0\7\31\1\0\40\32\57\0\1\31\u01d5\0\3\31\31\0"+
    "\11\31\6\32\1\0\5\31\2\0\5\31\4\0\126\31\2\0\2\32"+
    "\2\0\3\31\1\0\132\31\1\0\4\31\5\0\51\31\3\0\136\31"+
    "\21\0\33\31\65\0\20\31\u0200\0\u19b6\31\112\0\u51cd\31\63\0\u048d\31"+
    "\103\0\56\31\2\0\u010d\31\3\0\20\31\12\32\2\31\24\0\57\31"+
    "\1\32\4\0\12\32\1\0\31\31\7\0\1\32\120\31\2\32\45\0"+
    "\11\31\2\0\147\31\2\0\4\31\1\0\4\31\14\0\13\31\115\0"+
    "\12\31\1\32\3\31\1\32\4\31\1\32\27\31\5\32\20\0\1\31"+
    "\7\0\64\31\14\0\2\32\62\31\21\32\13\0\12\32\6\0\22\32"+
    "\6\31\3\0\1\31\4\0\12\32\34\31\10\32\2\0\27\31\15\32"+
    "\14\0\35\31\3\0\4\32\57\31\16\32\16\0\1\31\12\32\46\0"+
    "\51\31\16\32\11\0\3\31\1\32\10\31\2\32\2\0\12\32\6\0"+
    "\27\31\3\0\1\31\1\32\4\0\60\31\1\32\1\31\3\32\2\31"+
    "\2\32\5\31\2\32\1\31\1\32\1\31\30\0\3\31\2\0\13\31"+
    "\5\32\2\0\3\31\2\32\12\0\6\31\2\0\6\31\2\0\6\31"+
    "\11\0\7\31\1\0\7\31\221\0\43\31\10\32\1\0\2\32\2\0"+
    "\12\32\6\0\u2ba4\31\14\0\27\31\4\0\61\31\u2104\0\u016e\31\2\0"+
    "\152\31\46\0\7\31\14\0\5\31\5\0\1\31\1\32\12\31\1\0"+
    "\15\31\1\0\5\31\1\0\1\31\1\0\2\31\1\0\2\31\1\0"+
    "\154\31\41\0\u016b\31\22\0\100\31\2\0\66\31\50\0\15\31\3\0"+
    "\20\32\20\0\7\32\14\0\2\31\30\0\3\31\31\0\1\31\6\0"+
    "\5\31\1\0\207\31\2\0\1\32\4\0\1\31\13\0\12\32\7\0"+
    "\32\31\4\0\1\31\1\0\32\31\13\0\131\31\3\0\6\31\2\0"+
    "\6\31\2\0\6\31\2\0\3\31\3\0\2\31\3\0\2\31\22\0"+
    "\3\32\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\6\3\1\4\1\5\2\3\1\6"+
    "\4\3\1\7\5\3\1\10\3\3\1\11\1\3\1\12"+
    "\2\3\1\13\1\3\1\14";

  private static int [] zzUnpackAction() {
    int [] result = new int[36];
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
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\322"+
    "\0\360\0\u010e\0\36\0\u012c\0\u014a\0\170\0\u0168\0\u0186"+
    "\0\u01a4\0\u01c2\0\170\0\u01e0\0\u01fe\0\u021c\0\u023a\0\u0258"+
    "\0\170\0\u0276\0\u0294\0\u02b2\0\170\0\u02d0\0\170\0\u02ee"+
    "\0\u030c\0\170\0\u032a\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[36];
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
    "\1\2\1\3\1\4\11\5\1\6\2\5\1\7\4\5"+
    "\1\10\1\11\4\5\1\2\1\3\1\12\1\13\37\0"+
    "\1\3\31\0\1\3\4\0\1\5\1\14\31\5\3\0"+
    "\33\5\3\0\13\5\1\15\11\5\1\16\5\5\3\0"+
    "\16\5\1\17\14\5\3\0\21\5\1\20\11\5\3\0"+
    "\24\5\1\21\6\5\35\0\1\12\3\0\2\5\1\22"+
    "\30\5\3\0\14\5\1\23\16\5\3\0\17\5\1\24"+
    "\13\5\3\0\26\5\1\25\4\5\3\0\12\5\1\26"+
    "\20\5\3\0\3\5\1\27\27\5\3\0\20\5\1\30"+
    "\12\5\3\0\22\5\1\31\10\5\3\0\21\5\1\32"+
    "\11\5\3\0\4\5\1\33\26\5\3\0\21\5\1\34"+
    "\11\5\3\0\22\5\1\35\10\5\3\0\5\5\1\36"+
    "\25\5\3\0\22\5\1\37\10\5\3\0\6\5\1\40"+
    "\24\5\3\0\7\5\1\41\23\5\3\0\10\5\1\42"+
    "\1\43\21\5\3\0\11\5\1\44\21\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[840];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\1\11\31\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[36];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private int comment_count = 0;

  private AsdrSample yyparser;

  public Yylex(java.io.Reader r, AsdrSample yyparser) {
    this(r);
    this.yyparser = yyparser;
  }




  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2244) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { return AsdrSample.DOUBLE;
          }
        case 13: break;
        case 11: 
          { yyparser.setDebug(true);
          }
        case 14: break;
        case 4: 
          { return AsdrSample.NUM;
          }
        case 15: break;
        case 8: 
          { return AsdrSample.ELSE;
          }
        case 16: break;
        case 6: 
          { return AsdrSample.IF;
          }
        case 17: break;
        case 5: 
          { return yytext().charAt(0);
          }
        case 18: break;
        case 7: 
          { return AsdrSample.INT;
          }
        case 19: break;
        case 9: 
          { return AsdrSample.WHILE;
          }
        case 20: break;
        case 1: 
          { System.out.println("Erro lexico: caracter invalido: <" + yytext() + ">");
          }
        case 21: break;
        case 3: 
          { return AsdrSample.IDENT;
          }
        case 22: break;
        case 12: 
          { yyparser.setDebug(false);
          }
        case 23: break;
        case 2: 
          { 
          }
        case 24: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
