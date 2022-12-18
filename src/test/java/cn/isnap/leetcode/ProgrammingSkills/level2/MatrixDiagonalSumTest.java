package cn.isnap.leetcode.ProgrammingSkills.level2;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixDiagonalSumTest {
    MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();

    @Test
    public void diagonalSum() {
        Assert.assertEquals(matrixDiagonalSum.diagonalSum(
                ArrayInput.as2DArray("[[1,2,3],\n" +
                        "              [4,5,6],\n" +
                        "              [7,8,9]]")
        ), 25);

        Assert.assertEquals(matrixDiagonalSum.diagonalSum(
                ArrayInput.as2DArray("[[1,1,1,1],\n" +
                        "              [1,1,1,1],\n" +
                        "              [1,1,1,1],\n" +
                        "              [1,1,1,1]]")
        ), 8);
    }
}