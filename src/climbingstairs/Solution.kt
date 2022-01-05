package climbingstairs

class Solution {
    fun climbStairs(n: Int): Int {
        var sumWay = 0.0F
        var sumStep: Float = n.toFloat()
        var rememberPrevious: Float = 0.0F
        var k = n.toFloat()
        while (k >= 0) {
            if (k == n.toFloat() || k == 0F) {
                rememberPrevious = 1.0F

            } else if (k == 1F) {
                rememberPrevious = sumStep
            } else {
                rememberPrevious *= (1 / ((sumStep + 1) * (sumStep - k)) * ((k + 1) * (k + 2)))

            }
            sumWay += rememberPrevious
            sumStep--
            k -= 2F
        }
        return sumWay.toInt()
    }
}

fun main() {
    val solution = Solution()
    print(solution.climbStairs(38))
}