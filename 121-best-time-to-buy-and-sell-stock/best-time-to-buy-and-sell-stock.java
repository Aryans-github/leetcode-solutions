class Solution {
    public static int maxProfit(int[] prices) {
        
        
        int minValue = Integer.MAX_VALUE;
        int maxValue =0;
        
        int profit =0;
       
        for(int i =0;i<prices.length;i++){
            if(prices[i]<minValue){
                minValue=prices[i];
                
            }
            profit = prices[i]-minValue;
            maxValue = Math.max(profit,maxValue);
        }
        
        return maxValue;


        // if (prices.length==0) {
        //     return 0;
        // }
        // int left = 0;
        // int right = left + 1;
        // int mprofit = 0;

        // while (right < prices.length) {
        //     if (prices[left] < prices[right]) {
        //        int profit = prices[right] - prices[left];
        //         mprofit = Math.max(profit, mprofit);
                

        //     } else {
        //         left = right;
               
        //     }
        //     right++;
        // }

        // return mprofit;

    }
}