class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(!hs1.contains(nums[i])){
                    hs1.add(nums[i]);
                }
                else{
                    if(hs2.contains(nums[i])){
                        return false;
                    }
                    else{hs2.add(nums[i]);}
                }
            }
            else{
                if(!hs2.contains(nums[i])){
                    hs2.add(nums[i]);
                }
                else{
                    if(hs1.contains(nums[i])){
                        return false;
                    }
                    else{hs1.add(nums[i]);}
                }

            }
        }
        return true;
    }
}