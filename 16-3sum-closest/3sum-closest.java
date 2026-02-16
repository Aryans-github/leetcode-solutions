import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < closest) {
                    closest = Math.abs(sum - target);
                    result = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}