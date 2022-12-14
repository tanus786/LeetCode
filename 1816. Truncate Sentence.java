class Solution {
    public String truncateSentence(String s, int k) {
        String parts[] = s.split(" ");
        String str = "";
        for(int  i = 0;i<k-1;i++) {
            str += parts[i];
            str+= " ";
        }
        str += parts[k-1];
        return str;
    }
}
