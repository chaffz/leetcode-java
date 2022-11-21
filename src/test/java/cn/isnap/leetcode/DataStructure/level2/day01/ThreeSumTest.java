package cn.isnap.leetcode.DataStructure.level2.day01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        ThreeSum ts = new ThreeSum();
        Assert.assertEquals(ts.threeSum(new int[]{-1,0,1,2,-1,-4}).toString(), "[[-1, -1, 2], [-1, 0, 1]]");
    }
}