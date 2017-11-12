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

    :term[$map] exprP[$term.val, $map]               {$val = $exprP.val;}
    ;


exprP[int i, java.util.HashMap<String, Integer> map] returns [int val]

    : '+' term[$map] termP[$i + $term.val, $map]     { $val = $termP.val; }
    | '-' term[$map] termP[$i - $term.val, $map]     { $val = $termP.val; }
    | { $val = $i; }
    ;


term[java.util.HashMap<String, Integer> map] returns [int val]

    : fact[$map] termP[$fact.val, $map]              { $val = $termP.val; }
    ;


termP[int i, java.util.HashMap<String, Integer> map] returns [int val]

    : '*' fact[$map] exprP[$i * $fact.val, $map]     { $val = $exprP.val; }
    | '/' fact[$map] exprP[$i / $fact.val, $map]     { $val = $exprP.val; }
    |                                                { $val = $i; }
    ;


fact[java.util.HashMap<String, Integer> map] returns [int val]

    : unaryOperator[$map]                            { $val = $unaryOperator.val; }
    |'(' rVal[$map] ')'                              { $val = $rVal.val; }
    | Variable                                       { $val = $map.get($Variable.text); }
    | Number                                         { $val = Integer.parseInt($Number.text); }
    ;


unaryOperator[java.util.HashMap<String, Integer> map] returns [int val]

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
