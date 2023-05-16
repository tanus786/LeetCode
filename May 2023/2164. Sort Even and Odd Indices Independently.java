class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int even[]= new int[n/2+1];
        int odd[]= new int[n/2];
        int ans[]= new int[n];
        int j = 0, k= 0;
        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                even[j]=nums[i];
                j++;
            }else{
                odd[k]=nums[i];
                k++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        k= n/2-1;
        if(n%2 ==0){
            j=1;
        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                ans[i]=even[j];
                j++;
            }else{
                ans[i]= odd[k];
                k--; 
            }

        }
        }
        else{
            j=0;
        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                ans[i]=even[j];
                j++;
            }else{
                ans[i]= odd[k];
                k--; 
            }

        }

        }
        return ans;
    }
}
