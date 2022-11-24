class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==0 || nums.length ==0) return new int[0];
        int[] res = new int[nums.length-k+1];
        for(int i=0, j = i+k;i<=nums.length-k;i++,j++){
            int max = nums[i];
            for(int k1 = i;k1<i+k;k1++){
                if(nums[k1]>max)
                    max = nums[k1];
            }
            res[i]=max;
        }
        return res;
    }
}
