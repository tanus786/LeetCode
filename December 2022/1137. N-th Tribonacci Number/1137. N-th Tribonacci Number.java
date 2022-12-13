class Solution {
    public int tribonacci(int n) {
        int m = 0, l = 1,k=1,j=0;
        if(n == 0)
            return m;
        if(n == 1 || n ==2)
            return k;
        for(int i = 3;i<=n;i++){
            j = m +l+k;
            m = l;
            l = k;
            k = j;
        }
        return j;
    }
}
