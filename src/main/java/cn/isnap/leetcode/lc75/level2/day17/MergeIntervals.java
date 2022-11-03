package cn.isnap.leetcode.lc75.level2.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        return Interval.merge(intervals);
    }
}
