class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p = 0,q=numbers.length-1;
        while(p<q){
            if(numbers[p]+numbers[q]==target) return new int[]{p+1,q+1};
            if(numbers[p]+numbers[q]<target) p++;
            if(numbers[p]+numbers[q]>target) q--;
        }
        return new int[]{0,0};
    }
}