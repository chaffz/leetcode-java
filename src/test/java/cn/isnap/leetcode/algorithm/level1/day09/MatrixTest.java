package cn.isnap.leetcode.algorithm.level1.day09;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixTest {
    Matrix matrix = new Matrix();

    @Test
    public void updateMatrix() {
        int[][] mat = ArrayInput.as2DArray("[[0,0,0],[0,1,0],[1,1,1]]");
        mat = matrix.updateMatrix(mat);
        Assert.assertTrue(Arrays.deepEquals(mat, ArrayInput.as2DArray("[[0,0,0],[0,1,0],[1,2,1]]")));
    }
}