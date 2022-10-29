package cn.isnap.leetcode.lc75.level2.day10;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    int[][] directs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return res;
        }
        int h = heights.length, w = heights[0].length;
        boolean[][] pacific = new boolean[h][w];
        boolean[][] atlantic = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            dfs(heights, pacific, Integer.MIN_VALUE, i, 0, h, w);
            dfs(heights, atlantic, Integer.MIN_VALUE, i, w - 1, h, w);
        }
        for (int i = 0; i < w; i++) {
            dfs(heights, pacific, Integer.MIN_VALUE, 0, i, h, w);
            dfs(heights, atlantic, Integer.MIN_VALUE, h - 1, i, h, w);
        }
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> grid = new ArrayList<>();
                    grid.add(i);
                    grid.add(j);
                    res.add(grid);
                }
        return res;
    }

    public void dfs(int[][] heights, boolean[][] visited, int height, int x, int y, int h, int w) {
        if (x < 0 || x >= h || y < 0 || y >= w
                || visited[x][y] || heights[x][y] < height) {
            return;
        }

        visited[x][y] = true;
        for (int[] d : directs) {
            dfs(heights, visited, heights[x][y], x + d[0], y + d[1], h, w);
        }
    }
}
