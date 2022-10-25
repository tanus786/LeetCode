class Solution {
    public int trap(int[] height) {
        
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        int maxr= right[height.length-1];
        int maxl=left[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>left[i-1]){
                left[i]=height[i];
                maxl=height[i];
            }
            else{
                left[i]=maxl;
            }
        }
        for(int j = height.length-2;j>=0;j--){
            if(height[j]>right[j+1]){
                right[j]=height[j];
                maxr=height[j];
            }
            else{
                right[j]=maxr;
            }
        }
        
        int ans=0;
        for(int k=0;k<height.length;k++){
            ans +=(Math.min(left[k], right[k]))-height[k];
        }
        return ans;
        
    }
}