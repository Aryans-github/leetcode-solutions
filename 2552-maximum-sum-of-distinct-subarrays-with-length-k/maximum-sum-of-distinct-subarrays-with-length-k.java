class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        long max = 0,windowSum=0;
        for (int i = 0; i < k; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
            windowSum += nums[i];
        }
        if (hs.size() == k) {
            max=windowSum;
        }
        
        for (int i = k; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
            windowSum += nums[i];
            windowSum -= nums[i-k];
            int currentCount = hs.get(nums[i-k]);
            if (currentCount > 1) {
                // Safe to decrement
                hs.put(nums[i-k], currentCount - 1);
            } else {
                // If count drops to 0, completely remove the key
                hs.remove(nums[i-k]);
            }
            if (hs.size() == k) {
                max = Math.max(max, windowSum);
            } else
                continue;
        }
        return max;
    }
}