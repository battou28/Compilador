/**
 * Scanner para la gramática de prueba del curso de Compiladores e Intérpretes.
 */
%%

%class Scanner
%unicode
%ignorecase
/*%debug*/
%line
%column
%type Symbol
%function nextToken

%eofval{
	return symbol(sym.EOF);
%eofval}

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
  
  int contComment=0;
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment =  {TraditionalComment} | {EndOfLineComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}

Identifier = [:jletter:] [:jletterdigit:]* | [$][:jletter:][:jletterdigit:]* | _[:jletter:][:jletterdigit:]* 	

DecIntegerLiteral = 0 | [1-9][0-9]* | 0.[0-9][0-9]* | [1-9][0-9]*.[0-9][0-9]*

Char = '[:jletter:]'

%state STRING
%state Comentario
%%

/* Palabras reservadas */


<YYINITIAL> "import"    	    	{ return symbol(sym._import); }
<YYINITIAL> "class"            { return symbol(sym._class); }
<YYINITIAL> "public"            { return symbol(sym._public); }
<YYINITIAL> "static"            { return symbol(sym._static); }
<YYINITIAL> "void"            { return symbol(sym._void); }
<YYINITIAL> "main"            { return symbol(sym._main); }
<YYINITIAL> "String"            { return symbol(sym._TString); }
<YYINITIAL> "extends"            { return symbol(sym._extends); }
<YYINITIAL> "implements"            { return symbol(sym._implements); }
<YYINITIAL> "return"            { return symbol(sym._return); }
<YYINITIAL> "boolean"            { return symbol(sym._boolean); }
<YYINITIAL> "if"            { return symbol(sym._if); }
<YYINITIAL> "else"            { return symbol(sym._else); }
<YYINITIAL> "while"            { return symbol(sym._while); }
<YYINITIAL> "System"            { return symbol(sym._System); }
<YYINITIAL> "out"            { return symbol(sym._out); }
<YYINITIAL> "println"            { return symbol(sym._println); }
<YYINITIAL> "exit"            { return symbol(sym._exit); }
<YYINITIAL> "int"            { return symbol(sym._TInt); }
<YYINITIAL> "in"            { return symbol(sym._in); }
<YYINITIAL> "read"            { return symbol(sym._read); }
<YYINITIAL> "this"            { return symbol(sym._this); }
<YYINITIAL> "length"            { return symbol(sym._length); }
<YYINITIAL> "true"            { return symbol(sym._true); }
<YYINITIAL> "false"            { return symbol(sym._false); }
<YYINITIAL> "new"            { return symbol(sym._new); }

<YYINITIAL> {
  /* identificadores */ 
  {Identifier}                   { return symbol(sym._id,yytext()); }
 
  /* literales enteros positivos */
  {DecIntegerLiteral}            { return symbol(sym._numero); }
  \"                             { string.setLength(0); yybegin(STRING); }
  
  /*{Char}                         { return symbol(sym.CHAR,yytext()); }*/

  
  /* operadores */

  "="                            { return symbol(sym._igual); }
  "*"                           { return symbol(sym._asterisco); }
  "+"                            { return symbol(sym._suma); }
  "-"                            { return symbol(sym._resta); }

  "||"                            { return symbol(sym._or); }
  "&&"                            { return symbol(sym._and); }
  "/"                            { return symbol(sym._division); }
  "!"                            { return symbol(sym._negacion); }
  "!="                            { return symbol(sym._diferentea); }
  "=="                            { return symbol(sym._iguala); }
  "<"                            { return symbol(sym._menorque); }
  "<="                            { return symbol(sym._menorigual); }
  ">"                            { return symbol(sym._mayorque); }
  ">="                            { return symbol(sym._mayorigual); }
  

  /* otros simbolos válidos */

  "("                            { return symbol(sym._redondoizq); }
  ")"                           { return symbol(sym._redondoder); }

  "{"                            { return symbol(sym._corcheteizq); }
  "}"                           { return symbol(sym._corcheteder); }
  "["                            { return symbol(sym._cuadradoizq); }
  "]"                           { return symbol(sym._cuadradoder); }
  "."                            { return symbol(sym._punto); }
  ";"                            { return symbol(sym._puntoycoma); }
  ","                            { return symbol(sym._coma); }
  
  "/*"				{contComment++; yybegin(Comentario);}


  /* commentarios */
 /* {Comment}                      { /* ignore */ }*/
 
  /* espacios en blanco */
  {WhiteSpace}                   { /* ignore */ }
}

<STRING> {
  \"                             { yybegin(YYINITIAL); 
                                   return symbol(sym._String, string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}


<Comentario> 	{
   [^]				 {/*Ignore*/}
  "/*"				 { contComment++;}
  "*/"				 {contComment--;
				  if(contComment == 0)
					{
					yybegin(YYINITIAL);
				        }
				  }
}


/* caracteres no válidos */
.|\n                             { System.out.println("Error caracter inválido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn );
				   /*throw new Error("Caracter no permitido <"+
                                                    yytext()+">");*/ }

