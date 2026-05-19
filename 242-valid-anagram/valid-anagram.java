class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        String sortedS = new String(S);
        String sortedT = new String(T);
        
        return sortedS.equals(sortedT);
    }
}