package _53__maxium_subarray

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var minMinus = 0
        var countMinus = 0
        var temp = 0
        var result = 0
        if (nums.isEmpty()) {
            return 0
        }
        for (id in 0 until nums.size) {
            temp += nums[id]
            if (nums[id] < 0 &&  temp < 0) {
                temp = 0
                countMinus++
            }
            //get min minus if we need
            if (nums[id] < 0 && (minMinus < nums [id] || minMinus == 0)) {
                minMinus = nums[id]
            }
            //save max sum
            if (result < temp) {
                result = temp
            }
        }
        if (countMinus == nums.size) {
            return minMinus
        }
        return result
    }
}

fun main() {
    var solution = Solution()
    var nums = intArrayOf(-2, -1)
    print(solution.maxSubArray(nums))
}