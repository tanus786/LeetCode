class Solution {
    public char nextGreatestLetter(char[] L, char target) {
        for(int i = 0; i<L.length;i++){
            if(target<L[i]){
                return L[i];
            }
        }
        return L[0];
    }
}
