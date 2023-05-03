class Solution {
    public int arraySign(int[] nums) {
        double product =1;
        for(int i = 0;i< nums.length ;i++){
            product *= nums[i];
        }
        if(product > 0)
            return 1;
        else if(product < 0)
            return -1;
        else
            return 0;
    }
}
