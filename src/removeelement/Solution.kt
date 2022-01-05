package removeelement

class Solution {
    fun removeElement(nums: IntArray, numDel: Int): Int {
        var size = nums.size
        var count = 0
        for (i in 0 until nums.size) {
            if (nums[i] == numDel) {
                count++
                size--
            } else {
                nums[i - count] = nums[i]
            }
        }
        return size
    }
}
