class Solution {
    public boolean rotateString(String s, String goal) {
        String concat = s+s;
        if(goal.length()<s.length() || goal.length()>s.length()) return false;
        if(!(concat.contains(goal))) return false;
        return true;
    }
}