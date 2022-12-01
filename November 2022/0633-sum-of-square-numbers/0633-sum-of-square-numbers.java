class Solution {
    public boolean judgeSquareSum(int c) {
        long i =0, j = (long) Math.sqrt(c);
        while(i<=j){
            if((i*i) + (j*j) == c )
                return true;
            if((i*i) + (j*j) < c )
                i++;
            if((i*i) + (j*j) > c )
                j--;
        }
        return false;
    }
}