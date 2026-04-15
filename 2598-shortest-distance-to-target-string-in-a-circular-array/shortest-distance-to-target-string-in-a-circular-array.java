class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        int n = words.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int current = (startIndex + i) % n;
            if(target.equals(words[current])){
                min=Math.min(min,i);
            }
        }
        for (int i = 0; i < n; i++) {
            int current =(startIndex - i % n + n) % n;
            if(target.equals(words[current])){
                min=Math.min(min,i);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}