package cn.isnap.leetcode.DataStructure.level2.day21;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    static class pair {
        int result;
        int[] point;

        pair(int[] point) {
            this.result = point[0] * point[0] + point[1] * point[1];
            this.point = point;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> heap = new PriorityQueue<>(new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                return o1.result < o2.result ? 1 : -1;
            }
        });
        for (int[] point : points) {
            heap.offer(new pair(point));
            if (heap.size() > k) heap.poll();
        }
        int[][] result = new int[k][];
        int i = 0;
        while (!heap.isEmpty()) {
            pair p = heap.poll();
            result[i++] = p.point;
        }

        return result;
    }
}
