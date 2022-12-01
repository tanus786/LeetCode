class Solution {
    public int minMaxGame(int[] nums) {
        int count = 0;
        int k =0;
        int n = 2*nums.length;
        for(int i =0;i<(int)(Math.ceil((Math.log(nums.length) / Math.log(2))));i++){
            k =0;
            n = n/2;
            for(int j = 0;j<n;j=j+2){
                if(count == 0){
                    count = 1;
                    if(nums[j]<nums[j+1]){
                        nums[k]=nums[j];
                    }
                    else{
                        nums[k]=nums[j+1];
                    }
                    k++;
                }
                else{
                    count =0;
                    if(nums[j]>nums[j+1]){
                        nums[k]=nums[j];
                    }
                    else{
                        nums[k]=nums[j+1];
                    }
                    k++;
                }
            }
        }
        return nums[0];
    }
}
