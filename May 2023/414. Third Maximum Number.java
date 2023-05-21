class Solution {
    public int thirdMax(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
       Arrays.sort(nums);
       list.add(nums[0]);
       for(int i=1; i<nums.length; i++){
           if(nums[i] != nums[i-1]) list.add(nums[i]);
       }
       if(list.size() < 3)
           return list.get(list.size()-1);
       else
           return list.get(list.size()-3);
    }
}
