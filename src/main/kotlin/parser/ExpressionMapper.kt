package parser

import antlr.generated.ExpressionParser
import org.antlr.v4.runtime.tree.ParseTree

/**
 * Created by Titova Sophia on 29.10.17.
 */
class ExpressionMapper(public val varsMap: HashMap<String, Int> = hashMapOf()) {

    fun map(node: ParseTree?) {
        if (node is ExpressionParser.ProgContext) {
            node.children.forEach {
                if (it is ExpressionParser.ExprContext)
                    varsMap.put(mapLPart(it.lVal()), mapRPart(it.rVal()))
            }
        }
    }

    private fun mapLPart(node: ParseTree?): String {
        return if (node is ExpressionParser.LValContext) node.Variable().text
        else throw ParseException("Parse error: expected lPart, found ${node?.javaClass ?: "null"}")
    }

    private fun mapRPart(node: ParseTree?): Int {
        fun dealWithSingleRPart(v: ExpressionParser.RValContext?) =
                v?.Number()?.text?.toInt()
                        ?: varsMap[v?.Variable()?.text]
                        ?: v?.Variable()
                        .let {
                            throw ParseException("Value for variable was not found ${it.toString()}")
                        }
                        ?: throw ParseException("Unexpected symbol : $v")
        if (node is ExpressionParser.RValContext) {
            if (node.childCount == 1) {
                return dealWithSingleRPart(node)
            }
            return if (node.LBracket() != null && node.RBracket() != null) {
                mapRPart(node.children[1])
            } else {
                val x = mapRPart(node.children[0])
                val y = mapRPart(node.children[2])
                val op = node.children[1].text
                when (op) {
                    "+" -> x + y
                    "-" -> x - y
                    "/" -> x / y
                    "*" -> x * y
                    else -> throw ParseException("Unexpected operation : $op")
                }
            }
        } else {
            throw ParseException("Parse error : Expected rVal")
        }
    }
}

fun parse(text : String) {
    val l = ExpressionMapper();
    l.map(ExpressionWalker().walk(text))
    l.varsMap.forEach { t, u -> println(t + " = " + u) }
}

fun main(args: Array<String>) {
    parse("a = 1 + 3 + (6);\r\nb = a + (1 -2 ) * 4 + (1);\r\na = 1;\r\nc = a;\n")
}