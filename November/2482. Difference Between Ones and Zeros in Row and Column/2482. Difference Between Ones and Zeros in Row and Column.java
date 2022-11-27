class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                    if(grid[i][j]==1)
                        row[i]++;
                        
            }
        }
        int n = grid[0].length;
        int k =0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<grid.length;j++){
                    if(grid[j][i]==1)
                        col[k]++;
                        
            }k++;
        }
        int[][] res = new int[grid.length][grid[0].length];
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                res[i][j] = row[i]+col[j]-(m-row[i]) - (n-col[j]);
            }
        }
        return res;
        
    }
}
