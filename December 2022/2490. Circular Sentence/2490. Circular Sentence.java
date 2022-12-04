class Solution {
    public boolean isCircularSentence(String str) {
        String[] arr = str.split(" ");
        for(int i =0;i<arr.length;i++){
            if(i==arr.length-1){
                if(arr[i].charAt(arr[i].length()-1)!= arr[0].charAt(0)){
                    return false;
                }
            }
            else{
                if(arr[i].charAt(arr[i].length()-1)!= arr[i+1].charAt(0)){
                    return false;
                }
            }
        }
        return true;
    }
}
