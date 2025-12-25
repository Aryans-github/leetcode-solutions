import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long maxSum = 0;
        int n = happiness.length;
        
        // Pick the top k happiest children
        for (int i = 0; i < k; i++) {
            // Index from the end: n - 1 - i
            // Happiness decreases by 'i' units after 'i' turns
            int currentHappiness = happiness[n - 1 - i] - i;
            
            // If happiness becomes 0 or less, further picks won't add to the sum
            if (currentHappiness <= 0) break;
            
            maxSum += currentHappiness;
        }
        
        return maxSum;
    }
}
