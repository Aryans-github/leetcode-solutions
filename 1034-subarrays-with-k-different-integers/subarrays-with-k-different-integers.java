class Solution {

    public int subarrays(int[] nums,int k){
        int l=0,r=0;
        int count=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        while(r<nums.length){
            hs.put(nums[r],hs.getOrDefault(nums[r],0)+1);

            while(hs.size()>k){
                hs.put(nums[l],hs.get(nums[l])-1);
                if(hs.get(nums[l])==0){
                    hs.remove(nums[l]);
                }
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {

        return subarrays(nums,k) - subarrays(nums,k-1);



        // Brute force -- but TLE due to big size 

        // int subarrays=0;
        // for(int i=0;i<nums.length;i++){
        //     HashSet<Integer> hs = new HashSet<>();
        //     for(int j=i;j<nums.length;j++){
        //         hs.add(nums[j]);

        //         if(hs.size()>k) break;
        //         if(hs.size()==k) subarrays+=1;
                
        //     }
        // }
        // return subarrays;
    }
}