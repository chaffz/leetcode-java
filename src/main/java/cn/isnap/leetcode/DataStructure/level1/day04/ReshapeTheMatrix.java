package cn.isnap.leetcode.DataStructure.level1.day04;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int origin = mat.length * mat[0].length;
        int dest = r * c;
        if (origin != dest) return mat;

        int[][] result = new int[r][c];
        int line = 0, index = 0;
        int[] lineValues = new int[c];
        for (int[] rows : mat) {
            for (int cell : rows) {
                if (index >= c) {
                    result[line] = lineValues;
                    line++;
                    index = 0;
                    lineValues = new int[c];
                }

                lineValues[index] = cell;
                index++;
            }
        }
        result[line] = lineValues;

        return result;
    }
}
