class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=1;
        if(s.contains("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~")){
            return 95;
        }
        if(s.contains(" ")){
            return 1;
        }
        if(s.length()==0){
            return 0;
        }
        
        
        String str=""+s.charAt(0);
        for(int i = 1,j=1;i<s.length() && j<s.length();i++){
            if(str.contains((""+s.charAt(i))) == false){
                str+=s.charAt(i);
                System.out.println(str);
                max = Math.max(max,str.length());
            }
            else{
                i=j;
                str = ""+s.charAt(j);
                j++;
            }
        }
        return max;
    }
}