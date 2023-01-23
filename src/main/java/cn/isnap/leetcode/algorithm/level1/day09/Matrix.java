package cn.isnap.leetcode.algorithm.level1.day09;

public class Matrix {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0) continue;
                distance(result, mat, i, j, 0);
            }
        }
        return result;
    }

    private void distance(int[][] result, int[][] mat, int x, int y, int distance) {
        if (x < 0 || y < 0 || x >= mat.length || y >= mat[x].length)
            return;

        if (distance == 0 || mat[x][y] == 1 && (result[x][y] == 0 || result[x][y] > distance)) {
            result[x][y] = distance;
            final int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
            for (int[] dir : dirs) {
                distance(result, mat, x + dir[0], y + dir[1], distance + 1);
            }
        }
    }
}
