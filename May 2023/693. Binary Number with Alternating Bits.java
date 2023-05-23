class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin = Integer.toBinaryString(n);
        int len = bin.length();
        int j = len-1;
        for(int i = 0;i<len;i++){
            if(i%2 == 0){
                if(bin.charAt(i)!='1')
                    return false;
            }
            else{
                if(bin.charAt(i)!='0')
                    return false;
            }
        }
        return true;
    }
}
