package _160__intersection_of_two_linked_lists

var li = ListNode(5)
var v = li.value

class ListNode(var value: Int) {
    var next: ListNode? = null
}


class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) return null
        var pointB = headB
        var pointA = headA
        while (pointA != null || pointB != null) {
            if (pointA == null) pointA = headB
            if (pointB == null) pointB = headA
            if (pointA == pointB) return pointA
            pointA = pointA.next
            pointB = pointB.next
        }
        return null
    }

    fun naiveSolution(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) return null
        val nodeAtAHasSaved = mutableMapOf<ListNode, Int>()
        var pointB = headB
        var pointA = headA
        while (pointB != null) {
            if (nodeAtAHasSaved.containsKey(pointB)) {
                return pointB
            }
            while (pointB == headB && pointA != null) {
                if (pointB == pointA) return pointB
                if (!nodeAtAHasSaved.containsKey(pointA)) {
                    nodeAtAHasSaved[pointA] = 0
                }
                pointA = pointA.next
            }
            pointB = pointB.next
        }
        return null
    }
}