class Solution {
    public void sortColors(int[] nums) {
        int a[]=new int[3];
        int n =0;
        int res[]=new int[nums.length];
        for(int i=0; i<nums.length;i++){
            a[nums[i]]++;
        }
        for(int i=0; i<a[0];i++){
            nums[n]=0;
            n++;
        }
        for(int i=0; i<a[1];i++){
            nums[n]=1;
            n++;
        }
        for(int i=0; i<a[2];i++){
            nums[n]=2;
            n++;
        }
        
        
    }
}
