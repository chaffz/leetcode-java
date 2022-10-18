package cn.isnap.leetcode.lc75.level2.day01;

import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixTest {

    @Test
    public void spiralOrder() {
        SpiralMatrix sm = new SpiralMatrix();
        Assert.assertArrayEquals(sm.spiralOrder(
                new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}).toArray(),
                new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5}
        );

        Assert.assertArrayEquals(sm.spiralOrder(
                new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}).toArray(),
                new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}
        );
    }
}