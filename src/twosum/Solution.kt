package twosum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var hashMap: HashMap<Int, Int> = HashMap()
        var result: IntArray = IntArray(2)
        for (i in nums.indices) {
            var remainder = target - nums[i]
            if (hashMap.containsKey(remainder)) {
                result[0] = hashMap[remainder]!!
                result[1] = i
                return result
            }
            hashMap.put(nums[i], i)
        }
        return result
    }
}

fun main() {
    var solution = Solution()
    var result = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
    println("${result[0]} ${result[1]}")
}



