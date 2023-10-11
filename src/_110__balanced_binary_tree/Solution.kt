package _110__balanced_binary_tree

import kotlin.math.abs
import kotlin.math.max

var ti = TreeNode(5)
var v = ti.value

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        return getDepth(root) != -1
    }

    fun getDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = getDepth(root.left)
        val rightDepth = getDepth(root.right)
        if (leftDepth == -1 || rightDepth == -1) return -1
        if (abs(rightDepth - leftDepth) > 1) return -1
        return 1 + max(leftDepth, rightDepth)
    }

    // naive solution
    fun isBalanced_2(root: TreeNode?): Boolean {
        if (root == null) return true
        return isBalanced(root.left) &&
                isBalanced(root.right) &&
                abs(getDepth_2(root.left) - getDepth_2(root.right)) <= 1
    }

    fun getDepth_2(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + max(getDepth(root.left), getDepth(root.right))
    }
}