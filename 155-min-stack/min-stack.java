class MinStack {
    Stack<Integer> sta;
    Stack<Integer> mins;
    public MinStack() {
        sta=new Stack<>();
        mins=new Stack<>();
    }
    
    public void push(int value) {
        sta.push(value);
        if(mins.isEmpty() || mins.peek()>=value){
            mins.push(value);
        }
    }
    
    public void pop() {
        int k = sta.pop();
        if(k==mins.peek()){
            mins.pop();
        }
    }
    
    public int top() {
        return sta.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */