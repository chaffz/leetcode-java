package cn.isnap.leetcode.lc75.level1.day09;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    blood(grid, i, j, grid.length, grid[i].length);
                }
            }
        }

        return count;
    }

    private void blood(char[][] grid, int x, int y, int w, int h) {
        if (x < 0 || x >= w || y < 0 || y >= h)
            return;

        if (grid[x][y] == '1') {
            grid[x][y] = '2';
            blood(grid, x - 1, y, w, h);
            blood(grid, x + 1, y, w, h);
            blood(grid, x, y - 1, w, h);
            blood(grid, x, y + 1, w, h);
        }
    }
}
