class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr1[] = new int[nums.length];
        int j =0;
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> piv = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr1[j]=nums[i];
                j++;
            }
            else if(nums[i]>pivot){
                arr2.add(nums[i]);
            }
            else{
                piv.add(nums[i]);
            }
        }
        for(int i = 0;i<piv.size();i++){
            arr1[j]= piv.get(i);
            j++;
        }
        for(int i = 0;i<arr2.size();i++){
            arr1[j]= arr2.get(i);
            j++;
        }
        return arr1;
    }
}
