package _169__majority_element

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var majority = nums.first()
        var votes = 1
        nums.takeLast(nums.size - 1).forEach { ele ->
            if (ele == majority) {
                votes++
            } else {
                if (votes == 1) {
                    majority = ele
                } else {
                    votes--
                }
            }
        }
        return majority
    }
}