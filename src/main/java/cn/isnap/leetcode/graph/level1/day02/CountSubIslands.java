package cn.isnap.leetcode.graph.level1.day02;

public class CountSubIslands {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int[] val = new int[]{0};
        int res = 0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                if (grid2[i][j] == 1) {
                    val[0] = 1;
                    dfs(grid1, grid2, val, i, j);
                    res += val[0];
                }
            }
        }
        return res;
    }

    private void dfs(int[][] grid1, int[][] grid2, int[] val, int i, int j) {
        if (i < 0 || j < 0 || i >= grid1.length || j >= grid1[i].length || grid2[i][j] == 0) return;
        grid2[i][j] = 0;
        if (grid1[i][j] == 0) val[0] = 0;
        dfs(grid1, grid2, val, i + 1, j);
        dfs(grid1, grid2, val, i - 1, j);
        dfs(grid1, grid2, val, i, j + 1);
        dfs(grid1, grid2, val, i, j - 1);
    }
}
