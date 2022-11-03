package cn.isnap.leetcode.lc75.level2.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> newIts = new ArrayList<>(Arrays.asList(intervals));
        newIts.add(newInterval);
        intervals = newIts.toArray(new int[newIts.size()][]);
        return Interval.merge(intervals);
    }
}
