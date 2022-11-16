class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int res=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           if(min > Math.abs(nums[i])){
               res = nums[i];
               min = Math.abs(nums[i]);
           }
           else if(min == Math.abs(nums[i]) ){
               res= Math.max(res,nums[i]);
           }
       } 
       return res;
    }
}
