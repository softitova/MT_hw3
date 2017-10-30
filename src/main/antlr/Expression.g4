grammar Expression;

prog: expr+ EOF;

expr: lVal Equality rVal Semicolon NEWLINE;

rVal :
    | rVal ('*' | '/' ) rVal
    | rVal ('+' | '-' ) rVal
    | Variable
    | Number
    | LBracket rVal RBracket;

lVal: Variable;

Equality : '=' ;

LBracket : '(' ;

RBracket : ')';

Semicolon : ';';

NEWLINE : [\r\n]+;

Number: Digit+;

Digit : [0-9$];

Variable: Letter LetterOrDigit*;

Letter: [a-zA-Z$_];

LetterOrDigit: [a-zA-Z0-9$_] ;

WS : [ \t\r\n\u000C]+ -> skip;