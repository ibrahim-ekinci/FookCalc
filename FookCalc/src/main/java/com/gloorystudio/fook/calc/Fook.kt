package com.gloorystudio.fook.calc

import kotlin.math.*

class Fook {
    companion object{
        fun  String.calculate():Double = calc(this)
        @JvmStatic
        fun calc(str: String): Double {
            return object : Any() {
                var pos = -1
                var ch = 0
                fun nextChar() {
                    ch = if (++pos < str.length) str[pos].code else -1
                }

                fun eat(charToEat: Int): Boolean {
                    while (ch == ' '.code) nextChar()
                    if (ch == charToEat) {
                        nextChar()
                        return true
                    }
                    return false
                }

                fun parse(): Double {
                    nextChar()
                    val x = parseExpression()
                    if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                    return x
                }

                fun parseExpression(): Double {
                    var x = parseTerm()
                    while (true) {
                        when {
                            eat('+'.code) -> x += parseTerm()
                            eat('-'.code) -> x -= parseTerm()
                            else -> return x
                        }
                    }
                }

                fun parseTerm(): Double {
                    var x = parseFactor()
                    while (true) {
                        when {
                            eat('*'.code) -> x *= parseFactor()
                            eat('/'.code) -> x /= parseFactor()
                            eat('%'.code) -> x = x * parseFactor() / 100
                            else -> return x
                        }
                    }
                }

                fun parseFactor(): Double {
                    if (eat('+'.code)) return parseFactor()
                    if (eat('-'.code)) return -parseFactor()
                    if (eat('π'.code)) return Math.PI
                    if (eat('e'.code)) return Math.E
                    if (eat('φ'.code)) return 1.6180339887
                    var x: Double
                    val startPos = pos
                    if (eat('('.code)) {
                        x = parseExpression()
                        eat(')'.code)
                    } else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) {
                        while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                        x = str.substring(startPos, pos).toDouble()
                    } else if (ch >= 'a'.code && ch <= 'z'.code || ch == '√'.code) {
                        while (ch >= 'a'.code && ch <= 'z'.code || ch == '√'.code) nextChar()
                        val func = str.substring(startPos, pos)
                        x = parseFactor()
                        x = when (func) {
                            "sqrt" -> sqrt(x)
                            "√" -> sqrt(x)
                            "ln" -> ln(x)
                            "log" -> log10(x)
                            "abs" -> abs(x)
                            "sin" -> sin(Math.toRadians(x))
                            "cos" -> cos(Math.toRadians(x))
                            "tan" -> tan(Math.toRadians(x))
                            "cot" -> 1 / tan(Math.toRadians(x))
                            "asin" -> sin(Math.toRadians(x))
                            "acos" -> acos(Math.toRadians(x))
                            "atan" -> atan(Math.toRadians(x))
                            "acot" -> Math.PI / 2 - atan(Math.toRadians(x))
                            "sinh" -> sinh(Math.toRadians(x))
                            "cosh" -> cosh(Math.toRadians(x))
                            "tanh" -> tanh(Math.toRadians(x))
                            "coth" -> cosh(Math.toRadians(x)) / sinh(Math.toRadians(x))
                            else -> throw RuntimeException("Unknown function: $func")
                        }
                    } else {
                        throw RuntimeException("Unexpected: " + ch.toChar())
                    }
                    if (eat('^'.code)) x = x.pow(parseFactor()) // üst alma
                    return x
                }
            }.parse()
        }
    }
}