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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode len = head;
        int n=0;
        while(len!=null){
            len=len.next;
            n++;
        }
        k=k%n;
        while(k>0){
            ListNode temp = head;
            ListNode temp1;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp1 = temp.next;
            temp1.next=head;
            head=temp1;
            temp.next=null;
            k--;
        }
         
         return head;
    }
}