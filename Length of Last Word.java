class Solution {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        int x = trim.lastIndexOf(' ') + 1;
        return trim.length() - x;
    }
}
