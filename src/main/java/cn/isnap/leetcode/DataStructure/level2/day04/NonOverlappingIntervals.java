package cn.isnap.leetcode.DataStructure.level2.day04;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        // line up intervals end to end
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
        int nonOverlapCount = 1;
        int n = intervals.length;

        for (int i = 1, prevIntervalEnd = intervals[0][1]; i < n; i++) {
            // if previous interval's end is <= current interval's start, then there's no overlap
            if (prevIntervalEnd <= intervals[i][0]) {
                prevIntervalEnd = intervals[i][1];
                nonOverlapCount++;
            }
        }
        return n - nonOverlapCount;
    }
}
