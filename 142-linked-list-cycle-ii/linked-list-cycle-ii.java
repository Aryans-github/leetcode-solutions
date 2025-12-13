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
        HashSet<ListNode> cycle = new HashSet<>();

        ListNode temp = head;
        while (temp != null) {
            if (cycle.contains(temp)) {
                return temp; // Cycle detected, return the node
            }
            cycle.add(temp); // Mark node as visited
            temp = temp.next;
        }
        return null;
    }
}