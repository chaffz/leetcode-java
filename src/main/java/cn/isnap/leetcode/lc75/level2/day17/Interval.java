package cn.isnap.leetcode.lc75.level2.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interval {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return Integer.compare(o1[1], o2[1]);

                return Integer.compare(o1[0], o2[0]);
            }
        });

        int index = 0;

        while (index < intervals.length) {
            int start = intervals[index][0]; //storing start
            int end = intervals[index][1];
            index++;

            while (index < intervals.length && intervals[index][0] <= end) {
                if (intervals[index][1] > end)//making sure range is not shrinking
                    end = intervals[index][1];
                index++;
            }
            result.add(new int[]{start, end});
        }

        return result.toArray(new int[result.size()][]);
    }
}
