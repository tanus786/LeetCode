class Solution {
    public static String sortByValue(HashMap<String, Integer> hm)
    { 
        // converting the hashmap into list
        List<Map.Entry<String, Integer> > list =new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        // Sorting the list According to the value
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        // putting the sorted list into temporary hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        String st ="";
        // traversing the hashmap and storing the value into strint st
       for (Map.Entry<String, Integer> en : temp.entrySet()) {
           st = st + en.getKey().repeat(en.getValue());
        }
        return st;
    }
    public String frequencySort(String s) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        String str="";
        // put the value in hashmap with their frequency
        for (int i = 0; i < s.length(); i++)
            hm.put(s.charAt(i)+"", hm.getOrDefault(s.charAt(i)+"", 0) + 1);
        str = sortByValue(hm);
        char[] try1 = str.toCharArray();
        String ans="";
        // Reverse the string as the hashmap is sorted in ascending order
        for (int i = try1.length - 1; i >= 0; i--)
            ans = ans + try1[i];
        return ans;
    }
    
}


## solution 2nd
