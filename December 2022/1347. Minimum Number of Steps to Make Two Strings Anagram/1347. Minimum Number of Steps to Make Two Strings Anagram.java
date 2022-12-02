class Solution {
    public int minSteps(String s, String t) {
        int ans=0;
        int[] arr1 = new int[26], arr2 = new int[26];
        for (char ch : s.toCharArray())
            arr1[ch - 'a']++;
        for (char ch : t.toCharArray())
            arr2[ch - 'a']++;
        for (int i = 0; i < 26; i++) {
            if(arr1[i]<arr2[i]){
                continue;
            }
            if(arr1[i]>arr2[i])
                ans+=arr1[i]-arr2[i];
            }
            return ans;
    }
}
