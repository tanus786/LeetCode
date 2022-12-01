class Solution {
        public boolean isFound(int[] nums,int original){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original)
                return true;
        }
        return false;
    }
    
    public int findFinalValue(int[] nums, int original) {
        while(true){
            if(isFound(nums,original))
                original=original*2;
            else
                return original;
        }
    }
}
