class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        int count = 1;
        while (q <= nums.length - 1) {
            if (nums[p] == nums[q]) {
                q++;
            } else {
                p=p+1;
                nums[p] = nums[q];
                count++;
            }
        }
        //    while(p<=nums.length()-1){
        //     nums[p]=
        //    }
        return count;
    }
}