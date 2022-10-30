class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int a = Integer.parseInt(String.valueOf(event1[0].charAt(0)));
        int b = Integer.parseInt(String.valueOf(event1[0].charAt(1)));
        int c = Integer.parseInt(String.valueOf(event1[0].charAt(3)));
        int d = Integer.parseInt(String.valueOf(event1[0].charAt(4)));
        
        int e = Integer.parseInt(String.valueOf(event1[1].charAt(0)));
        int f = Integer.parseInt(String.valueOf(event1[1].charAt(1)));
        int g = Integer.parseInt(String.valueOf(event1[1].charAt(3)));
        int h = Integer.parseInt(String.valueOf(event1[1].charAt(4)));
        
        int i = (a*1000) +(b*100)+(c*10)+d;
        int j = (e*1000) +(f*100)+(g*10)+h;
        
        int k = Integer.parseInt(String.valueOf(event2[0].charAt(0)));
        int l = Integer.parseInt(String.valueOf(event2[0].charAt(1)));
        int m = Integer.parseInt(String.valueOf(event2[0].charAt(3)));
        int n = Integer.parseInt(String.valueOf(event2[0].charAt(4)));
        
        int p = Integer.parseInt(String.valueOf(event2[1].charAt(0)));
        int q = Integer.parseInt(String.valueOf(event2[1].charAt(1)));
        int r = Integer.parseInt(String.valueOf(event2[1].charAt(3)));
        int s = Integer.parseInt(String.valueOf(event2[1].charAt(4)));
        
        int o = (k*1000) +(l*100)+(m*10)+n;
        int t = (p*1000) +(q*100)+(r*10)+s;
        
        if((o<=j && o>=i) || ( t<=j && t>=i) || j<=o && i>=o || j<=t && i>=t || i>=o && i<=t || j>=o && j<=t){
            return true;
        }
        return false; 
    }
}