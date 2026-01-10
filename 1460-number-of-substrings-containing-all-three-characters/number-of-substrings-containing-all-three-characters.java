class Solution {
    public int numberOfSubstrings(String s) {

        // HashMap 

        int l = 0, r = 0;
        int count = 0;

        HashMap<Character, Integer> hs = new HashMap<>();
        while (r < s.length()) {
            hs.put(s.charAt(r), hs.getOrDefault(s.charAt(r), 0) + 1);
            while (hs.size() == 3) {
                count += s.length() - r; // Count valid substrings
                hs.put(s.charAt(l), hs.get(s.charAt(l)) - 1);
                if (hs.get(s.charAt(l)) == 0) {
                    hs.remove(s.charAt(l));
                }
                l++;
            }

            r++;
        }
        return count;

        // Brute Force -- But it will give TME as input is very big

        // int count=0;

        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> hs = new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         hs.add(s.charAt(j));
        //         if(hs.size()==3){
        //             count++;
        //         }
        //     }  
        // }
        // return count;
    }
}