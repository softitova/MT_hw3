package parser

import antlr.generated.ExpressionParser
import org.antlr.v4.runtime.tree.ParseTree

/**
 * Created by Titova Sophia on 29.10.17.
 */
class ExpressionMapper(public val varsMap: HashMap<String, Int> = hashMapOf()) {

    public fun map(node: ParseTree?) {
        if (node is ExpressionParser.ProgContext) {
            node.children.forEach {
                if (it is ExpressionParser.ExprContext)
                    varsMap.put(mapLPart(it.lpart()), mapRPart(it.rpart()))
            }
        }

    }

    fun mapLPart(node: ParseTree?): String {
        return if (node is ExpressionParser.LpartContext) node.Variable().text else ""
    }

    fun mapRPart(node: ParseTree?): Int {
        //        fun dealWithSingleRPart(v: ParseTree?) = if (v.all { Character.isDigit(it) }) v.toInt() else varsMap[v] ?: 0
        fun dealWithSingleRPart(v: ExpressionParser.RpartContext?) =
                v?.Number()?.text?.toInt() ?: varsMap[v?.Variable()?.text] ?: 0
        when (node) {
            is ExpressionParser.RpartContext -> {
                if (node.childCount == 1) {
                    return dealWithSingleRPart(node)// todo exception when we have no value for var yet
                }
                if ( node.lbracket() != null && node.rbracket() != null) {
                    return mapRPart(node.children[1])
                } else {
                    val x = mapRPart(node.children[0])
                    val y = mapRPart(node.children[2])

                    when (node.Operation().text) {
                        "+" -> return x + y
                        "-" -> return x - y
                        "/" -> return x / y
                        "*" -> return x * y
                        else -> return 0 // todo exception
                    }
                }
            }
        }
        return 0;
    }
}

fun main(args: Array<String>) {
    val l = ExpressionMapper();
    l.map(ExpressionWalker().walk("a = 1 + 3 + (6);\r\nb = a + 1 + 17 - 1 - (1);\r\n"))
    l.varsMap.forEach { t, u -> println(t + " = " + u) }
}