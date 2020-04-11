class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        stack.push(x);
        if (x < min){
            minstack.push(x);
            min = x;
        }else
            minstack.push(min);
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
        if (minstack.isEmpty()) min = Integer.MAX_VALUE;
        else min = minstack.peek();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
