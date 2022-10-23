class Solution {
    static int gcd(int a, int b)
    {
    if (b == 0)
        return a;
    return gcd(b, a % b);    
    }
    public int subarrayGCD(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++)
    {
            int curr_gcd = 0;
            
            for (int j = i; j < nums.length; j++)
        {
            curr_gcd = gcd(curr_gcd, nums[j]);
            ans += (curr_gcd == k) ? 1 : 0;
        }
    }
        return ans;
        
    }
}