class Solution {
    public int maxDepth(String s) {
        int n = s.length(),ans =0, max = 0;
        for(int i= 0;i<n ; i++){
            if(s.charAt(i)=='('){
                ans++;
                max = Math.max(max, ans);
            }
            if(s.charAt(i)==')')ans--;
        }
        return max;
    }
}
