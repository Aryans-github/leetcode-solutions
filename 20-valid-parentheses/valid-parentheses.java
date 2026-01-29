import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        // Inserting the corresponding close bracket when an open bracket is identified    

        // Stack<Character> stk = new Stack<>();

        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
        //         if (stk.isEmpty() || stk.peek() != s.charAt(i)) {
        //             return false; 
        //         }
        //         stk.pop(); 
        //     }
        //     if (s.charAt(i) == '(') {
        //         stk.push(')');
        //     } else if (s.charAt(i) == '{') {
        //         stk.push('}');
        //     } else if (s.charAt(i) == '[') {
        //         stk.push(']');
        //     }

        // }
        // if (stk.isEmpty())
        //     return true;
        // else
        //     return false;

        // // Inserting the open bracket to stack

        // Stack<Character> stk = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {

        //     if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        //         stk.push(s.charAt(i));
        //     } else {
        //         if (stk.isEmpty())
        //             return false;
        //         if (s.charAt(i) == ')' && stk.peek() == '(' || s.charAt(i) == '}' && stk.peek() == '{' || s.charAt(i) == ']' && stk.peek() == '[') {
        //             stk.pop();
        //         } else
        //             return false;
        //     }

        // }
        // if (stk.isEmpty())
        //     return true;
        // else
        //     return false;

        



        Stack<Character> stk = new Stack();
        
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty() && (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')) return false;
            if(s.charAt(i)=='('){
                stk.push(')');
            }
            else if(s.charAt(i)=='{'){
                stk.push('}');
            }
            else if(s.charAt(i)=='['){
                stk.push(']');
            }
            else{
                if(!stk.isEmpty() && stk.peek()!=s.charAt(i)){
                    return false;
                }
                else {
                    stk.pop();
                }
            }
        }
        if(!stk.isEmpty()) return false;
        return true;
    }
}
