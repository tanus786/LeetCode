class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res[]= new int[n];
        int j =n-1;
        for(int i =1 ;i<n;i=i+2){
            res[i]=nums[j--];
        }
        for(int i =0 ;i<n;i=i+2){
            res[i]=nums[j--];
        }
        for(int i = 0;i<n;i++){
            nums[i]=res[i];
        }
        
    }
}
