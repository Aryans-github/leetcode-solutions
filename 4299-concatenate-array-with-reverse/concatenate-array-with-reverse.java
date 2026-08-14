class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int sub = 1;
        for(int i=nums.length;i<2*nums.length;i++){
            ans[i]=nums[nums.length-(sub++)];
        }
        return ans;
    }
}