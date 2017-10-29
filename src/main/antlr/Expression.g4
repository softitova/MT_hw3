grammar Expression;

prog: expr+ EOF;

expr: lVal Equality rVal Semicolon NEWLINE;

rVal :
    rVal operation rVal
    | rVal ('+' | '-' ) rVal
    | Variable
    | Number
    | LBracket rVal RBracket;

lVal: Variable;

operation  : HP | LP;

Equality : '=' ;

LBracket : '(' ;

RBracket : ')';

Semicolon : ';';

NEWLINE : [\r\n]+;

HP : ('*' | '/' ) ;

LP :  ('+' | '-' );

Number: Digit+;

Digit : [0-9$];

Variable: Letter LetterOrDigit*;

Letter: [a-zA-Z$_];

LetterOrDigit: [a-zA-Z0-9$_] ;

WS : [ \t\r\n\u000C]+ -> skip;