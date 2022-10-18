package cn.isnap.leetcode.lc75.level2.day01;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        if (matrix.length <= 0) return ret;

        spiralOrder(ret, matrix, 0, matrix[0].length - 1, 0, matrix.length - 1);
        return ret;
    }

    private void spiralOrder(List<Integer> ret, int[][] matrix, int left, int right, int top, int bottom) {
        for (int i = left; i <= right; i++) {
            ret.add(matrix[top][i]);
        }
        if ((++top) > bottom) return;

        for (int j = top; j <= bottom; j++) {
            ret.add(matrix[j][right]);
        }
        if (left > (--right)) return;

        for (int k = right; k >= left; k--) {
            ret.add(matrix[bottom][k]);
        }
        if (top > (--bottom)) return;

        for (int h = bottom; h >= top; h--) {
            ret.add(matrix[h][left]);
        }
        if ((++left) > right) return;

        spiralOrder(ret, matrix, left, right, top, bottom);
    }
}
