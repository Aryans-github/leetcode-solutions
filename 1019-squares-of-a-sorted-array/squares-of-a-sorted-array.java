class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            // ans[i]=(int)Math.pow(nums[i],2);
            ans[i]=(nums[i]*nums[i]);

        }
        Arrays.sort(ans);
        return ans; 
    }
}