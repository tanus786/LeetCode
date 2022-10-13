class Solution {
    public int maxProduct(int[] nums) {
        int maxp =nums[0];
        int maxupto =1;
        for(int i =0;i<nums.length;i++){
            maxupto*=nums[i];
            if(maxupto>maxp){
                maxp=maxupto;
            }
            if(maxupto==0){
                maxupto=1;
            }
        }
        int max2=1;
        for(int  j = nums.length-1;j>=0;j--){
            max2*=nums[j];
            if(max2>maxp){
                maxp=max2;
            }
            if(max2==0){
                max2=1;
            }
        }
        
        
        
        
        return maxp;
    }
}