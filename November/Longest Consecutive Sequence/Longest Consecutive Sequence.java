class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i + 1])
                temp[j++] = nums[i];
        }
        temp[j++] = nums[nums.length - 1];
        int max = 1, count = 1;
        for(int i =1 ; i< temp.length;i++){
            if(temp[i-1]+1==temp[i]){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
