package _7__reverse_integer

class Solution {
    fun reverse(x: Int): Int {
        val MIN = Int.MIN_VALUE
        val MAX = Int.MAX_VALUE
        var reversed = 0
        var original = x
        while(original != 0) {
            if(reversed > MAX / 10 || (reversed == MAX/10 && original % 10 > MAX %  10)) return 0
            if(reversed < MIN / 10 || (reversed == MIN/10 && original % 10 < MIN %  10)) return 0
            reversed = reversed * 10 + original % 10
            original/=10
        }
        return reversed
    }
}


fun main() {
    print(Solution().reverse(1534236469))
}