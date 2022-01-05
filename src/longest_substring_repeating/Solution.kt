package longest_substring_repeating

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0

        var start = 0
        var end = 1

        while (end < s.length && start < s.length) {
            while (end - start != 2 && s.substring(end)
                    .indexOf(s.substring(start, end)) != -1 || (end - start == 2 && !s.substring(
                    start,
                    start + 1
                ).equals(s.substring(start + 1, end)))
            ) {
                if (end - start > result) {
                    result = end - start
                }
                end++
            }
            start = end
            end = start + 1
        }
        return result
    }
}

fun main() {
    var solution = Solution()
    val s = "abcabcbc"
    print(solution.lengthOfLongestSubstring(s))
}