import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seenSet = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seenSet.add(b + i) || !seenSet.add(j + b) || !seenSet.add(i / 3 + b + j / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
