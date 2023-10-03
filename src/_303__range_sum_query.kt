class NumArray(private val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        if (left < 0 || right > nums.size) return 0
        var result = 0
        for (i in left..right) {
            result += nums[i]
        }
        return result
    }
}