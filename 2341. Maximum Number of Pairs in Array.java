class Solution {
    public int[] numberOfPairs(int[] nums) {
       int[] arr = new int[2];
       Arrays.sort(nums);
       for(int i =0;i<nums.length-1;i++ ){
           if(nums[i] == nums[i+1]){
               arr[0]++;
               i++;
           }
       } 
       arr[1]= nums.length - 2*arr[0];
       return arr;
    }
}
