package _2__add_two_numbers

import kotlin.math.ln1p

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var newL1 = l1
        var newL2 = l2
        var result: ListNode? = null
        var resultPoint = result
        var rememberOne = false

        while (newL1 != null || newL2 != null) {
            val value1 = newL1?.`val`?.let {
                newL1 = newL1!!.next
                it
            } ?: 0
            val value2 = newL2?.`val`?.let {
                newL2 = newL2!!.next
                it
            } ?: 0
            var digitSum = value1 + value2
            if (rememberOne) {
                digitSum++
                rememberOne = false
            }
            val digitResult = if (digitSum <= 9) {
                digitSum
            } else {
                rememberOne = true
                digitSum - 10
            }
            val newNode = ListNode(digitResult)
            if (result == null) {
                result = newNode
                resultPoint = result
            } else {
                resultPoint?.next = newNode
                resultPoint = newNode
            }
        }
        if(rememberOne) {
            resultPoint?.next = ListNode(1)
        }
        return result
    }
}
