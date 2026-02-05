class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                int index = (i + nums[i]) % nums.length;
                result[i] = nums[index];
            } else if (nums[i] < 0) {
                int index = (i - Math.abs(nums[i])) % nums.length;
                if (index < 0) {
                    result[i]=nums[nums.length+index];
                } else {
                    result[i] = nums[index];

                }
            } else if (nums[i] == 0) {
                result[i] = nums[i];
            }
        }
        return result;
    }
}