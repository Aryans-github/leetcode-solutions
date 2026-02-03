class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length <= 3) {
            return false;
        }
        int i = 0, j = 1;
        int count = 0;
        boolean flag = false;
        while (j < nums.length) {
            if(nums[0]<nums[1]){
                if (nums[i] < nums[j] && flag == false) {
                count++;
                flag = true;
            } else if (nums[i] > nums[j] && flag == true) {
                count++;
                flag = false;
            }
            else if(nums[i]==nums[j]) return false;
            }
            else return false;
            i+=1;
            j+=1;
        }
        if (count == 3)
            return true;
        else
            return false;
    }
}