class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0, maxupto = Integer.MIN_VALUE, min = 0, minupto = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            max += nums[i];
            if(maxupto < max){
                maxupto = max;
            }
            if(max<0){
                max = 0;
            }
        }
        for(int i = 0;i<nums.length;i++){
            min += nums[i];
            if(min<minupto){
                minupto = min;
            }
            if(min>0){
                min = 0;
            }
        }
        return Math.max(maxupto, Math.abs(minupto));
    }
}
