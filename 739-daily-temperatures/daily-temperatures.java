class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stk = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];

        for(int i=0;i<n;i++){
            if(stk.isEmpty()) stk.push(i);
            else if((!stk.isEmpty()) && temperatures[stk.peek()]<temperatures[i]){
                while((!stk.isEmpty()) && temperatures[stk.peek()]<temperatures[i]){
                    int poped=stk.pop();
                    answer[poped]=Math.abs(i-poped);
                }
                
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            answer[stk.pop()]=0;
        }
        return answer;
    }
}