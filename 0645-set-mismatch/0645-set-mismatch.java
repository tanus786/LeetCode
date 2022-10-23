class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] intArray = new int[2];
        Arrays.sort(nums);
        int n = nums.length;
        if(nums.length==2){
            if(nums[0]==1 && nums[1]==1){
                intArray[0]=1;
                intArray[1]=2;
            }
            if(nums[0]==2 && nums[1]==2){
                intArray[0]=2;
                intArray[1]=1;
            }
        }
        if(nums.length>2){
        int sum=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                intArray[0]=nums[i];
            }
            sum+=nums[i];
        }
        sum=sum+nums[n-1];
        sum=sum-intArray[0];
        int m = n*(n+1)/2;
        intArray[1]= m-sum;
        }
        return intArray;
    }
}