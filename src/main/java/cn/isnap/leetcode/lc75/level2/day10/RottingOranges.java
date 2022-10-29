package cn.isnap.leetcode.lc75.level2.day10;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    orangesRotting(grid, i, j, grid[i].length, grid.length, 2);
                }
            }
        }

        int minutes = 2;
        for (int[] rows : grid) {
            for (int cell : rows) {
                if (cell == 1)
                    return -1;
                minutes = Math.max(minutes, cell);
            }
        }

        return minutes - 2;
    }

    private void orangesRotting(int[][] grid, int x, int y, int w, int h, int minutes) {
        if (x < 0 || y < 0 || x >= h || y >= w) return;
        if (grid[x][y] == 0) return;
        if (1 < grid[x][y] && grid[x][y] < minutes) return;

        grid[x][y] = minutes;
        orangesRotting(grid, x - 1, y, w, h, minutes + 1);
        orangesRotting(grid, x + 1, y, w, h, minutes + 1);
        orangesRotting(grid, x, y - 1, w, h, minutes + 1);
        orangesRotting(grid, x, y + 1, w, h, minutes + 1);
    }
}
