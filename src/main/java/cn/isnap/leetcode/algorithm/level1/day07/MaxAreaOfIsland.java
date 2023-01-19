package cn.isnap.leetcode.algorithm.level1.day07;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1)
                    max = Math.max(maxAreaOfIsland(grid, i, j, 0), max);
            }
        }
        return max;
    }

    public int maxAreaOfIsland(int[][] grid, int x, int y, int max) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length)
            return max;

        if (grid[x][y] != 1)
            return max;

        grid[x][y] = 2;
        max++;
        max = Math.max(maxAreaOfIsland(grid, x + 1, y, max), max);
        max = Math.max(maxAreaOfIsland(grid, x - 1, y, max), max);
        max = Math.max(maxAreaOfIsland(grid, x, y + 1, max), max);
        max = Math.max(maxAreaOfIsland(grid, x, y - 1, max), max);
        return max;
    }
}
