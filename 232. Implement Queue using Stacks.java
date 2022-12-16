class MyQueue {
    private Stack<Integer> mainStack;
    private Stack<Integer> auxStack;
    public MyQueue() {
        mainStack = new Stack<>();
        auxStack = new Stack<>();
    }
    
    public void push(int x) {
        while(!mainStack.isEmpty()){
            auxStack.push(mainStack.pop());
        }

        mainStack.push(x);

        while(!auxStack.isEmpty()){
            mainStack.push(auxStack.pop());
        }
    }
    
    public int pop() {
        return mainStack.pop();
    }
    
    public int peek() {
        return mainStack.peek();
    }
    
    public boolean empty() {
        return mainStack.isEmpty();
    }
}
