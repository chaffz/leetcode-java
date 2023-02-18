package cn.isnap.leetcode.graph.level1.day02;

public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int res = 0;
        int N = grid.length;
        int M = grid[0].length;
        for (int i = 0; i < N; i++) {
            if (grid[i][0] == 1) blood(grid, i, 0);
            if (grid[i][M - 1] == 1) blood(grid, i, M - 1);
        }

        for (int i = 0; i < M; i++) {
            if (grid[0][i] == 1) blood(grid, 0, i);
            if (grid[N - 1][i] == 1) blood(grid, N - 1, i);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 1) {
                    res++;
                }
            }
        }

        return res;
    }

    private void blood(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) return;
        if (grid[i][j] == 0) return;
        grid[i][j] = 0;
        blood(grid, i + 1, j);
        blood(grid, i - 1, j);
        blood(grid, i, j + 1);
        blood(grid, i, j - 1);
    }
}
