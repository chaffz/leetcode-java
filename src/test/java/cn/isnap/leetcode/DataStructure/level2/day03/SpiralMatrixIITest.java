package cn.isnap.leetcode.DataStructure.level2.day03;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SpiralMatrixIITest {

    @Test
    public void generateMatrix() {
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
        Assert.assertTrue(Arrays.deepEquals(spiralMatrixII.generateMatrix(3),
                ArrayInput.as2DArray("[[1,2,3],[8,9,4],[7,6,5]]")));
        /**
         * 1    2   3   4
         * 12   13  14  5
         * 11   16  15  6
         * 10   9   8   7
         */
        Assert.assertTrue(Arrays.deepEquals(spiralMatrixII.generateMatrix(4),
                ArrayInput.as2DArray("[[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]]")));
    }
}