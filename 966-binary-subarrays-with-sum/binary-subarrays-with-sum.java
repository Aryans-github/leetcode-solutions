class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal<0) return 0;
        int l1=0,l2=0,r=0,subarrays=0;
        int maxLength1=0,maxLength2=0;
        int sum1=0,sum2=0;
        while(r<nums.length){
            sum1+=nums[r];
            sum2+=nums[r];
            
            while(sum1>goal && l1<=r){
                sum1-=nums[l1];
                l1++;
            }
            while(sum2>goal-1 && l2<=r){
                sum2-=nums[l2];
                l2++;
            }
            maxLength1=r-l1+1;
            maxLength2=r-l2+1;
            
            subarrays+=(maxLength1-maxLength2);
            r++;
        }
        
        return subarrays;

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