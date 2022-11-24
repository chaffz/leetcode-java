package cn.isnap.leetcode.DataStructure.level2.day04;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonOverlappingIntervalsTest {

    @Test
    public void eraseOverlapIntervals() {
        int[][] intervals = ArrayInput.as2DArray("[[1,2],[2,3],[3,4],[1,3]]");
        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        Assert.assertEquals(nonOverlappingIntervals.eraseOverlapIntervals(intervals), 1);
    }
}