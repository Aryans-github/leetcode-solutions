class MinStack {
    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public Stack<Pair> stk;
    public MinStack() {
        stk = new Stack<>();
    }

    public void push(int val) {
        if (stk.isEmpty()) {
            stk.push(new Pair(val, val));
        } else {
            stk.push(new Pair(val, Math.min(val, stk.peek().second)));
        }
    }

    public void pop() {
        stk.pop();
    }

    public int top() {
        return stk.peek().first;
    }

    public int getMin() {
        return stk.peek().second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */