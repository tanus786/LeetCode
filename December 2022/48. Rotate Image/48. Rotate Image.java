class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length ;
        int[][] arr = new int[n][n];
        int m =n-1;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[j][m] = matrix[i][j]; 
            }
            m--;
        }
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        } 
    }
}
