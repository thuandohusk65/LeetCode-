package search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var middleId = nums.size / 2
        while (middleId >= 0 && middleId < nums.size) {
            if (middleId > 0 && (target < nums[middleId] && target > nums[middleId - 1])) {
                return middleId
            } else if (target < nums[middleId]) {
                middleId--
            } else if (target > nums[middleId]) {
                middleId++
            } else if (target == nums[middleId]) {
                return middleId
            }
        }
        if (middleId >= nums.size) {
            return nums.size
        } else if (middleId < 0) {
            return 0
        } else {
            return middleId
        }
    }
}