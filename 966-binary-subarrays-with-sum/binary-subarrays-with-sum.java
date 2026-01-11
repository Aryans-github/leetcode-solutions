class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int l1 = 0, l2 = 0, r = 0, subarrays = 0;
        int sum1 = 0, sum2 = 0;

        while (r < nums.length) {
            sum1 += nums[r];
            sum2 += nums[r];

            // Count subarrays with sum <= goal
            while (l1 <= r && sum1 > goal) {
                sum1 -= nums[l1];
                l1++;
            }

            // Count subarrays with sum <= goal-1
            while (l2 <= r && sum2 > goal - 1) {
                sum2 -= nums[l2];
                l2++;
            }

            // Subarrays with sum exactly = goal
            subarrays += (r - l1 + 1) - (r - l2 + 1);
            r++;
        }

        return subarrays;
        // int l=0,r=0,subarrays=0;
        // int maxLength1=0,maxLength2=0;
        // int sum=0;
        // while(r<nums.length){
        //     sum+=nums[r];

        //     while(sum>goal){
        //         sum-=nums[l];
        //         l++;
        //     }
        //     if(sum<=goal){
        //         maxLength1=Math.max(maxLength1,r-l+1);
        //     }
        //     if(sum<=goal-1){
        //         maxLength2=Math.max(maxLength2,r-l+1);
        //     }
        //     r++;
        //     subarrays+=(maxLength1-maxLength2);
        // }

        // return subarrays;

        // Brute force but take a lot of runtime
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             count++;
        //         }
        //         else if(sum>goal) break;
        //     }
        // }
        // return count;
    }
}