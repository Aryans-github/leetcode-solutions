class NumArray {
    int[] ans;
    public NumArray(int[] nums) {
        ans = new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return ans[right];
        else return ans[right]-ans[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */