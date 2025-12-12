class Solution {
    public int[] twoSum(int[] nums, int target) {
    //    int p1=0;
    //    int p2=1;
       for(int i=0;i<(nums.length-1);i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    int[] ans = new int[2];
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
       }
       return new int[2];
    }
}