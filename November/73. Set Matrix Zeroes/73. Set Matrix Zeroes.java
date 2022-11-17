class Solution {
    public void setZeroes(int[][] mat) {
        boolean[][] isZero = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0)
                    isZero[i][j] = true;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (isZero[i][j]) {
                for (int i1 = 0; i1 < mat[i].length; i1++)
                    mat[i][i1] = 0;
                for (int i2 = 0; i2 < mat.length; i2++)
                    mat[i2][j] = 0;
                }
            }
        }
    }
}
