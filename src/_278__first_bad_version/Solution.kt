package _278__first_bad_version

import kotlin.math.abs

abstract class VersionControl() {
    abstract fun firstBadVersion(n: Int): Int
    fun isBadVersion(n: Int): Boolean {
        return n >= 1702766719
    }
}

class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        // first is always smaller or equals by second
        var first = 1
        var second = n
        if(isBadVersion(first)) return 1
        while (second - first > 1) {
            val nextPoint = ((first.toLong() + second.toLong()) / 2).toInt()
            val isNextPointBad = isBadVersion(nextPoint)
            if (isNextPointBad) {
                second = nextPoint
            } else {
                first = nextPoint
            }
        }
        return second
    }
}

fun main() {
    val solution = Solution()
    print(solution.firstBadVersion(2126753390))
}