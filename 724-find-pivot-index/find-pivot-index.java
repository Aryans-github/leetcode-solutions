class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        int[] suffix = new int[nums.length + 1];
        prefix[0] = 0;
        suffix[nums.length] = 0;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i != nums.length - 1) {
                suffix[i] = suffix[i + 1] + nums[i + 1];

            }
            else  suffix[i]=suffix[i+1];

        }
        for (int i = 0; i < nums.length; i++) {
            if (prefix[i] == suffix[i])
                return i;
        }
        return -1;
    }
}