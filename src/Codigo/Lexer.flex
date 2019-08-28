import static codigo.Tokens.*;
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

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

"=" |
"+" |
"-" | 
"*" | 
"^" |
"sqrt" |
"/" {lexeme=yytext(); return Raiz ;}

{L}({L}|{D})* | ("(-"{D}+")")|{D}+ {lexeme=yytext(); return Hijo;}

 . {return ERROR;}
