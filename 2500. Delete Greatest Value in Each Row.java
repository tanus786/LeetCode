class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int max = 0,maxupto=0,ans =0;
        int i1 =0,j1=0;
        int n = grid[0].length;
        for(int k = 0;k<n;k++){
            maxupto =0;
            for(int i=0 ;i<grid.length;i++){
                max = 0;
                for(int j =0;j<grid[i].length;j++){
                    if(max<grid[i][j]){
                        max = grid[i][j];
                        i1 = i;
                        j1 = j;
                    }
                    
                    }
                    grid[i1][j1]=0;
                    if(maxupto<max){
                        maxupto = max;
            }
          }
            ans+=maxupto;
        }
        return ans;
    }
}
