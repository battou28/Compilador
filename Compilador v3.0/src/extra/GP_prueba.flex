/**
 * Scanner para la gram�tica de prueba del curso de Compiladores e Int�rpretes.
 */
package nuevo_compilador;
import java.util.ArrayList;
import java_cup.runtime.*;
%%

%class Scanner
%unicode
%ignorecase
%public
/*%debug*/
%cup
%line
%column
//%type Symbol
//%function nextToken

%eofval{
	String msj="Tipo de Token: <Fin de Código> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym.EOF+"\n" ;
        token.add(msj);
        return symbol(sym.EOF, yytext());
%eofval}

%{
    public static  ArrayList error=new ArrayList();
    public static  ArrayList token=new ArrayList();
    
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


<YYINITIAL> "import"    	    	{String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._import+"\n" ;
                                 token.add(msj);  
                                return symbol(sym._import, yytext()); }

<YYINITIAL> "class"            {String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._class+"\n" ;
                                 token.add(msj);  
                                return symbol(sym._class, yytext()); }

<YYINITIAL> "public"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._public+"\n" ;
                                 token.add(msj); 
                                  return symbol(sym._public, yytext()); }

<YYINITIAL> "static"            {String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._static+"\n" ;
                                 token.add(msj); 
                                 return symbol(sym._static, yytext()); }

<YYINITIAL> "void"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._void+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._void, yytext()); }

<YYINITIAL> "main"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._main+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._main, yytext()); }

<YYINITIAL> "String"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._TString+"\n" ;
                                 token.add(msj); 
                                    return symbol(sym._TString, yytext()); }

<YYINITIAL> "extends"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._extends+"\n" ;
                                 token.add(msj); 
                                    return symbol(sym._extends, yytext()); }

<YYINITIAL> "implements"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._implements+"\n" ;
                                 token.add(msj); 
                                        return symbol(sym._implements, yytext()); }

<YYINITIAL> "return"            {String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._return+"\n" ;
                                 token.add(msj);  
                                return symbol(sym._return, yytext()); }

<YYINITIAL> "boolean"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._boolean+"\n" ;
                                 token.add(msj); 
                                    return symbol(sym._boolean, yytext()); }

<YYINITIAL> "if"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._if+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._if, yytext()); }

<YYINITIAL> "else"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._else+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._else, yytext()); }

<YYINITIAL> "while"            {String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._while+"\n" ;
                                 token.add(msj);  
                                return symbol(sym._while, yytext()); }

<YYINITIAL> "System"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._System+"\n" ;
                                 token.add(msj); 
                                   return symbol(sym._System, yytext()); }

<YYINITIAL> "out"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._out+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._out, yytext()); }

<YYINITIAL> "println"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._println+"\n" ;
                                 token.add(msj); 
                                    return symbol(sym._println, yytext()); }

<YYINITIAL> "exit"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._exit+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._exit, yytext()); }

<YYINITIAL> "int"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._TInt+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._TInt, yytext()); }

<YYINITIAL> "in"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._in+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._in, yytext()); }

<YYINITIAL> "read"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._read+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._read, yytext()); }

<YYINITIAL> "this"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._this+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._this, yytext()); }

<YYINITIAL> "length"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._length+"\n" ;
                                 token.add(msj); 
                                    return symbol(sym._length, yytext()); }

<YYINITIAL> "true"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._true+"\n" ;
                                 token.add(msj); 
                                return symbol(sym._true, yytext()); }

<YYINITIAL> "false"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._false+"\n" ;
                                 token.add(msj); 
                                 return symbol(sym._false, yytext()); }

<YYINITIAL> "new"            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._new+"\n" ;
                                 token.add(msj);
                                return symbol(sym._new, yytext()); }


<YYINITIAL> {
  /* identificadores */ 
  {Identifier}                   { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._id+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._id,yytext()); }
 
  /* literales enteros positivos */
  {DecIntegerLiteral}            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._numero+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._numero, yytext()); }
  \"                             { string.setLength(0); yybegin(STRING); }
  
  /*{Char}                         { return symbol(sym.CHAR,yytext(), yytext()); }*/

  
  /* operadores */

  "="                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._igual+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._igual, yytext()); }

  "*"                           { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._asterisco+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._asterisco, yytext()); }

  "+"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._suma+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._suma, yytext()); }

  "-"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._resta+"\n" ;
                                 token.add(msj);
                                   return symbol(sym._resta, yytext()); }


  "||"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._or+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._or, yytext()); }

  "&&"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._and+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._and, yytext()); }

  "/"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._division+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._division, yytext()); }

  "!"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._negacion+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._negacion, yytext()); }

  "!="                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._diferentea+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._diferentea, yytext()); }

  "=="                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._iguala+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._iguala, yytext()); }

  "<"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._menorque+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._menorque, yytext()); }

  "<="                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._menorigual+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._menorigual, yytext()); }

  ">"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._mayorque+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._mayorque, yytext()); }

  ">="                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._mayorigual+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._mayorigual, yytext()); }
  

  /* otros simbolos v�lidos */

  "("                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._redondoizq+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._redondoizq, yytext()); }

  ")"                           { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._redondoder+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._redondoder, yytext()); }

  "{"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._corcheteizq+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._corcheteizq, yytext()); }

  "}"                           {String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._corcheteder+"\n" ;
                                 token.add(msj); 
                                 return symbol(sym._corcheteder, yytext()); }

  "["                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._cuadradoizq+"\n" ;
                                 token.add(msj);
                                   return symbol(sym._cuadradoizq, yytext()); }

  "]"                           { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._cuadradoder+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._cuadradoder, yytext()); }

  "."                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._punto+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._punto, yytext()); }

  ".*"                           { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._puntoasterisco+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._puntoasterisco, yytext()); }

  ";"                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._puntoycoma+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._puntoycoma, yytext()); }

  ","                            { String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._coma+"\n" ;
                                 token.add(msj);
                                    return symbol(sym._coma, yytext()); }
  
  "/*"				{contComment++; yybegin(Comentario);}


  /* commentarios */
 /* {Comment}                      { /* ignore */ }*/
 
  /* espacios en blanco */
  {WhiteSpace}                   { /* ignore */ }
}

<STRING> {
  \"                             { yybegin(YYINITIAL); 
                                   String msj="Tipo de Token: <" + yytext() + "> en Fila: " + yyline + " Columna: " + yycolumn+". Valor asociado: "+sym._String+"\n" ;
                                 token.add(msj);
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


/* caracteres no v�lidos */
.|\n                             { System.out.println("Error caracter inválido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn );
				   String msj="Error caracter inválido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn+"\n" ;
                                    error.add(msj);
                                            /*throw new Error("Caracter no permitido <"+
                                                    yytext()+">");*/ }

