package _94__binarytree_inorder_traversal

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var result = mutableListOf<Int>()
        if (root == null) {
            return result
        }

        if (root.left != null) {
            result.addAll(inorderTraversal(root.left))
        }
        result.add(root.`val`)
        if (root.right != null) {
            result.addAll(inorderTraversal(root.right))
        }
        return result
    }
}