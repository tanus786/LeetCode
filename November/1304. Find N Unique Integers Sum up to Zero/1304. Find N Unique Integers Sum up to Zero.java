class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n == 1) return arr;
        int sum = 0;
        for(int i= 1;i<n;i++){
            arr[i]=i;
            sum +=i;
        }
        arr[0]=-sum;
        return arr;
    }
}
