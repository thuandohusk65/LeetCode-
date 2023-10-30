package _5__longest_palindromic_substring

class Solution {
    fun longestPalindrome(s: String): String {
        var start = 0
        var maxLength = 0

        for (i in s.indices) {
            var palindrome: String
            var low = i
            var high = i
            while (low >= 0 && high <= s.lastIndex && s[low] == s[high]) {
                low--
                high++
            }
            if (high - low > maxLength) {
                maxLength = high - low - 1
                start = low + 1
            }

            low = i
            high = i + 1
            while (low >= 0 && high <= s.lastIndex && s[low] == s[high]) {
                low--
                high++
            }
            if (high - low > maxLength) {
                maxLength = high - low - 1
                start = low + 1
            }
        }
        return s.substring(start, start + maxLength)
    }
}

fun main() {
    print(Solution().longestPalindrome("cbbd"))
}