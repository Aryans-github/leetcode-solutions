class Solution {
    public int search(int[] nums, int target) {
        // Using Recursion

        return binaryS(nums,target,0,nums.length-1);


        // Basic Method

        // int first = 0;
        // int last = nums.length-1;

        // while(first<=last){

        //     int mid = (first+last)/2;
        //     if(target==nums[mid]) return mid;
        //     else if(target>nums[mid]){
        //         first=mid+1;
        //     }
        //     else if(target<nums[mid]){
        //         last=mid-1;
        //     }
            
        // }
        // return -1;
    }

    public int binaryS(int[] arr,int target,int first,int last){
        if(last<first) return -1;
        int mid = (first+last)/2;
        if(arr[mid]==target) return mid;
        if(target>arr[mid]) return binaryS(arr,target,mid+1,last);
        else return binaryS(arr,target,first,mid-1);
    }
}