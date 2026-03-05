class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int alternatePattern1 = 0;

        char first = s.charAt(0);
        char second=0;
        if (first == '0') {
             second = '1';

        } else if(first =='1') {
             second = '0';
        }
        int i = 0;

        while (i < n) {
            if (i % 2 == 0 && s.charAt(i) != first) {
                alternatePattern1++;
            } else if (i % 2 != 0 && s.charAt(i) != second) {
                alternatePattern1++;
            }
            i++;
        }
        int alternatePattern2=s.length()-alternatePattern1;
        return Math.min(alternatePattern1,alternatePattern2);
    }

}