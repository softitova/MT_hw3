grammar Expression;

parse locals [java.util.HashMap<String, Integer> map = new java.util.HashMap<>()]
    : expr[$map]+ EOF
    {
        for (java.util.Map.Entry<String, Integer> i : $map.entrySet()) {
            System.out.println(i.getKey() + " = " + i.getValue() + ";");
        }
    }
    ;

expr[java.util.HashMap<String, Integer> map]
    : lVal '=' rVal[$map] ';' NEWLINE                {$map.put($lVal.text, $rVal.val);}
    ;


lVal: Variable;

rVal[java.util.HashMap<String, Integer> map] returns [int val]

    :term[$map] expr1[$term.val, $map]               {$val = $expr1.val;}
    ;


expr1[int i, java.util.HashMap<String, Integer> map] returns [int val]

    : '+' term[$map] expr2[$i + $term.val, $map]     { $val = $expr2.val; }
    | '-' term[$map] expr2[$i - $term.val, $map]     { $val = $expr2.val; }
    |                                                { $val = $i; }
    ;


term[java.util.HashMap<String, Integer> map] returns [int val]

    : fact[$map] expr2[$fact.val, $map]              { $val = $expr2.val; }
    ;


expr2[int i, java.util.HashMap<String, Integer> map] returns [int val]

    : '*' fact[$map] expr1[$i * $fact.val, $map]     { $val = $expr1.val; }
    | '/' fact[$map] expr1[$i / $fact.val, $map]     { $val = $expr1.val; }
    |                                                { $val = $i; }
    ;


fact[java.util.HashMap<String, Integer> map] returns [int val]

    : unaryOp[$map]                                  { $val = $unaryOp.val; }
    |'(' rVal[$map] ')'                              { $val = $rVal.val; }
    | Variable                                       { $val = $map.get($Variable.text); }
    | Number                                         { $val = Integer.parseInt($Number.text); }
    ;


unaryOp[java.util.HashMap<String, Integer> map] returns [int val]

    : '-' fact[$map]                                { $val = (-1) * $fact.val; }
    | '+' fact[$map]                                { $val = $fact.val; }
    ;


NEWLINE : [\r\n]+;

Number:  Digit+;

Digit : [0-9$];

Variable: Letter LetterOrDigit*;

Letter: [a-zA-Z$_];

LetterOrDigit: [a-zA-Z0-9$_] ;

WS : [ \t\r\n\u000C]+ -> skip;
