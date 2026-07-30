class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if((hs.containsKey(target-nums[i])) && (hs.get(target-nums[i])!=i)){
                return new int[] {i,hs.get(target-nums[i])};
            }
        }
        return new int[] {0,0};
        
        
        // int p1=0;
        // int p2=1;
        // int[] ans = new int[2];
        // while(p1<nums.length-1){
        //     if(nums[p1]+nums[p2]==target){
        //         ans[0]=p1;
        //         ans[1]=p2; 
        //         break;
        //     }
        //     if(p2==nums.length-1){
        //         p1++;
        //         p2=p1+1;
        //     } 
        //     else p2++;
        // }
        // return ans;


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