package cn.isnap.leetcode.DataStructure.level2.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    static class pair {
        int key;
        int count;

        pair(int a, int b) {
            key = a;
            count = b;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair> heap = new PriorityQueue<pair>((a, b) -> {
            return a.count > b.count ? 1 : -1;
        });
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        counter.forEach((key, count) -> {
            heap.offer(new pair(key, count));
            if (heap.size() > k) {
                heap.poll();
            }
        });
        int[] result = new int[heap.size()];
        int i = heap.size() - 1;
        while (!heap.isEmpty()) {
            result[i--] = heap.poll().key;
        }
        return result;
    }
}
