package cn.isnap.leetcode.ProgrammingSkills.level1.day07;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            int j = mat.length - i - 1;
            sum += mat[i][i];
            if (j != i) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
