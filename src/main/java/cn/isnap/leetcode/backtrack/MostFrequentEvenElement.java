package cn.isnap.leetcode.backtrack;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (num % 2 != 0) continue;
            int c = counter.getOrDefault(num, 0);
            counter.put(num, c + 1);
        }

        int max = 0, result = -1;
        for (Integer key : counter.keySet()) {
            int val = counter.get(key);
            if (max < val) {
                max = val;
                result = key;
            } else if (max == val) {
                if (key < result) result = key;
            }
        }

        return result;
    }
}
