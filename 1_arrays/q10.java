import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> soln = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int size = m * n;
        int count = 1;
        int[] limits = { 0, m - 1, 0, n - 1 };

        if (n == 1) {
            for (int i = 0; i < m; i++) {
                soln.add(matrix[i][0]);
            }
            return soln;
        }

        int i = 0;
        int j = 0;

        soln.add(matrix[0][0]);
        while (count < size) {
            if (i == limits[0] + 1 && j == limits[2]) {
                limits[0]++;
                limits[2]++;
                limits[1]--;
                limits[3]--;
                j += 1;
                if (i < m && j < n) {
                    soln.add(matrix[i][j]);
                    count++;
                }
            } else {
                if (i == limits[0] && j < limits[3]) {
                    j += 1;
                    soln.add(matrix[i][j]);
                } else if (i < limits[1] && j == limits[3]) {
                    i += 1;
                    soln.add(matrix[i][j]);
                } else if (i == limits[1] && j > limits[2]) {
                    j -= 1;
                    soln.add(matrix[i][j]);
                } else if (i > limits[0] && j == limits[2]) {
                    i -= 1;
                    soln.add(matrix[i][j]);
                }
                count++;
            }
        }
        return soln;
    }
}