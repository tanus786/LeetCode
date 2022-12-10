class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> arr= new ArrayList<Integer>();
        for(char ch : p.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int WindowStart = 0, match = 0;
        for(int WindowEnd = 0; WindowEnd<s.length();WindowEnd++){
            char CurrChar = s.charAt(WindowEnd);
            if(map.containsKey(CurrChar)){
                map.put(CurrChar,map.get(CurrChar)-1);
                if(map.get(CurrChar) == 0)
                    match++;
            }
            if(match == map.size()){
                int a = WindowEnd -(p.length()-1);
                arr.add(a);
            }
                
            if(WindowEnd >= p.length()-1){
                char left = s.charAt(WindowStart);
                WindowStart++;
                if(map.containsKey(left)){
                    if(map.get(left)==0)    
                        match--;
                    map.put(left , map.get(left)+1);
                }
            }
        }
        return arr;
}
}
