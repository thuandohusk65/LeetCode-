package _345__reverse_vowels_of_a_string

class Solution {
    fun reverseVowels(s: String): String {
        var result = StringBuilder(s)
        var first = 0
        var last = s.length - 1
        while (first < last) {
            if (result[first].isVowel()) {
                while (first < last) {
                    if (result[last].isVowel()) {
                        val firstChar = result[first]
                        result[first] = result[last]
                        result[last] = firstChar
                        first++
                        last--
                        break
                    } else {
                        last--
                    }
                }
            } else {
                first++
            }
        }
        return result.toString()
    }

    private fun Char.isVowel(): Boolean {
        return this.lowercase() == "u" ||
                this.lowercase() == "e" ||
                this.lowercase() == "o" ||
                this.lowercase() == "a" ||
                this.lowercase() == "i"
    }

}

fun main() {
    print(Solution().reverseVowels("hello"))
}
