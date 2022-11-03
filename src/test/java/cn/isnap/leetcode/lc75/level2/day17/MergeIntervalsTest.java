package cn.isnap.leetcode.lc75.level2.day17;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeIntervalsTest {

    @Test
    public void merge() {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        MergeIntervals mi = new MergeIntervals();
        Assert.assertTrue(Arrays.deepEquals(mi.merge(intervals), new int[][]{{1, 6}, {8, 10}, {15, 18}}));
    }
}