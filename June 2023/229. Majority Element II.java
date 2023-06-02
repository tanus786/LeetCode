class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> list=new ArrayList<Integer>();
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(); 
       int n = nums.length;
       for(int i = 0;i<n;i++){
           map.put(nums[i], map.containsKey(nums[i]) ? map.get(nums[i]) + 1 : 1);
           if(map.get(nums[i])>n/3 && !list.contains(nums[i]))
                  list.add(nums[i]);
       }
        return list;
    }
}
