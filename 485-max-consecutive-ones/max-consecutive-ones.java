class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int l=0,r=0;
        int maxLength=0,length=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                // l=i+1;
                // r=i+1;
                length=0;
            }
            else{
                length++;
            }
            // r++;
            maxLength=Math.max(length,maxLength);
        }
        return maxLength;
    }
}