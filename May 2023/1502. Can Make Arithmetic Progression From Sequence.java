class Solution {
    public boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);
        int dif = nums[1]-nums[0];
        for(int i =0;i<nums.length-1;i++){
            if(nums [i+1] - nums[i] == dif){
                continue;
            }
            else{
                return false;
            }

        }
        return true;
    }
}
