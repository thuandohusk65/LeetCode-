package _26__remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var size = nums.size
        var countDuplicate = 0
        if (size == 1) {
            return size
        }
        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                size--
                countDuplicate++
            } else {
                nums[i - countDuplicate] = nums[i]
            }
        }
        return size
    }
}