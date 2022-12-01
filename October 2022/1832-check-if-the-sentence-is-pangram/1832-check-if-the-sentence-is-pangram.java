class Solution {
    public boolean checkIfPangram(String sentence) {
        char tempArray[] = sentence.toCharArray();
        Arrays.sort(tempArray);
        String string = new String(tempArray);
        int n = 97;
        for(int i=0;i<string.length();i++){
            if((int)string.charAt(i) == n){
                n++;
               
            }
        }
        if(n==123){
            return true;
        }
        else {
            return false;
        }
    }
}