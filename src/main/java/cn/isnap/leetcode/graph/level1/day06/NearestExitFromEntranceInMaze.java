package cn.isnap.leetcode.graph.level1.day06;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0], col = cur[1], distance = cur[2];
            for (int[] dir : dirs) {
                int x = row + dir[0], y = col + dir[1];
                if (0 <= x && x < maze.length && 0 <= y && y < maze[x].length && maze[x][y] == '.') {
                    if (x == 0 || y == 0 || x == maze.length - 1 || y == maze[x].length - 1)
                        return distance + 1;
                    maze[x][y] = '+';
                    queue.offer(new int[]{x, y, distance + 1});
                }
            }
        }

        return -1;
    }
}
