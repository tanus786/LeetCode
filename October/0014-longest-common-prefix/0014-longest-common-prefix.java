class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                str+=strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        
        return str;
    }
}