class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0, j=0;
        int n = nums.length;
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            if(nums[i]!= val){
                k++;
                arr[j] = nums[i];
                j++;
            }
            
        }
        for(int i =0;i<n;i++){
            nums[i]= arr[i];
        }
        return k;
    }
}
