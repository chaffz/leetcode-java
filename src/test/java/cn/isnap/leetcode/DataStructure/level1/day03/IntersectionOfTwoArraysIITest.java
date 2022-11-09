package cn.isnap.leetcode.DataStructure.level1.day03;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IntersectionOfTwoArraysIITest {

    @Test
    public void intersect() {
        IntersectionOfTwoArraysII it = new IntersectionOfTwoArraysII();
        int[] r = it.intersect(new int[]{4, 9, 6}, new int[]{9, 4, 7, 8, 4});
        Arrays.sort(r);
        Assert.assertArrayEquals(r, new int[]{4, 9});
        r = it.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        Assert.assertArrayEquals(r, new int[]{2, 2});
    }
}