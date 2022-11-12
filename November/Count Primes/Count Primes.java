class Solution {
    public int countPrimes(int n) {
        int m =0;
        boolean prime[] = new boolean[n];
        for (int i = 0; i < n; i++)
            prime[i] = true;
        for (int p = 2; p * p < n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i < n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i] == true)
                m++;
        }
        return m;
    }
}
