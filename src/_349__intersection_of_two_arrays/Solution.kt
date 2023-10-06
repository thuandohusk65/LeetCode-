package _349__intersection_of_two_arrays

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val nums1Unique = HashMap<Int, Int>()
        val result = mutableListOf<Int>()
        nums1.forEach {
            if (!nums1Unique.containsKey(it)) nums1Unique[it] = 0
        }
        nums2.forEach {
            if (nums1Unique.containsKey(it)) {
                result.add(it)
            }
            nums1Unique.remove(it)
        }
        return result.toIntArray()
    }
}