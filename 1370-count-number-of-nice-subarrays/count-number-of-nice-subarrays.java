class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return niceSubArrays(nums,k)-niceSubArrays(nums,k-1);
    }

    static int niceSubArrays(int [] nums,int k){
        int l=0,r=0;
        int count=0;
        int niceSubarrays=0;
        while(r<nums.length){
            if(nums[r]%2!=0){
                count++;
            }
            while(count>k){
                if(nums[l]%2!=0) count-=1;
                l++; 
            }
            niceSubarrays+=(r-l+1);
            r++;
        }
        return niceSubarrays;
    }
}

// Brute force - - But TLE due to big size of array

        // int niceSubarrays=0;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]%2!=0) count++;
        //         if(count==k){
        //             niceSubarrays+=1;
        //         }
        //     }
        // }
        // return niceSubarrays;