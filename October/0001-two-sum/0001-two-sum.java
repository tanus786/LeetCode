class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int arrayLength=nums.length;
        for(int i=0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
                if(nums[j] == target - nums[i]){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }
}