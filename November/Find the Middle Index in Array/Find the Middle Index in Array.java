class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
            sum+=nums[i];
        for(int i =0;i<n;leftsum+=nums[i++]){
            if(leftsum*2 == sum - nums[i]){
                return i;
            }
        }
        return -1;
    }
}
