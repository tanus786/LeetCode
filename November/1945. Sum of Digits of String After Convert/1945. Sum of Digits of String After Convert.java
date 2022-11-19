class Solution {
    public int getLucky(String s, int k) {
        int sum =0;
        String str = "";
        for(int i=0;i<s.length();i++){
            str += String.valueOf((int)s.charAt(i)-96);
        }
        for(int j =0;j<k;j++){
            sum =0;
            for(int i=0;i<str.length();i++){
                sum += Character.getNumericValue(str.charAt(i));
            }
            str = String.valueOf(sum);   
        }
        return sum;
    }
}
