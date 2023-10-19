package _13__roman_to_integer

import java.lang.StringBuilder

class Solution {
    fun romanToInt(s: String): Int {
        val sBuilder = StringBuilder(s)
        var result = 0
        var pointer = 0
        while (pointer < s.length) {
            val currentValue = sBuilder[pointer].value()
            if (pointer + 1 < s.length && sBuilder[pointer + 1].value() > currentValue) {
                result -= currentValue
            } else {
                result += currentValue
            }
            pointer++
        }
        return result
    }

    private fun Char.value(): Int {
        return when (this) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}

fun main() {
    print(Solution().romanToInt("MCMXCIV"))
}