class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i : nums) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }

        int maxKey = Collections.max(hs.entrySet(), Map.Entry.comparingByValue()).getKey();

        return maxKey;
    }
}