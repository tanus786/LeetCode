class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> hm = new HashMap<>();
        for (String s : words) {
            hm.put(s, hm.containsKey(s) ? hm.get(s) + 1 : 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey()));
        List<String> ans=new ArrayList();
        for(Map.Entry<String,Integer> entry:list){
            ans.add(entry.getKey());
        }
       return ans.subList(0,k);
    }
}
