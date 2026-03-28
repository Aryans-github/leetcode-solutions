class Solution {
    public int firstMissingPositive(int[] nums) {

        // Both are codes of cyclic sort

        int i=0;
        int n = nums.length;
        while(i<n){
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else i++;
        }
        
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return n+1;

        // for (int i = 0; i < nums.length; i++) {
        //     while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
        //         int temp = nums[i];
        //         nums[i] = nums[temp - 1];
        //         nums[temp - 1] = temp;
        //     }
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != (i + 1)) {
        //         return i + 1;
        //     }
        // }
        // return nums.length+1;
    }
    void swap(int[] nums,int i,int idx){
        int temp = nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}