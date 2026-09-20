class Solution {
    public int reverseDegree(String s) {
        int reverseDegree=0;
        for(int i=0;i<s.length();i++){
            int reverseValue = 26-(s.charAt(i)-'a');
            int index=i+1;
            reverseDegree=reverseDegree+(reverseValue*index);
        }
        return reverseDegree;
    }
}