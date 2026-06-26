class Solution {
    public static void moveZeroes(int[] arr) {
        if(arr.length==0||arr.length==1) return;
        int p=0;
        int q=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[p];
                arr[p]=temp;
                p++;
            }
        }
    }  
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.err.println(Arrays.toString(nums));
    }
    
    
}