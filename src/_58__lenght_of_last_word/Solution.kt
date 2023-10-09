package _58__lenght_of_last_word

class Solution {
    fun lengthOfLastWord(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        for (i in s.length downTo 1) {
            if (s.substring(i - 1, i) == " ") {
                continue
            }
            var id = i - 1
            while (id >= 0) {
                if (id == 0 && s.substring(id, id + 1) != " ") {
                    return i - id
                } else if (s.substring(id, id + 1) == " ") {
                    return i - id - 1
                }
                id--
            }
        }
        return 0
    }
}

//fun main() {
//    var solution = Solution()
//    print(solution.lengthOfLastWord("   fly me   to   the moon  "))
//}
