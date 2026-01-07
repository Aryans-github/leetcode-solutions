/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private long totalSum = 0, maxProduct = 0;

    public int maxProduct(TreeNode root) {
        // Step 1: Calculate total tree sum
        totalSum = calculateSum(root);

        // Step 2: Find max product by splitting
        calculateSum(root);

        return (int) (maxProduct % (1_000_000_007));
    }

    private long calculateSum(TreeNode node) {
        if (node == null) return 0;

        // Sum of current subtree
        long subTreeSum = node.val + calculateSum(node.left) + calculateSum(node.right);

        // Compute product of splitting
        if (totalSum > 0) {
            maxProduct = Math.max(maxProduct, subTreeSum * (totalSum - subTreeSum));
        }

        return subTreeSum;
    }
}