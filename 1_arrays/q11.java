class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                matrix[i][j] = matrix[i][j] + matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] = matrix[i][j] - matrix[j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = matrix[i][j] - matrix[i][matrix.length - j - 1];
                matrix[i][j] = matrix[i][j] - matrix[i][matrix.length - j - 1];
            }
        }
    }
}