package _404__sum_of_left_leaves


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if (root == null) return 0
        var sumOfLeft = 0
        var sumOfRight = 0
        if (root.left != null) {
            if (root.left!!.left == null && root.left!!.right == null) {
                sumOfLeft = root.left!!.`val`
            } else {
                sumOfLeft = sumOfLeftLeaves(root.left)
            }
        }
        sumOfRight = sumOfLeftLeaves(root.right)
        return sumOfLeft + sumOfRight
    }
}