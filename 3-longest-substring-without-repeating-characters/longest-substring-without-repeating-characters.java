class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0; // Left pointer of the window
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // Shrink the window
                left++;
            }
            set.add(s.charAt(right)); // Expand the window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}