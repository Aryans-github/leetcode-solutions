class Solution {
    public int commonFactors(int a, int b) {
        int factors=0;
        int iterate=Math.min(a,b);
        for(int i=1;i<=iterate;i++){
            if(a%i==0 && b%i==0) factors++;
        }
        return factors;
    }
}