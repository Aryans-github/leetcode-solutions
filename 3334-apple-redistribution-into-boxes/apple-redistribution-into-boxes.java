import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        ;

        Arrays.sort(capacity);

        for (int i = 0; i < capacity.length / 2; i++) {
            int temp = capacity[i];
            capacity[i] = capacity[capacity.length - 1 - i];
            capacity[capacity.length - 1 - i] = temp;
        }
        int total_apple=0;
        for(int i:apple){
            total_apple+=i;
        }
        int largeCapacity=0,i=0;
        while(largeCapacity<total_apple && i<capacity.length){
            largeCapacity+=capacity[i];
            i++;
        }
        
        return i;
        // Arrays.sort(capacity);
        // int i=0,j=1;
        // int remain=capacity[capacity.length-1],count=1;
        // while(i<apple.length && j<capacity.length){
        //     remain = remain - apple[i];

        //     if(remain==0) {
        //         remain=remain+capacity[capacity.length-1-j];
        //         j++;
        //         i++;
        //         count++;
        //     }
        //     else if(remain>0) i++;
        //     else{
        //         remain=remain+capacity[capacity.length-1-j];
        //         j++;
                
        //         count++;
        //     }
        // }
        // return count;
    }
}