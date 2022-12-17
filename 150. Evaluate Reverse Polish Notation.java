class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int n1= tokens.length; 
        for(int i = 0 ;i<n1;i++){
            if(tokens[i].equals("+")){
                int n = stack.pop();
                int m = stack.pop();
                stack.push(n+m);
            }
            else if(tokens[i].equals("*")){
                int n = stack.pop();
                int m = stack.pop();
                stack.push(n*m);
            }
            else if(tokens[i].equals("/")){
                int n = stack.pop();
                int m = stack.pop();
                stack.push(m/n);
            }
            else if(tokens[i].equals("-")){
                int n = stack.pop();
                int m = stack.pop();
                stack.push(m-n);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();


    }

}
