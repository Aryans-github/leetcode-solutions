/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> hs = new HashSet<>();

        ListNode temp = head;
        while(temp!=null){
            if(hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp=temp.next;
        }
        return false;
        // if (head == null || head.next == null) {
        //     return false;
        // }
        // ListNode tortoise = head;
        // ListNode hare = head;
        
        // while(hare != null && hare.next != null){
            
        //     tortoise=tortoise.next;
        //     hare=hare.next.next;
        //     if(hare==tortoise) return true;
        // }
        // return false;
    }
}