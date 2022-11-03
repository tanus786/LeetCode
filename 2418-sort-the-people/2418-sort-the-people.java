class Solution {
    public String[] sortPeople(String[] names, int[] H) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] str = new String[names.length];
        int copy[] = new int[H.length];
        for (int i = 0; i < H.length; i++)
            copy[i] = H[i];
        Arrays.sort(copy);
        for(int k =0 ; k<names.length;k++){
            map.put(H[k] , names[k]);
        }
        int m=0;
        for(int j = copy.length-1;j>=0;j--){
            str[m]= map.get(copy[j]);
            m++;
        }
        
        return str;
    }
}