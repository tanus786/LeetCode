class Solution {
    public boolean areNumbersAscending(String s) {
        String parts[] = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<parts.length;i++){
            try {
                int Value = Integer.parseInt(parts[i]);
                arr.add(Value);
                }
            catch (NumberFormatException e) {
                continue;
                }
            }
            for(int i = 0;i<arr.size()-1;i++){
                if(arr.get(i)>=arr.get(i+1)){
                    return false;
                }
            }
            return true;
            
    }
}
