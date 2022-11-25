class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        for(int i =0;i<s.length();i++){
            arr[(int)s.charAt(i) - 97]++;
        }
        Arrays.sort(arr);
        int a = arr[arr.length-1];
        for(int i =1;i<26;i++){
            if(arr[i]==0){
                continue;
            }
            else if(arr[i]!=a){
                return false;
            }
        }
        return true;
        
    }
}

## solution 2nd


HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        
        int a=map.get(s.charAt(0));
        for(Character i:map.keySet()){
            if(map.get(i)!=a){
                return false;
            }
        }
        return true;
