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



## solution 2nd

class MyStack {
    Queue<Integer> realQueue = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        while(!realQueue.isEmpty())
        {
            temp.add(realQueue.remove());
        }
        realQueue.add(x);
        while(!temp.isEmpty())
        {
          realQueue.add(temp.remove());  
        }
    }
    
    public int pop() {
        return realQueue.remove();
    }
    
    public int top() {
        return realQueue.peek();
    }
    
    public boolean empty() {
        return realQueue.isEmpty();
    }
}
