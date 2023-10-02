package _222__count_complete_tree_nodes

var ti = TreeNode(5)
var v = ti.`val`

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun countNodes(root: TreeNode?): Int {
        return if (root == null) 0
        else countNodes(root.left) + 1 + countNodes(root.right)
    }
}