class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0, ans2 =0;
        int res =0, res2=0;
        for(int j = 0;j<strs.length;j++){
            int count =0;
            ans =0;
            for(int i = 0;i<strs[j].length();i++){
            Boolean flag = Character.isDigit(strs[j].charAt(i));
            if(flag){
                int a = strs[j].charAt(i) - '0';
                ans = ans*10 + a;
                
            }
            else{
                ans2 = strs[j].length();
                count =1;
                break;
            }
        }
            if(count == 1){
                res = Math.max(res,ans2);
            }
            else{
                res2 = Math.max(res2, ans);
            }
            
        }
        return Math.max(res,res2);
    }
}
