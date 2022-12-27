class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet();
        Map<Integer,Integer> map = new HashMap();
        for(int num : nums1) {
            set.add(num);
        }
        for(int num :  set) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        set.clear();
        for(int num : nums2) {
            set.add(num);
        }
        for(int num :  set) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        set.clear();
        for(int num : nums3) {
            set.add(num);
        }
            for(int num :  set) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
            List<Integer> result = new ArrayList();
            for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if(entry.getValue() > 1)
                    result.add(entry.getKey());
            }
            
            return result;
    }
}
