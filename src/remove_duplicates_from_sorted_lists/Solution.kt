package remove_duplicates_from_sorted_lists

class ListNode(var value: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var previousNode: ListNode? = null
        var temp: ListNode? = head
        while (temp != null) {
            if (previousNode != null && temp.value == previousNode.value) {
                previousNode.next = temp.next
                temp = temp.next
            } else {
                previousNode = temp
                temp = temp.next
            }
        }
        return head
    }
}

//class Solution {
//    fun deleteDuplicates(head: ListNode?): ListNode? {
//        var temp: ListNode? = head
//        while (temp != null && temp.next != null) {
//            if (temp.next != null && temp.value == temp.next?.value) {
//                temp.next = temp.next!!.next
//            } else {
//                temp = temp.next
//            }
//        }
//        return head
//    }
//}


fun main() {
    var solution = Solution()
    var old = ListNode(1)
    old.next = ListNode(1)
    old.next!!.next = ListNode(2)
//    old.next!!.next!!.next = ListNode(2)
    var result = solution.deleteDuplicates(old)
    while (result != null) {
        print(result!!.value)
        result = result.next
    }
}


