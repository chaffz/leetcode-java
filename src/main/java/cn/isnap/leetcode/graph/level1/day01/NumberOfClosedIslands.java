package cn.isnap.leetcode.graph.level1.day01;

public class NumberOfClosedIslands {
    public int closedIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0 && dfs(grid, i, j, true)) {
                    res++;
                }
            }
        }

        return res;
    }

    private boolean dfs(int[][] grid, int i, int j, boolean res) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) return false;
        if (grid[i][j] != 0) return res;
        grid[i][j] = 2;

        res &= dfs(grid, i + 1, j, res);
        res &= dfs(grid, i - 1, j, res);
        res &= dfs(grid, i, j + 1, res);
        res &= dfs(grid, i, j - 1, res);
        return res;
    }
}
