package cn.isnap.leetcode.DataStructure.level1.day05;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][][] flags = new boolean[3][10][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int digit = board[i][j] - '0';
                int boxNum = i / 3 * 3 + j / 3;
                if (flags[0][i][digit] || flags[1][j][digit] || flags[2][boxNum][digit]) {
                    return false;
                }

                flags[0][i][digit] = true;
                flags[1][j][digit] = true;
                flags[2][boxNum][digit] = true;

            }
        }
        return true;
    }
}
