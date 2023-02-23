package cn.isnap.leetcode.graph.level1.day06;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    public int shortestBridge(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int res = 1;
        outer:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, queue);
                    break outer;
                }
            }
        }

        int[] d = new int[]{0, 1, 0, -1, 0};
        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                int[] cur = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int x = cur[0] + d[k], y = cur[1] + d[k + 1];
                    if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == 2) continue;
                    if (grid[x][y] == 1)
                        return res;
                    grid[x][y] = 2;
                    queue.add(new int[]{x, y});
                }
            }
            res += 1;
        }

        return res;
    }

    private void dfs(int[][] grid, int x, int y, Queue<int[]> queue) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length) return;
        if (grid[x][y] == 0) {
            queue.add(new int[]{x, y});
        } else if (grid[x][y] == 1) {
            grid[x][y] = 2;
            dfs(grid, x + 1, y, queue);
            dfs(grid, x - 1, y, queue);
            dfs(grid, x, y + 1, queue);
            dfs(grid, x, y - 1, queue);
        }
    }
}
