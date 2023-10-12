//package remove_duplicates_from_sorted_lists;
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    public ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//public class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode nodeCurrency = head;
//        while (nodeCurrency != null && nodeCurrency.next != null) {
//            if (nodeCurrency.val == nodeCurrency.next.val) {
//                nodeCurrency.next = nodeCurrency.next.next;
//            } else {
//                nodeCurrency = nodeCurrency.next;
//            }
//        }
//        return head;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        System.out.println(head.next.next.val);
//    }
//}
