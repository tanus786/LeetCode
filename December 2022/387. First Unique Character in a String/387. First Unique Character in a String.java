class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        int res = -1;
        int len = s.length();
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, -1);
            }
            else{
                map.put(c, i);
            }
        }
        for (Integer v : map.values()){
            if (res == -1 || (v < res && v!=-1)){
                res = v;
            }
        }
        return res;
    }
}
