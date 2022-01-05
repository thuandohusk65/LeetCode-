package mergesortedarray

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        if (m == 0) {
            for (i in nums2.indices) {
                nums1[i] = nums2[i]
            }
            return
        }
        var id1 = m - 1
        var id2 = n - 1
        var endPoint = m + n - 1
        while (id2 >= 0) {
            if (id1 >= 0 && nums1[id1] > nums2[id2]) {
                nums1[endPoint] = nums1[id1]
                id1--
                endPoint--
            } else {
                nums1[endPoint] = nums2[id2]
                id2--
                endPoint--
            }
        }
    }
}

fun main() {
    var solution = Solution()
    var nums1 = intArrayOf(2, 0)
    var nums2 = intArrayOf(1)
    solution.merge(nums1, 1, nums2, 1)
    for (i in nums1) {
        println(i)
    }
}