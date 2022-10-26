class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0, j= nums.length-1;
        int[] A = new int[2];
        while(i<j){
            int k = nums[i]+nums[j];
            if(k<target){
                i++;
            }
            else if(k>target){
                j--;
            }
            else{
                A[0]=i+1;
                A[1]=j+1;
                return A;
            }
        }
        return A;
    }
}