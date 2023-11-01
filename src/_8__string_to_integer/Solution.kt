package _8__string_to_integer

class Solution {
    fun myAtoi(s: String): Int {
        val sBuilder = StringBuilder()
        val MAX_IN_STRING = Int.MAX_VALUE.toString()
        var sign = 1
        var insideNumber = false
        for (i in s.indices) {
            val c = s[i]
            when {
                insideNumber -> {
                    if (c == '0') {
                        if (sBuilder.isNotEmpty()) sBuilder.append(c)
                    } else if (c in '1'..'9') sBuilder.append(c)
                    else break
                }

                c in '0'..'9' -> {
                    insideNumber = true
                    if (c != '0') sBuilder.append(c)
                }

                s[i] == '+' -> {
                    sign = 1
                    insideNumber = true
                }

                s[i] == '-' -> {
                    sign = -1
                    insideNumber = true
                }

                s[i] == ' ' -> continue
                else -> return 0
            }
        }
        if (sBuilder.isEmpty()) sBuilder.append('0')
        when {
            sBuilder.length > MAX_IN_STRING.length -> return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            sBuilder.length == MAX_IN_STRING.length -> {
                for (i in sBuilder.indices) {
                    if (sBuilder[i] > MAX_IN_STRING[i]) return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
                    else if (sBuilder[i] < MAX_IN_STRING[i]) break
                }
            }
        }
        return sign * sBuilder.toString().toInt()
    }
}

fun main() {
    print(Solution().myAtoi("  +    12"))
}