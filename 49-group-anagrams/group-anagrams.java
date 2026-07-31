import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hs = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!hs.containsKey(sorted)) {
                hs.put(sorted, new ArrayList<>());
            }
            hs.get(sorted).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>(hs.values());
        return result;
    }
}