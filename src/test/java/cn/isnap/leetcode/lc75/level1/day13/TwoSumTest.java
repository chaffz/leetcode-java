package cn.isnap.leetcode.lc75.level1.day13;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum ts = new TwoSum();
        Assert.assertTrue(Arrays.equals(ts.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1}));
        Assert.assertTrue(Arrays.equals(ts.twoSum(new int[]{3, 3}, 6), new int[]{0, 1}));
        Assert.assertTrue(Arrays.equals(ts.twoSum(new int[]{2, 5, 5, 11}, 10), new int[]{1, 2}));
    }
}