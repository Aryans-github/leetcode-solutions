class Solution {
    public int removeDuplicates(int[] nums) {

        int pointer=0,count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[pointer]!=nums[i]){
                nums[++pointer]=nums[i];
            }
        }
        return pointer+1;
        // int p = 0;
        // int q = 1;
        // int count = 1;
        // while (q <= nums.length - 1) {
        //     if (nums[p] == nums[q]) {
        //         q++;
        //     } else {
        //         p=p+1;
        //         nums[p] = nums[q];
        //         count++;
        //     }
        // }
        
        // return count;
    }
}