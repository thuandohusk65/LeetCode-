package _11__container_with_most_water

class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var left = 0
        var right = height.lastIndex
        while (left < right) {
            val newArea: Int
            if (height[left] < height[right]) {
                newArea = height[left] * (right - left)
                if (newArea > maxArea) maxArea = newArea
                left++
            } else {
                newArea = height[right] * (right - left)
                if (newArea > maxArea) maxArea = newArea
                right--
            }
        }
        return maxArea
    }
}