package _108__convert_sorted_to_binary

import kotlin.math.max

var ti = TreeNode(5)
var v = ti.value

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) return null
    val middleIndex = max(0, nums.size / 2)
    val middleValue = nums[middleIndex]
    val node = TreeNode(middleValue)
    if(middleIndex != 0) node.left = sortedArrayToBST(nums.take(middleIndex).toIntArray())
    if(middleIndex < nums.size - 1) node.right = sortedArrayToBST(nums.takeLast(nums.size - middleIndex - 1).toIntArray())
    return node
}

fun main() {}