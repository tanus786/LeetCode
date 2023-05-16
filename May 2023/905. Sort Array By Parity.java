class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n =  nums.length,start = 0, end = nums.length-1;
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i]%2 == 0){
                arr[start]= nums[i];
                start++;
            }
            else{
                arr[end] = nums[i];
                end--;
            }
        }
    return arr;
    }
}
