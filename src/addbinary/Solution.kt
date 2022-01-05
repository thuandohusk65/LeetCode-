package addbinary

class Solution {
    fun addBinary(a: String, b: String): String {
        var result = ""
        val newLength = Math.max(a.length, b.length)
        var rememberOne = false
        for (i in 1 .. newLength) {
            var sum = 0
            if (a.length - i >= 0) {
                sum += a.substring(a.length - i, a.length - i + 1).toInt()
            }
            if (b.length - i >= 0) {
                sum += b.substring(b.length - i, b.length - i + 1).toInt()
            }
            if (rememberOne) {
                sum += 1
            }
            if (sum == 0 || sum == 1) {
                result = "$sum$result"
                rememberOne = false
            } else if (sum == 2) {
                result = "0$result"
                rememberOne = true
            } else if (sum == 3) {
                result = "1$result"
                rememberOne = true
            }
        }
        if (rememberOne) {
            result = "1$result"
        }
        return result
    }
}
fun main() {
    val solution = Solution()
    print(solution.addBinary("1010","1011"))
}