class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String result = "";
        for(int i = str.length-1 ; i>0 ;i--){
            result = result + str[i]+" ";  
        }
        result = result+ str[0]; 
        return result;
    }
}
