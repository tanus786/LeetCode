class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int max = 0;
        for (int n: nums) {
            if (count == 0) 
            max = n;
            if (n == max) 
                count++;
            else 
                count--;
        }
        return max;
    }
}
