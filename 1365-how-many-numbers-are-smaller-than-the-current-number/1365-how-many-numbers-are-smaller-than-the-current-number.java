class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int Arr[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            } Arr[i]=count;
            count=0;
        }
        return Arr;
    }
}