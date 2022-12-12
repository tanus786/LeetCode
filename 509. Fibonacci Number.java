class Solution {
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int n1 = 0, m=1,j=0;
        for(int i = 2;i<=n;i++){
            j = n1+m;
            n1 = m;
            m = j;
        }
        return j;
    }
}
