package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PathWithMaximumGold {
  public int getMaximumGold(int[][] grid) {
    int max = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        max = Math.max(max, getMaximumGold(visited, grid, i, j, 0));
      }
    }
    return max;
  }

  private int getMaximumGold(boolean[][] visited, int[][] grid, int x, int y, int max) {
    if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == 0 || visited[x][y]) {
      return max;
    }

    visited[x][y] = true;
    int tmp = 0;
    tmp = Math.max(tmp, getMaximumGold(visited, grid, x + 1, y, max + grid[x][y]));
    tmp = Math.max(tmp, getMaximumGold(visited, grid, x - 1, y, max + grid[x][y]));
    tmp = Math.max(tmp, getMaximumGold(visited, grid, x, y + 1, max + grid[x][y]));
    tmp = Math.max(tmp, getMaximumGold(visited, grid, x, y - 1, max + grid[x][y]));
    visited[x][y] = false;

    return tmp;
  }
}
