package `implementstrStr()`

class Solution {
    fun strStr(haystack: String, needle: String): Int {

        if (haystack.length < needle.length) {
            return -1
        } else if (haystack.equals(needle)) {
            return 0
        }
        for (i in 0 .. haystack.length - needle.length) {
            if (needle.equals(haystack.substring(i, i + needle.length))) {
                return i
            }
        }
        return -1
    }
}

