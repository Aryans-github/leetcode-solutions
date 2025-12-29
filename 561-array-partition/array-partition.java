class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Step 2: Add every alternate element (minimum of each pair)
        }
        return sum;
    }
}