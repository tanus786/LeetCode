class Solution {
    public long dividePlayers(int[] skills) {
        int n = skills.length;
        Arrays.sort(skills);
        int sum = skills[0]+skills[n-1];
        long ans = skills[0]*skills[n-1];
        for(int i =1, j = n-2;i<n/2;i++,j--){
            if(skills[i]+skills[j] != sum){
                return -1;
            }
            else{
                ans +=skills[i]*skills[j];
            }
        }
        return ans;
    }
}
