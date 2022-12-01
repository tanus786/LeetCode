class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}