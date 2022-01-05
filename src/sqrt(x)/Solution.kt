package `sqrt(x)`


class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 1 || x == 0) {
            return x
        }
        var result = x.toDouble()
        var temp = 0.0
        var oldSpot = 0.0
        while (Math.abs(result - oldSpot) > 1) {
            temp = result
            var multiple = result.toDouble() * result.toDouble()
            if (multiple < x) {
                result += Math.abs(result - oldSpot) * 0.5

            } else if (multiple > x) {
                result -= Math.abs(result - oldSpot) * 0.5
            } else {
                return result.toInt()
            }
            oldSpot = temp
        }

        while (result.toInt() * result.toInt() > x) {
            result--
        }
        while ((result.toInt().toDouble() + 1) * (result.toInt().toDouble() + 1) <= x) {
            result++
        }
        return result.toInt()
    }
}


fun main() {
    var solution = Solution()
    print(solution.mySqrt(2147483647))
}