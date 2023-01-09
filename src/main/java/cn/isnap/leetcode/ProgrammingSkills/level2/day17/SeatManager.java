package cn.isnap.leetcode.ProgrammingSkills.level2.day17;

import java.util.BitSet;
import java.util.PriorityQueue;

public class SeatManager {
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    public SeatManager(int n) {
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
    }

    public int reserve() {
        return queue.poll();
    }

    public void unreserve(int seatNumber) {
        queue.offer(seatNumber);
    }
}
