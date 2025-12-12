class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p1 = 0;
        int p2 = 1;
        while (p1 < (nums.length - 1)) {
            if (nums[p1] + nums[p2] == target) {
                int[] ans = new int[2];
                ans[0] = p1;
                ans[1] = p2;
                return ans;
            }
            if (p2 == nums.length - 1) {
                p1++;
                p2 = p1 + 1;
            } else {
                p2++;
            }
        }
        return new int[2];
        
        // -- Simpliest method using Loop
        //    for(int i=0;i<(nums.length-1);i++){
        //         for(int j=i+1;j<nums.length;j++){
        //             if((nums[i]+nums[j])==target){
        //                 int[] ans = new int[2];
        //                 ans[0]=i;
        //                 ans[1]=j;
        //                 return ans;
        //             }
        //         }
        //    }
        //    return new int[2];
    }
}