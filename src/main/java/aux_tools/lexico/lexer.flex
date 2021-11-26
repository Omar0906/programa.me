package aux_tools.lexico;
import static aux_tools.lexico.Tokens.*;
%%
%class Lexer
%public
%line
%column
%state COMMENT,STRING
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
SIGNO= " "|"+"|"-"
espacio=[ ,\t,\r,\n]+

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

STRING_TEXT=(\\\"|[^\n\r\"]|\\{WhiteSpace}+\\)*
StringCharacter = [^\r\n\"\\]
SingleCharacter = [^\r\n\'\\]

%{
    StringBuilder string = new StringBuilder();
    public String lexeme;
    public int linea;
    public int columna = this.yycolumn;
    private int comment_count = 0;
    public String msg = "";
%}
%%
<YYINITIAL>{
    inicio_programa |
    fin_programa |
    inicio_var |
    fin_var |
    definir |
    como |
    si |
    sino |
    hacer |
    mientras |
    repetir |
    veces |
    selector |
    caso |
    bloque |
    motor |
    display |
    led |
    apagar |
    prender |
    seg |
    min |
    hr |
    mostrar |
    girar |
    facil_si |
    facil_sino |
    facil_hacer_mientras |
    facil_mientras |
    facil_repetir |
    facil_selector |
    facil_bloque |
    mostrar |
    incluir |
    selector |
    salir |
    tiempo |
    led_semaforo |
    led_panel |
    led_rgb |
    intensidad |
    motor_electrico |
    girar |
    derecha |
    izquierda |
    motor_paso |
    grados |
    cierto |
    falso {lexeme=yytext();linea = this.yyline+1; return Reservadas;}
    {espacio} {/*Ignore*/}
    {Comment} {/*Ignore*/}

    \" { yybegin(STRING); string.setLength(0); }

    "=" {lexeme=yytext();linea = this.yyline+1; return Igual;}
    "+" {lexeme=yytext();linea = this.yyline+1; return Suma;}
    "-" {lexeme=yytext();linea = this.yyline+1; return Resta;}
    "*" {lexeme=yytext();linea = this.yyline+1; return Multiplicacion;}
    "/" {lexeme=yytext();linea = this.yyline+1; return Division;}
    {L}({L}|{D})* {lexeme=yytext(); linea = this.yyline+1; return Identificador;}
    //("(-"{D}+")")|
    {D}+ {lexeme=yytext(); linea = this.yyline+1; return Numero;}
    {D}+("." [0-9]+)? {
        lexeme=yytext();linea = this.yyline+1; return Decimal;
    }
    "("|")" {
        lexeme=yytext();linea = this.yyline+1; return SA_Parentesis;
    }
    "{"|"}" {
        lexeme=yytext();linea = this.yyline+1; return SA_Llaves;
    }
    "["|"]" {
        lexeme=yytext();linea = this.yyline+1; return SA_Corchetes;
    }
     . {return ERROR;}
}
<COMMENT> {
  "/*" { comment_count++; }
  "*/" { if (--comment_count == 0) yybegin(YYINITIAL); }
  {CommentContent} { }
}
<STRING> {
  \"                             { yybegin(YYINITIAL);lexeme=string.toString();linea=this.yyline()+1 return Texto;}
  
  {StringCharacter}+             { string.append( yytext() ); }
  
  /* escape sequences */
  "\\b"                          { string.append( '\b' ); }
  "\\t"                          { string.append( '\t' ); }
  "\\n"                          { string.append( '\n' ); }
  "\\f"                          { string.append( '\f' ); }
  "\\r"                          { string.append( '\r' ); }
  "\\\""                         { string.append( '\"' ); }
  "\\'"                          { string.append( '\'' ); }
  "\\\\"                         { string.append( '\\' ); }
  \\[0-3]? {OctDigit}? {OctDigit}  { char val = (char) Integer.parseInt(yytext().substring(1),8);
                        				   string.append( val ); }
  
  /* error cases */
  \\.                            { throw new RuntimeException("Illegal escape sequence \""+yytext()+"\""); }
  {LineTerminator}               { throw new RuntimeException("Unterminated string at end of line"); }
}
