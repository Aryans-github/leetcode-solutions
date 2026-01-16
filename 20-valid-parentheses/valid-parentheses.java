import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (stk.isEmpty() || stk.peek() != s.charAt(i)) {
                    return false; 
                }
                stk.pop(); 
            }
            if (s.charAt(i) == '(') {
                stk.push(')');
            } else if (s.charAt(i) == '{') {
                stk.push('}');
            } else if (s.charAt(i) == '[') {
                stk.push(']');
            }
            
        }
        if (stk.isEmpty())
            return true;
        else
            return false;
    }
}
