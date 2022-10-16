class Solution {
    public int countTime(String str) {
        int n=1,m=1,j=1,l=1;
        if(str.charAt(1)!='?'){
        if(Integer.parseInt(String.valueOf(str.charAt(1)))>=4 && str.charAt(0) =='?'){
            n=2;
        }
        }
        if(str.charAt(0)== '1' && str.charAt(1)=='?'){
            m=10;
        }
        if(str.charAt(0)== '0' && str.charAt(1)=='?'){
            m=10;
        }
        if(str.charAt(1)!='?'){
            
           if(str.charAt(0) =='?' && Integer.parseInt(String.valueOf(str.charAt(1)))<4){
            n=3;
        }
         
        }
        if(str.charAt(0)!='?'){
        if(str.charAt(1)=='?' && Integer.parseInt(String.valueOf(str.charAt(0)))==2 ){
            m=4;
        }
            }
        if(str.charAt(0)=='?' && str.charAt(1)=='?'){
            n=2;
            m=12;
        }
        if(str.charAt(3)=='?' ){
            j=6;
        }
        if(str.charAt(4)=='?'){
            l=10;
        }
        return n*m*j*l;
        
       
        
    }
}