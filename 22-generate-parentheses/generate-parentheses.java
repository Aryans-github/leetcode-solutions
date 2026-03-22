class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();

        parenthesis("", 0, 0, n, ls);
        return ls;
    }

    void parenthesis(String s, int left, int right, int n, List<String> ls) {
        if (right == n) {
            ls.add(s);
            return;
        } 
        if(left<n) parenthesis(s+"(",left+1,right,n,ls);
        if(right<left) parenthesis(s+")",left,right+1,n,ls);
    }
}