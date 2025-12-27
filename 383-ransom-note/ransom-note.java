class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hs = new HashMap<>();

        // Fill the map with magazine characters
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }

        // Check ransomNote against the map
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i); // Use ransomNote character here!

            if (!hs.containsKey(c) || hs.get(c) == 0) {
                return false;
            } else {
                // Decrement the count in the map
                hs.put(c, hs.get(c) - 1);
            }
        }
        return true;
    }
}