package _70__climbing_stairs

class Solution {
    fun climbStairs(n: Int): Int {
        if(n==1) return 1
        if(n==2) return 2
        var pStep = 2
        var ppStep = 1
        for(i in 0 until n - 2) {
            val temp = pStep
            pStep+=ppStep
            ppStep = temp
        }
        return pStep
    }
}

fun main(){
    print(Solution().climbStairs(4))
}