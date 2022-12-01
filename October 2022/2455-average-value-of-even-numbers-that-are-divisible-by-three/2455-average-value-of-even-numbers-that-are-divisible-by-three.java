class Solution {
    public int averageValue(int[] nums) {
        int n=0;
        int sum=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%3==0 && nums[i]%2==0){
                sum+=nums[i];
                n++;
            }
        }
        if(n==0){
            return 0;
        }
        else{
        return Math.round(sum/n);
        }
    }
}