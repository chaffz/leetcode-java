package cn.isnap.leetcode.lc75.level1.day10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void climbStairs() {
        ClimbingStairs cs = new ClimbingStairs();
        Assert.assertEquals(cs.climbStairs(1), 1);
        Assert.assertEquals(cs.climbStairs(2), 2);
        Assert.assertEquals(cs.climbStairs(3), 3);
        Assert.assertEquals(cs.climbStairs(4), 5);
        Assert.assertEquals(cs.climbStairs(5), 8);
    }
}