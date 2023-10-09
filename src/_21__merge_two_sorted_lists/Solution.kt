package _21__merge_two_sorted_lists

var li = ListNode(5)
var v = li.`val`

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode {
        var listOne = list1
        var listTwo = list2
        var mergeNode = ListNode(-1)
        var tempNode = mergeNode

        while (listOne != null || listTwo != null) {
            if ((listOne == null && listTwo != null) || (listOne != null && listTwo != null && listOne.`val` > listTwo.`val`)) {
                tempNode.next = listTwo
                listTwo = listTwo.next
            } else if ((listOne != null && listTwo == null) || (listOne != null && listTwo != null && listOne.`val` <= listTwo.`val`)) {
                tempNode.next = listOne
                listOne = listOne.next
            }
            tempNode = tempNode.next!!
        }
        return mergeNode.next!!
    }
}
