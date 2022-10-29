package cn.isnap.leetcode.lc75.level2.day12;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

    @Test
    public void rob() {
        int[] nums = new int[]{1, 2, 3, 1};
        HouseRobber hr = new HouseRobber();
        Assert.assertEquals(hr.rob(nums), 4);
    }
}