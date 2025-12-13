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
        HashMap<ListNode, Boolean> cycle = new HashMap<>();

        ListNode temp = head;
        while (temp != null) {
            if (cycle.containsKey(temp)) {
                return temp; // Cycle detected, return the node
            }
            cycle.put(temp, true); // Mark node as visited
            temp = temp.next;
        }
        return null;
    }
}