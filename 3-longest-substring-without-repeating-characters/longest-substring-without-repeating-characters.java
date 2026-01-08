class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Using HashSet
        int l=0,r=0,maxLength=0;

        HashSet<Character> hs = new HashSet<>();
        while(r<s.length()){
            if(!hs.contains(s.charAt(r))){
                hs.add(s.charAt(r));
                r++;
                maxLength= Math.max(maxLength,hs.size());
            }
            else{
                hs.remove(s.charAt(l));
                l++;
            }
        }
        return maxLength;

        // Using HashMap

        // if (s.length() == 0)
        //     return 0;
        // if (s.length() == 1)
        //     return 1;

        // HashMap<Character, Integer> hs = new HashMap<>();
        // int l = 0, r = 0;
        // int maxLength = 0;

        // while (r < s.length()) {

        //     if (hs.containsKey(s.charAt(r))) {
        //         if (hs.get(s.charAt(r)) >= l) {
        //             l = hs.get(s.charAt(r)) + 1;
        //             hs.put(s.charAt(r), r);

        //         } else {
        //             hs.put(s.charAt(r), r);
        //         }
        //     } else {
        //         hs.put(s.charAt(r), r);

        //     }
        //     maxLength = Math.max(r - l + 1, maxLength);
        //     r++;
        // }

        // return maxLength;

        // int maxLength = 0;
        // int left = 0; // Left pointer of the window
        // HashSet<Character> set = new HashSet<>();

        // for (int right = 0; right < s.length(); right++) {
        //     while (set.contains(s.charAt(right))) {
        //         set.remove(s.charAt(left)); // Shrink the window
        //         left++;
        //     }
        //     set.add(s.charAt(right)); // Expand the window
        //     maxLength = Math.max(maxLength, right - left + 1);
        // }
        // return maxLength;
    }
}