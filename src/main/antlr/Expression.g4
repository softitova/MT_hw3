grammar Expression;

prog: expr+ EOF;

expr: lpart Equality rpart Semicolon NEWLINE;

rpart : rpart Operation rpart
    | Variable
    | Number
    | lbracket rpart rbracket;


lbracket : LBracket ;

rbracket : RBracket ;

Equality : '=' ;

LBracket : '(' ;

RBracket : ')';

Semicolon : ';';

NEWLINE : [\r\n]+;

Operation : ('+' | '-' | '/'| '*');

Number: Digit+;

Digit : [0-9$];

lpart: Variable;
Variable: Letter LetterOrDigit*;

Letter: [a-zA-Z$_];

LetterOrDigit: [a-zA-Z0-9$_] ;

WS : [ \t\r\n\u000C]+ -> skip;