package _203__remove_linkedlist_element


var li = ListNode(5)
var v = li.`val`

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun removeElements(head: ListNode?, value: Int): ListNode? {
        var currentPoint = head
        while (currentPoint != null && currentPoint.`val` == value) {
            currentPoint = currentPoint.next
        }
        val head = currentPoint
        var previousPoint = currentPoint
        while (currentPoint != null) {
            if (currentPoint.`val` == value) {
                currentPoint = currentPoint.next
                previousPoint!!.next = currentPoint
            } else {
                previousPoint = currentPoint
                currentPoint = currentPoint.next
            }
        }
        return head
    }
}