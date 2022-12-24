class Solution {
    public String sortSentence(String s) {
        String[] str = new String[9];
        String parts[] = s.split(" ");
        for(int i = 0 ;i<parts.length;i++){
            int n = parts[i].charAt(parts[i].length()-1) - '0';
            str[n-1]= parts[i].substring(0,parts[i].length()-1);
        }
        String str1 = str[0];
        for(int i = 1 ;i<parts.length;i++){
            str1+=" "+str[i];
        }
        return str1;
    }
}
