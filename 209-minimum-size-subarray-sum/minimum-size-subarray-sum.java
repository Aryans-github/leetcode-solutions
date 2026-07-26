class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left=0;
        int right=0;
        int sum =0;
        int minLen=Integer.MAX_VALUE;
        while(right<nums.length && left<=right){
            sum = sum + nums[right];
            while(sum>=target){
                minLen=Math.min(minLen,right-left+1);
                sum-=nums[left];
                left++;
                // right++;
            }
            right++;

        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;























        // int left = 0;
        // int sum = 0;
        // int ans = Integer.MAX_VALUE;
        // for (int right = 0; right < nums.length; right++) {
        //     sum += nums[right];
        //     while (sum >= target) {
        //         ans = Math.min(ans, right - left + 1);
        //         sum -= nums[left];
        //         left++;
        //     }
        // }
        // if(ans==Integer.MAX_VALUE) return 0;
        // return ans;
    }
}