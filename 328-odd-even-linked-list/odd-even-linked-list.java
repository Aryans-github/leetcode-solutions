/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        // if(head.next.next==null) {
        //     // check only 2 nodes for odd even
        // }
        ListNode first = head;
        ListNode second = head.next;
        ListNode newhead = head.next;
        while (second != null && second.next != null) {
            // if (!first % 2 == 0) {
                first.next=second.next;
                first=second.next;
                second.next=first.next;
                second=first.next;
            // }

        }
        first.next=newhead;
        return head;
    }
}