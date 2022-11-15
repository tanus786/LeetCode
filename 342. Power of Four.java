class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0 || n % 2 != 0) return false;
        double d = n/4.0;
        if (d % 1 != 0) return false;
        return isPowerOfFour((int)d);

    }
}
