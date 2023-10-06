package _342__power_of_four

import kotlin.math.roundToInt
import kotlin.math.sqrt
class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        if(n <= 0) return false
        return sqrt(n.toDouble()) % 1.0 == 0.0 &&  isPowerOfTwo(sqrt(n.toDouble()).toInt())
    }

    // 1073741824 is 2^30, max integer that is power of two
    private fun isPowerOfTwo(n: Int): Boolean {
        return 1073741824 % n == 0
    }
}
