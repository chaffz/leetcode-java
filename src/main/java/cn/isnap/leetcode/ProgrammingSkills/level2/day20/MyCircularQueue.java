package cn.isnap.leetcode.ProgrammingSkills.level2.day20;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    int max;
    List<Integer> cache = new ArrayList<>();

    public MyCircularQueue(int k) {
        max = k;
    }

    public boolean enQueue(int value) {
        if (cache.size() == max) return false;
        cache.add(value);
        return true;
    }

    public boolean deQueue() {
        if (cache.size() == 0) return false;

        cache.remove(0);
        return true;
    }

    public int Front() {
        if (cache.size() > 0) return cache.get(0);
        return -1;
    }

    public int Rear() {
        if (cache.size() > 0) return cache.get(cache.size() - 1);
        return -1;
    }

    public boolean isEmpty() {
        return cache.isEmpty();
    }

    public boolean isFull() {
        return cache.size() == max;
    }
}
