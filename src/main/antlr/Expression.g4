grammar Expression;

parse locals [HashMap<String, Integer> map = new HashMap<>()]
    : expr[$map]+ EOF;

expr[HashMap<String, Integer> map]
    : lVal '=' rVal[$map] ';' NEWLINE
    {
        $map.put($lVal.text, $rVal.val);
        System.out.println($lVal.text + "=" + $rVal.val);
    }
    ;


lVal: Variable;

rVal[HashMap<String, Integer> map] returns [int val]

    :term[$map] exprP[$term.val, $map]              {$val = $exprP.val;}
    ;


exprP[int i, HashMap<String, Integer> map] returns [int val]

    : '+' term[$map] termP[$i + $term.val, $map]     { $val = $termP.val; }
    | '-' term[$map] termP[$i - $term.val, $map]     { $val = $termP.val; }
    | { $val = $i; }
    ;


term[HashMap<String, Integer> map] returns [int val]

    : fact[$map] termP[$fact.val, $map]              { $val = $termP.val; }
    ;


termP[int i, HashMap<String, Integer> map] returns [int val]

    : '*' fact[$map] exprP[$i * $fact.val, $map]     { $val = $exprP.val; }
    | '/' fact[$map] exprP[$i / $fact.val, $map]     { $val = $exprP.val; }
    |                                                { $val = $i; }
    ;


fact[HashMap<String, Integer> map] returns [int val]

    : unaryOperator[$map]                            { $val = $unaryOperator.val; }
    |'(' rVal[$map] ')'                              { $val = $rVal.val; }
    | Variable                                       { $val = $map.get($Variable.text); }
    | Number                                         { $val = Integer.parseInt($Number.text); }
    ;


unaryOperator[HashMap<String, Integer> map] returns [int val]

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
