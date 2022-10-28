class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            if(stack.isEmpty() == false && s.charAt(i)== stack.peek() ){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String str="";
        while(stack.isEmpty()==false){
            str+=stack.pop().toString();
        }
        String ans="";
        for (int i=str.length()-1; i>=0; i--)
      {
        ans+= str.charAt(i);
    
      }
        return ans;
    }
}