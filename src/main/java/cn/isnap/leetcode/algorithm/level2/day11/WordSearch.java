package cn.isnap.leetcode.algorithm.level2.day11;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (exist(board, i, j, chars, 0, used)) return true;
            }
        }

        return false;
    }

    private boolean exist(char[][] board, int i, int j, char[] chars, int offset, boolean[][] used) {
        if (offset == chars.length) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length) return false;
        if (used[i][j]) return false;
        if (board[i][j] != chars[offset]) return false;

        used[i][j] = true;
        boolean res = false;
        res  |= exist(board, i + 1, j, chars, offset + 1, used);
        res  |= exist(board, i - 1, j, chars, offset + 1, used);
        res  |= exist(board, i, j + 1, chars, offset + 1, used);
        res  |= exist(board, i, j - 1, chars, offset + 1, used);
        used[i][j] = false;
        return res;
    }
}
