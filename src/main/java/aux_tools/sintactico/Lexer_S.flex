package aux_tools.sintactico;
import java_cup.runtime.Symbol;
%%
%class Lexer_S
%public
%unicode
%cup
%char
%full
%line
%column
%state COMMENT,STRING
%type java_cup.runtime.Symbol
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
ID = {L}({L}|{D})*
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

%{
    StringBuilder string = new StringBuilder();
    public int linea;
    public int columna;
    private int comment_count = 0;
    public String msg = "";
    private int par_apcount = 0;
    public boolean parentesisIguales(){return par_apcount==0;}
    private Symbol symbol(int type, Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }
    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }
%}
%%
<YYINITIAL>{
    "decimal" {return new Symbol(sym.decimal,yychar,yyline,yytext());} 
    "entero" {return new Symbol(sym.entero,yychar,yyline,yytext());} 
    "texto" {return new Symbol(sym.texto,yychar,yyline,yytext());} 
    "tiempo" {return new Symbol(sym.tiempo,yychar,yyline,yytext());} 
    
    "apagar" {return new Symbol(sym.apagar,yychar,yyline,yytext());} 
    "bloque" {return new Symbol(sym.bloque,yychar,yyline,yytext());}  
    "caso" {return new Symbol(sym.caso,yychar,yyline,yytext());} 
    "como" {return new Symbol(sym.como,yychar,yyline,yytext());}  
    "definir" {return new Symbol(sym.definir,yychar,yyline,yytext());}  
    "derecha" {return new Symbol(sym.derecha,yychar,yyline,yytext());}  
    "display" {return new Symbol(sym.display,yychar,yyline,yytext());}   
    "facil_bloque" {return new Symbol(sym.facil_bloque,yychar,yyline,yytext());}  
    "facil_hacer_mientras" {return new Symbol(sym.facil_hacer_mientras,yychar,yyline,yytext());}  
    "facil_mientras" {return new Symbol(sym.facil_mientras,yychar,yyline,yytext());}  
    "facil_repetir" {return new Symbol(sym.facil_repetir,yychar,yyline,yytext());}  
    "facil_selector" {return new Symbol(sym.facil_selector,yychar,yyline,yytext());}  
    "facil_si" {return new Symbol(sym.facil_si,yychar,yyline,yytext());}  
    "facil_sino" {return new Symbol(sym.facil_sino,yychar,yyline,yytext());}  
    "falso" {return new Symbol(sym.falso,yychar,yyline,yytext());}  
    "fin_programa" {return new Symbol(sym.fin_programa,yychar,yyline,yytext());}  
    "fin_var" {return new Symbol(sym.fin_var,yychar,yyline,yytext());}  
    "girar" {return new Symbol(sym.girar,yychar,yyline,yytext());} 
    "grados" {return new Symbol(sym.grados,yychar,yyline,yytext());}  
    "hacer" {return new Symbol(sym.hacer,yychar,yyline,yytext());}  
    "hr" {return new Symbol(sym.hr,yychar,yyline,yytext());}  
    "incluir" {return new Symbol(sym.incluir,yychar,yyline,yytext());}  
    "inicio_programa" {return new Symbol(sym.inicio_programa,yychar,yyline,yytext());}  
    "inicio_var" {return new Symbol(sym.inicio_var,yychar,yyline,yytext());}  
    "intensidad" {return new Symbol(sym.intensidad,yychar,yyline,yytext());}  
    "izquierda" {return new Symbol(sym.izquierda,yychar,yyline,yytext());}  
    "led" {return new Symbol(sym.led,yychar,yyline,yytext());}  
    "led_panel" {return new Symbol(sym.led_panel,yychar,yyline,yytext());}  
    "led_rgb" {return new Symbol(sym.led_rgb,yychar,yyline,yytext());}  
    "led_semaforo" {return new Symbol(sym.led_semaforo,yychar,yyline,yytext());}  
    "mientras" {return new Symbol(sym.mientras,yychar,yyline,yytext());}  
    "min" {return new Symbol(sym.min,yychar,yyline,yytext());}  
    "mostrar" {return new Symbol(sym.mostrar,yychar,yyline,yytext());} 
    "motor" {return new Symbol(sym.motor,yychar,yyline,yytext());}  
    "motor_electrico" {return new Symbol(sym.motor_electrico,yychar,yyline,yytext());}  
    "motor_paso" {return new Symbol(sym.motor_paso,yychar,yyline,yytext());}  
    "prender" {return new Symbol(sym.prender,yychar,yyline,yytext());}  
    "repetir" {return new Symbol(sym.repetir,yychar,yyline,yytext());}  
    "salir" {return new Symbol(sym.salir,yychar,yyline,yytext());}  
    "seg" {return new Symbol(sym.seg,yychar,yyline,yytext());}  
    "selector" {return new Symbol(sym.selector,yychar,yyline,yytext());} 
    "si" {return new Symbol(sym.si,yychar,yyline,yytext());}  
    "sino" {return new Symbol(sym.sino,yychar,yyline,yytext());}  
    "tiempo" {return new Symbol(sym.tiempo,yychar,yyline,yytext());}  
    "veces" {return new Symbol(sym.veces,yychar,yyline,yytext());}  
    "verdadero" {return new Symbol(sym.verdadero,yychar,yyline,yytext());}   
    {espacio} {/*Ignore*/}
    {Comment} {/*Ignore*/}
    
    "\"" { yybegin(STRING); string.setLength(0); string.append("\""); }
    ";" {return new Symbol(sym.Punto_c,yychar,yyline,yytext());}
    ":" {return new Symbol(sym.DosPuntos,yychar,yyline,yytext());}
    "(" {return new Symbol(sym.Par_a,yychar,yyline,yytext());}
    ")" {return new Symbol(sym.Par_c,yychar,yyline,yytext());}
    "{" {return new Symbol(sym.Lla_a,yychar,yyline,yytext());}
    "}" {return new Symbol(sym.Lla_c,yychar,yyline,yytext());}
    "[" {return new Symbol(sym.Cor_a,yychar,yyline,yytext());}
    "]" {return new Symbol(sym.Cor_c,yychar,yyline,yytext());}

    "==" {return new Symbol(sym.Igual,yychar,yyline,yytext());}
    "=" {return new Symbol(sym.Asignacion_s,yychar,yyline,yytext());}
    "+" {return new Symbol(sym.Suma,yychar,yyline,yytext());}
    "-" {return new Symbol(sym.Resta,yychar,yyline,yytext());}
    "*" {return new Symbol(sym.Mul,yychar,yyline,yytext());}
    "/" {return new Symbol(sym.Div,yychar,yyline,yytext());}
    
    "<" {return new Symbol(sym.Menor,yychar,yyline,yytext());}
    ">" {return new Symbol(sym.Mayor,yychar,yyline,yytext());}
    "!=" {return new Symbol(sym.Diferente,yychar,yyline,yytext());}
    ">=" {return new Symbol(sym.Mayor_i,yychar,yyline,yytext());}
    "<=" {return new Symbol(sym.Menor_i,yychar,yyline,yytext());}

    {D}+ {
        return new Symbol(sym.Numero,yychar,yyline,yytext());
    }
    
    {D}+ " " ("seg"|"hr"|"min") {
        return new Symbol(sym.Tiempo,yychar,yyline,yytext());
    }
    {D}+ ("seg"|"hr"|"min") {
        this.msg = "Código de error 5: Formato de tiempo incorrecto, debe estar separado por un espacio ";  return new Symbol(sym.ERROR,yychar,yyline,yytext());
    }
    
    {D}+("." [0-9]+)? {
        return new Symbol(sym.Decimal,yychar,yyline,yytext());
    }
    {D} ({D}|.)+ ({L}|{D}) {
    this.msg = "Código de error 3: Formato de número incorrecto ";  return new Symbol(sym.ERROR,yychar,yyline,yytext());
    }
    "." {D}+ {
    this.msg = "Código de error 3: Formato de número incorrecto ";  return new Symbol(sym.ERROR,yychar,yyline,yytext());
    }
    
    {D} ({L}|".")+ ("."+ [0-9]+) {
        this.msg = "Código de error 2: Formato de número decimal incorrecto ";  return new Symbol(sym.ERROR,yychar,yyline,yytext());
    }
    {D}+ "." {
        this.msg = "Código de error 2: Formato de número decimal incorrecto ";  return new Symbol(sym.ERROR,yychar,yyline,yytext());
    }
    {D} ({L}|{D})+ ("." [0-9]+) (("." ([0-9]+|"."+))+) {
            this.msg = "Código de error 2: Formato de número decimal incorrecto ";  return new Symbol(sym.ERROR,yychar,yyline,yytext());
    }
    
    {D} ({L}|.)+ ("." ([0-9]+|{L}+|"."+)+) {
        this.msg = "Código de error 2: Formato de número decimal incorrecto ";  return new Symbol(sym.ERROR,yychar,yyline,yytext());
    }
    {ID} {return new Symbol(sym.Identificador,yychar,yyline,yytext());}
    
    "." (prender|girar|apagar|estado) {return new Symbol(sym.Propiedad,yychar,yyline,yytext());}
     . {this.msg = "Código de error 1: Símbolo no reconocido ";lexeme=yytext();linea=this.yyline+1;return new Symbol(sym.ERROR,yychar,yyline,yytext());}
}
<COMMENT> {
  "/*" { comment_count++; }
  "*/" { if (--comment_count == 0) yybegin(YYINITIAL); }
  {CommentContent} { }
}
<STRING> {
  "\""                             { yybegin(YYINITIAL);string.append("\"");return new Symbol(sym.Texto,yychar,yyline,yytext());}
  
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
  
  /* error cases */
  ";" {
    this.msg = "Código de error 4: La cadena no esta cerrada ";  yybegin(YYINITIAL); return new Symbol(sym.ERROR,yychar,yyline,yytext()); }
  \\.                            { this.msg = "Código de error 4: La cadena no esta cerrada ";  yybegin(YYINITIAL); return new Symbol(sym.ERROR,yychar,yyline,yytext()); }
  {LineTerminator}               { this.msg = "Código de error 4: La cadena no esta cerrada ";  yybegin(YYINITIAL); return new Symbol(sym.ERROR,yychar,yyline,yytext()); }
}
