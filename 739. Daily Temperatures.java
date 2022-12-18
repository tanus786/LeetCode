class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && T[i] > T[stack.peek()]){
                int index = stack.pop();
                arr[index] = i - index;
            }
            stack.push(i);
        }
        return arr;
    }
}
