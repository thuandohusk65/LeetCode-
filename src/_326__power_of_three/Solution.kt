package _326__power_of_three

import kotlin.math.pow

class Solution {

    fun isPowerOfThree(n: Int): Boolean {
        return (3.0).pow(19.0).toInt() % n == 0
        }

    fun naiveSolution(n: Int): Boolean {
        if (n <= 0) return false
        var temp = n
        while(temp > 1) {
            val mod = temp % 3
            if (mod != 0) return false
            temp /= 3
        }
        return true
    }
}