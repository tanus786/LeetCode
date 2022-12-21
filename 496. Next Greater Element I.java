class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int j=0;
        int grt;
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                grt=j+1;
                while(grt<nums2.length){
                    if(nums2[grt]>nums2[j]){
                        ans[i]=nums2[grt];
                        grt=nums2.length;
                        j=nums2.length;
                    }
                    else ans[i]=-1;
                     grt++;
                }
            }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
}
