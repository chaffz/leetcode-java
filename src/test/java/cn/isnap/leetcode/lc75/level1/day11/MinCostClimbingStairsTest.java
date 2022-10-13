package cn.isnap.leetcode.lc75.level1.day11;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostClimbingStairsTest {

    @Test
    public void minCostClimbingStairs() {
        MinCostClimbingStairs mc = new MinCostClimbingStairs();
        Assert.assertEquals(mc.minCostClimbingStairs(new int[]{10, 15, 20}), 15);
        Assert.assertEquals(mc.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}), 6);
    }
}