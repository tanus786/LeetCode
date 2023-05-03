class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<Integer>();
        ArrayList<Integer> li2 = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i =0;i<nums1.length;i++) {
            set1.add(nums1[i]);
        }
        for (int i =0;i<nums2.length;i++) {
            set2.add(nums2[i]);
        }
        for(int i =0;i<nums1.length;i++){
            if(set2.contains(nums1[i]) == false){
                li.add(nums1[i]);
                set2.add(nums1[i]);
            }
        }
        list.add(li);
        for(int i =0;i<nums2.length;i++){
            if(set1.contains(nums2[i]) == false){
                li2.add(nums2[i]);
                set1.add(nums2[i]);
            }
        }
        list.add(li2);
        return list;

    }
}
