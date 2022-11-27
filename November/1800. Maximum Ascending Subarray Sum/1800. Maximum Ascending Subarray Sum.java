class Solution {
    public int maxAscendingSum(int[] nums) {
        int max =nums[0];
        int maxupto =nums[0];
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                max+=nums[i+1];
                if(maxupto<max){
                maxupto=max;
            }
            }
            else{
                max =nums[i+1];
            }
            
        }
        return maxupto;
    }
}
