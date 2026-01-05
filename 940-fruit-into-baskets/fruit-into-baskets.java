class Solution {
    public int totalFruit(int[] fruits) {
        // Max length subarray with at most 2 type of numbers/fruits.
        // So idea is the subarray with at most 2 numbers and max length

        // Sliding window Approach
        int l = 0, r = 0;
        int maxLength = 0;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        while (r < fruits.length) {
            
                hs.put(fruits[r], hs.getOrDefault(fruits[r], 0) + 1);

            
            
                while(hs.size()>2){
                    
                    hs.put(fruits[l],hs.get(fruits[l])-1);
                    if(hs.get(fruits[l])==0){
                        hs.remove(fruits[l]);
                    }
                    l++;
                }
            
            maxLength=Math.max(maxLength,r-l+1);
            r++;
        }

        return maxLength;

        // Bruteforce - this is not a solution as input is very big so time limit exceeds
        // int maxLength=0;

        // for(int i=0;i<fruits.length;i++){
        //     HashSet<Integer> hs = new HashSet<>();
        //     int length=0;
        //     for(int j=i;j<fruits.length;j++){
        //         hs.add(fruits[j]);
        //         if(hs.size() <= 2){
        //             length++;
        //             maxLength=Math.max(maxLength,length);
        //         }
        //     }
        // }
        // return maxLength;
    }
}