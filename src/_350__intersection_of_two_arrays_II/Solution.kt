package _350__intersection_of_two_arrays_II

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        if(nums1.size > nums2.size) {
            return intersect(nums2, nums1)
        }
        val shorterNumsFrequency = hashMapOf<Int, Int>()
        nums1.forEach {
            if(shorterNumsFrequency.containsKey(it)){
                shorterNumsFrequency[it] = shorterNumsFrequency[it]!! + 1
            } else {
                shorterNumsFrequency[it] = 1
            }
        }
        val result = mutableListOf<Int>()
        nums2.forEach {
            if (shorterNumsFrequency.contains(it) && shorterNumsFrequency[it]!! >= 1) {
                shorterNumsFrequency[it] = shorterNumsFrequency[it]!! - 1
                result.add(it)
            }
        }
        return result.toIntArray()
    }
}