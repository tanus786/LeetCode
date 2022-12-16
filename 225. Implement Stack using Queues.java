class MyStack {
    private Stack<Integer> mainStack;
    public MyStack() {
        mainStack = new Stack<>();
    }
    
    public void push(int x) {
        mainStack.push(x);
    }
    
    public int pop() {
        return mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public boolean empty() {
        return mainStack.isEmpty();
    }
}
