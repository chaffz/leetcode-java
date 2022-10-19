package cn.isnap.leetcode.lc75.level2.day01;

import org.junit.Assert;
import org.junit.Test;

public class WhereWillTheBallFallTest {

    @Test
    public void findBall() {
        WhereWillTheBallFall wb = new WhereWillTheBallFall();
        Assert.assertArrayEquals(wb.findBall(new int[][]{
                        {1, 1, 1, -1, -1},
                        {1, 1, 1, -1, -1},
                        {-1, -1, -1, 1, 1},
                        {1, 1, 1, 1, -1},
                        {-1, -1, -1, -1, -1}}),
                new int[]{1, -1, -1, -1, -1}
        );
    }
}