package Codigo;
import static Codigo.Tokens.*;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
int  {lexeme=yytext(); return Int;}
if   {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
for  {lexeme=yytext(); return For;}



{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

"=" {lexeme=yytext(); return Igual;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division ;}
"(" {lexeme=yytext(); return Parentesis_a;}
")" {lexeme=yytext(); return Parentesis_c;}
"{" {lexeme=yytext(); return Llave_a ;}
"}" {lexeme=yytext(); return Llave_c ;}
";" {lexeme=yytext(); return P_coma;}

{L}({L}|{D})* | ("(-"{D}+")")|{D}+ {lexeme=yytext(); return Identificador;}

 . {return ERROR;}
