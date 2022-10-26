class Solution {
    public boolean isPalindrome(String s) {
        String str,rev="";
        str = s.replaceAll("[^a-zA-Z0-9]", "");
        str =str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }
}