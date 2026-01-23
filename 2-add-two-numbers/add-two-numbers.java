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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to simplify list construction
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there are nodes in either list or a carry value
        while (l1 != null || l2 != null || carry != 0) {
            
            // Get values from l1 and l2, or 0 if a list is exhausted
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum, including the carry
            int sum = carry + x + y;
            
            // Update the carry for the next iteration
            carry = sum / 10;
            
            // Create a new node with the digit and link it to the list
            current.next = new ListNode(sum % 10);
            
            // Move pointers to the next nodes
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        
        return dummyHead.next;
    }
}
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode temp = l1;
//         ListNode temp1 = l2;
//         int size1 =0,size2=0;
//         int i =0,j=0;
//         long num1 = 0;
//         long num2 =0;
//         while(temp!=null){
//             int data = temp.val;
//             num1 = (long) (num1 + data * Math.pow(10, i));
//             size1++;
//             i++;
//             temp=temp.next;
//         }
//         while(temp1!=null){
//             int data = temp1.val;
//             num2 = (long) (num2 + data * Math.pow(10,j));
//             j++;
//             size2++;
//             temp1=temp1.next;
//         }

//         long add = num1 + num2;
//         // Assume 'l3' is the head of your linked list
//         ListNode l3 = new ListNode();
//         // Use 'current' to build the list
//         ListNode current = l3; 

//         if (add == 0) {
//             return new ListNode(0);
//         }

//         while (add > 0) {
//             int rem = (int) (add % 10);
//             current.next = new ListNode(rem);
//             current = current.next;
//             add = add / 10;
//         }
        
        
//         return l3.next;
//     }
// }