package cn.isnap.leetcode.DataStructure.level2.day05;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int count = 0;
        map.put(0, 1);

        for (int num : nums) {
            prefix += num;
            int key = prefix - k;
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
