package cn.isnap.leetcode.lc75.level2.day11;

import org.junit.Assert;
import org.junit.Test;

public class BusRoutesTest {

    @Test
    public void numBusesToDestination() {
        // [[1,2,7],[3,6,7]]
        int[][] routes = new int[][]{{1, 2, 7}, {3, 6, 7}};
        BusRoutes br = new BusRoutes();
        Assert.assertEquals(br.numBusesToDestination(routes, 1, 6), 2);
    }
}