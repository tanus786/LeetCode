class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
