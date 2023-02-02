package cn.isnap.leetcode.algorithm.level2.day08;

public class SurroundedRegions {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            solve(board, i, 0);
            solve(board, i, board[0].length - 1);
        }

        for(int j = 1; j < board[0].length - 1; j++){
            solve(board, 0, j);
            solve(board, board.length - 1, j);
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'Y') board[i][j] = 'O';
                else board[i][j] = 'X';
            }
        }
    }

    private void solve(char[][] board, int x, int y) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[x].length) return;
        if (board[x][y] == 'X' || board[x][y] == 'Y') return;
        board[x][y] = 'Y';

        if (board[x][y] == 'O') {
            solve(board, x + 1, y);
            solve(board, x - 1, y);
            solve(board, x, y + 1);
            solve(board, x, y - 1);
        }
    }
}
