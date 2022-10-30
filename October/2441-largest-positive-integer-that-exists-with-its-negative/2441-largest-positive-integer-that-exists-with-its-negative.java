class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<nums.length;j++){
                if(nums[i] == -(nums[j])){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}