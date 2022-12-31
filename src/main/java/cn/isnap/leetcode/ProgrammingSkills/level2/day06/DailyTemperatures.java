package cn.isnap.leetcode.ProgrammingSkills.level2.day06;

import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!deque.isEmpty() && temperatures[deque.peekLast()] < temperatures[i]) {
                result[deque.peekLast()] = i - deque.pollLast();
            }
            deque.offer(i);
        }
        return result;
    }
}
