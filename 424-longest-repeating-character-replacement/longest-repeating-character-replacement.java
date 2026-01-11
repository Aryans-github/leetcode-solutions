class Solution {
    public int characterReplacement(String s, int k) {

        int l=0,r=0,maxLength=0;
        int[] hash = new int[26];
        int maxFreq=0;
        while(r<s.length()){

            hash[s.charAt(r)-'A']++;

            for(int freq:hash){
                maxFreq= Math.max(freq,maxFreq);
            }
            
            int replacements = (r-l+1)-maxFreq;
            while(replacements>k){
                hash[s.charAt(l)-'A']--;
                l++;
                maxFreq = 0;
                for(int freq:hash){
                    maxFreq= Math.max(freq,maxFreq);
                }
                replacements = (r-l+1)-maxFreq;
            }
            maxLength=Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
        // Correct but runtime is high , due to use of hashmap

        // int l=0,r=0,maxLength=0;
        // HashMap<Character,Integer> hs = new HashMap<>();
        // while(r<s.length()){
        //     hs.put(s.charAt(r),hs.getOrDefault(s.charAt(r),0)+1);

        //     int maxFreq = 0;
        //     for(int freq : hs.values()){
        //         maxFreq = Math.max(maxFreq, freq);
        //     }

        //     int replacements=(r-l+1)-maxFreq;
        //     if(replacements>k){
        //         hs.put(s.charAt(l),hs.get(s.charAt(l))-1);
        //         if(hs.get(s.charAt(l))==0){
        //             hs.remove(s.charAt(l));
        //         }
        //         l++;
                
        //         maxFreq = 0;
        //         for(int freq : hs.values()){
        //             maxFreq = Math.max(maxFreq, freq);
        //         }
        //         replacements=(r-l+1)-maxFreq;
        //     }
        //     maxLength=Math.max(maxLength,r-l+1);
        //     r++;
        // }
        // return maxLength;

        // Brute force but TLE due to big input.

        // int maxLength = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     int[] count = new int[26]; // count frequency of each character

        //     for (int j = i; j < s.length(); j++) {
        //         count[s.charAt(j) - 'A']++;

        //         int maxFreq = 0;
        //         for (int freq : count) {
        //             maxFreq = Math.max(maxFreq, freq);
        //         }

        //         int windowLength = j - i + 1;
        //         int replacementsNeeded = windowLength - maxFreq;

        //         if (replacementsNeeded <= k) {
        //             maxLength = Math.max(maxLength, windowLength);
        //         } else {
        //             break; 
        //         }
        //     }
            
        // }
        // return maxLength;
    }
}