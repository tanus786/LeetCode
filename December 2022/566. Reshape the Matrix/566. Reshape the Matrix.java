class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c) return mat;
        int[][] ans = new int[r][c];
        int n = 0, m = 0;
        int x = mat.length;
        for(int i = 0;i<x;i++){
            for(int j = 0; j < mat[i].length;j++ ){
                ans[n][m] = mat[i][j];
                m++;
                if(m >= c){
                    m = 0;
                    n++;
                }
            }
        } 
        return ans;
    }
}
