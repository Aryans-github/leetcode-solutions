class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stk = new Stack<>();
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if ((!stk.isEmpty()) && prices[stk.peek()] >= prices[i]) {
                while ((!stk.isEmpty()) && prices[stk.peek()] >= prices[i]) {
                    int poped = stk.pop();
                    answer[poped] = prices[poped] - prices[i];
                }
            }
            stk.push(i);
        }
        while (!stk.isEmpty()) {
            int poped=stk.pop();
            answer[poped] = prices[poped];
        }
        return answer;
    }
}