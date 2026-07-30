class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int pushes = 0;
        int i = 1;
        while (len > 0) {
            if (len >= 8) {
                len -= 8;
                pushes += 8 * i;
                i++;
            }
            if (len < 8) {
                pushes += len % 8 * i;
                break;
            }
        }
        return pushes;
    }
}