package cn.isnap.leetcode.lc75.level1.day15;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            Integer a = pq.poll();
            Integer b = pq.poll();
            pq.offer(a - b);
        }

        return pq.poll();
    }
}
