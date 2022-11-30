class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int ans = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                ans = i;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(i!= ans && nums[i]*2>max)
                return -1;
        }
        return ans;
    }
}
