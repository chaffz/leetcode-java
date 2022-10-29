package cn.isnap.leetcode.lc75.level2.day10;

import org.junit.Assert;
import org.junit.Test;

public class RottingOrangesTest {

    @Test
    public void orangesRotting() {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        RottingOranges ro = new RottingOranges();
        Assert.assertEquals(ro.orangesRotting(grid), 4);

        grid = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        Assert.assertEquals(ro.orangesRotting(grid), -1);

        Assert.assertEquals(ro.orangesRotting(new int[][]{{1, 2}}), 1);

    }
}