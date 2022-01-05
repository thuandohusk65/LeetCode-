package validparentheses

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val charsInString = s.toCharArray()
        val inputStack = Stack<Char>()
        for (char in charsInString) {
            inputStack.push(char)
        }
        val tempStack = Stack<Char>()
        while (inputStack.size > 0) {
            val char = inputStack.pop()

            if (char == ')' || char == ']' || char == '}') {
                tempStack.push(char)
            } else if (char == '(' || char == '[' || char == '{') {
                var tempChar: Char = '\u0000'
                if (tempStack.size > 0) {
                    tempChar = tempStack.pop()
                }
                when (char) {
                    '(' -> if (tempChar != ')') {
                        return false
                    }
                    '[' -> if (tempChar != ']') {
                        return false
                    }
                    '{' -> if (tempChar != '}') {
                        return false
                    }
                }
            }
        }
        if (tempStack.size == 0 && inputStack.size == 0) {
            return true
        }
        return false
    }
}