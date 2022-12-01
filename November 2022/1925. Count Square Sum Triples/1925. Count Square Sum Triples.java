class Solution {
    public int countTriples(int n) {
        int n1 =0;
        for(int i = 1; i < n;i++ ){
            for(int j = 1; j<n;j++){
                double c = Math.sqrt(i*i + j*j);
                if(c==(int)c && c<=n) n1++;
            }        
        }
        return n1;
    }
}
