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
    public ListNode detectCycle(ListNode head) {
        // Method using the two pointers Specifically the Hare Tortoise Algorithm
        ListNode l1= head;
        ListNode l2= head;

        while(l2!=null && l2.next!=null){
            l1=l1.next;
            l2=l2.next.next; // Simple hare-tortoise to detect cycle
            if(l1==l2){     // Additional steps to get the start of cycle
                l1=head;    // set any one pointer to head
                while(l1!=l2){      // more one steps both pointers
                    l1=l1.next; 
                    l2=l2.next;
                }
                return l1;      // When they meet it will be the start of cycle
            }

        }
        return null;
        // Method using the HashSet

        // HashSet<ListNode> cycle = new HashSet<>();

        // ListNode temp = head;
        // while (temp != null) {
        //     if (cycle.contains(temp)) {
        //         return temp; 
        //     }
        //     cycle.add(temp); 
        //     temp = temp.next;
        // }
        // return null;
    }
}