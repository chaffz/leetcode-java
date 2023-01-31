package cn.isnap.leetcode.algorithm.level2.day05;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IntervalListIntersectionsTest {
    IntervalListIntersections intervalListIntersections = new IntervalListIntersections();

    @Test
    public void intervalIntersection() {
        /*
        Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
         */
        int[][] first = ArrayInput.as2DArray("[[0,2],[5,10],[13,23],[24,25]]");
        int[][] second = ArrayInput.as2DArray("[[1,5],[8,12],[15,24],[25,26]]");
        int[][] result = ArrayInput.as2DArray("[[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]");
        Assert.assertTrue(Arrays.deepEquals(intervalListIntersections.intervalIntersection(first, second), result));
    }
}