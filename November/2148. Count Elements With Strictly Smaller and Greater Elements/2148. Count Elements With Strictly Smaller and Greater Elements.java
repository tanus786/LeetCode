class Solution {
    public int countElements(int[] nums) {
        int n=0,m=0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                n = i+1;
                break;
            }
        }
        for(int j = nums.length-1;j>0;j--){
            if(nums[j]!=nums[j-1]){
                m = j;
                break;
            }
        } 
        return m - n;
    }
}
