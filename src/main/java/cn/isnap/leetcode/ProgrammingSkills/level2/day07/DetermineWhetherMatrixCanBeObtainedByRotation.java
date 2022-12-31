package cn.isnap.leetcode.ProgrammingSkills.level2.day07;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                swap(matrix, i, j, i, matrix.length - 1 - j);
            }
        }
    }

    private void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
        int t = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = t;
    }
}
