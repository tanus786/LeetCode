class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int WindowStart = 0, match = 0;
        for(int WindowEnd = 0; WindowEnd<s2.length();WindowEnd++){
            char CurrChar = s2.charAt(WindowEnd);
            if(map.containsKey(CurrChar)){
                map.put(CurrChar,map.get(CurrChar)-1);
                if(map.get(CurrChar) == 0)
                    match++;
            }
            
            if(match == map.size())
                return true;
            if(WindowEnd >= s1.length()-1){
                char left = s2.charAt(WindowStart);
                WindowStart++;
                if(map.containsKey(left)){
                    if(map.get(left)==0)    
                        match--;
                    map.put(left , map.get(left)+1);
                }
            }
        }
        return false;
    }
}
