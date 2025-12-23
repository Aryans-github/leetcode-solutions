class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return 1;
       
        HashSet<Integer> hs = new HashSet<>();

        for (int i : nums) {
            hs.add(i);
        }
        int maxStreak = 0;

        for (int num : hs) { // Iterating over the set handles duplicates automatically
            // Only check for a sequence if 'num' is the start (nothing smaller exists)
            if (!hs.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (hs.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }

        return maxStreak;
    }
}