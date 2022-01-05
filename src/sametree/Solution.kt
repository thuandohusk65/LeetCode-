package sametree

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        } else if (p == null && q != null || p != null && q == null) {
            return false
        } else if (p != null && q != null && p.`val` == q.`val`) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        } else {
            return false
        }
    }
}

fun main() {
    var solution = Solution()
    var p = TreeNode(1)
    p.left = TreeNode(2)
    p.right = TreeNode(3)
    var q = TreeNode(1)
    q.left = TreeNode(2)
    q.right = TreeNode(3)
    print(solution.isSameTree(p, q))
}