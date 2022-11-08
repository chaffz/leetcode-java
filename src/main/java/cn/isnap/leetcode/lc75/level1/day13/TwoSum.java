package cn.isnap.leetcode.lc75.level1.day13;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> opt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (opt.containsKey(key)) {
                ret[0] = opt.get(key);
                ret[1] = i;
                break;
            }
            opt.put(nums[i], i);
        }

        return ret;
    }
}
