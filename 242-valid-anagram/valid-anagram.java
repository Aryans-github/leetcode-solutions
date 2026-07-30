class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> hs1 = new HashMap<>();
        HashMap<Character,Integer> hs2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs1.put(s.charAt(i),hs1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            hs2.put(t.charAt(i),hs2.getOrDefault(t.charAt(i),0)+1);
        }

        return hs1.equals(hs2);
        // char[] S = s.toCharArray();
        // char[] T = t.toCharArray();

        // Arrays.sort(S);
        // Arrays.sort(T);

        // String sortedS = new String(S);
        // String sortedT = new String(T);
        
        // return sortedS.equals(sortedT);
    }
}