class Solution {
    public int repeatedNTimes(int[] nums) {

        // Frequency Array Method 
        int [] counts = new int [10001];

        for(int i:nums){
            counts[i]++;
        }

        int maxCount=-1;
        int value=0;
        for(int i=0;i<counts.length;i++){
            if(counts[i]>maxCount){
                maxCount=counts[i];
                value=i;
            }

        }

        return value;

        // Hashmap method

        // HashMap<Integer, Integer> hs = new HashMap<>();
        // for (int i : nums) {
        //     hs.put(i, hs.getOrDefault(i, 0) + 1);
        // }

        // int maxKey = Collections.max(hs.entrySet(), Map.Entry.comparingByValue()).getKey();

        // return maxKey;
    }
}