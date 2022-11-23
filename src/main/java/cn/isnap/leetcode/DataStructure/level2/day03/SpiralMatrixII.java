package cn.isnap.leetcode.DataStructure.level2.day03;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        fillRectangle(result, 0, n - 1, 1);
        return result;
    }

    private void fillRectangle(int[][] result, int topLeft, int bottomRight, int value) {
        if (topLeft > bottomRight) return;

        for (int i = topLeft; i <= bottomRight; i++) {
            result[topLeft][i] = value++;
        }

        for (int i = topLeft + 1; i <= bottomRight; i++) {
            result[i][bottomRight] = value++;
        }

        for (int i = bottomRight - 1; i >= topLeft; i--) {
            result[bottomRight][i] = value++;
        }

        for (int i = bottomRight - 1; i > topLeft; i--) {
            result[i][topLeft] = value++;
        }

        fillRectangle(result, topLeft + 1, bottomRight - 1, value);
    }
}
