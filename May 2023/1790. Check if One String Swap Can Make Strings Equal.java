class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] a = new char[6]; 
        int count = 0, j =0;
        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                a[j]=s1.charAt(i);
                j++;
                a[j]= s2.charAt(i);
                j++;
            }
            if(count >=3){
                break;
            }
                
        }
        if(count==2 || count == 0){
            if(a[0]==a[3] && a[1]==a[2]){
                return true;
            }
            else{
                return false;
            }
        }
        else
            return false;
    }
}
