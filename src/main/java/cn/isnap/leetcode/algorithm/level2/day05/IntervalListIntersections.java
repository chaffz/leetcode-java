package cn.isnap.leetcode.algorithm.level2.day05;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList == null || firstList.length == 0 || secondList == null || secondList.length == 0)
            return new int[][]{};

        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if (end >= start)
                result.add(new int[]{start, end});

            if (end == firstList[i][1]) i++;
            if (end == secondList[j][1]) j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
