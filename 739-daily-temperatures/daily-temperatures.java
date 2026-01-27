class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack();
        int[] answer = new int[temperatures.length];
        int count = 0;

        for (int i = 0; i < temperatures.length; i++) {

            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]) {
                int poped = stk.pop();
                answer[poped] = i - poped;
            }
            stk.push(i);
        }
        while (!stk.isEmpty()) {
            answer[stk.pop()] = 0;
        }
        return answer;
    }
}