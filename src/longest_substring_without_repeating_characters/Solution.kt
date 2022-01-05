package longest_substring_without_repeating_characters

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        var start = 0
        var end = 0
        var hashSet = HashSet<Char>()
        var newS = s.toCharArray()

        while (end < s.length) {
            if (!hashSet.contains(newS[end])) {
                hashSet.add(newS[end])
                end++
                result = Math.max(result, hashSet.size)
            } else {
                hashSet.remove(newS[start])
                start++
            }
        }
        return result
    }
}

fun main() {
    var solution = Solution()
    val s = "pwwkew"
    print(solution.lengthOfLongestSubstring(s))
}