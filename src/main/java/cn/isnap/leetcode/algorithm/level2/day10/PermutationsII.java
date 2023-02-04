package cn.isnap.leetcode.algorithm.level2.day10;

import java.util.*;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        boolean[] used = new boolean[nums.length];
        List<Integer> data = new ArrayList<>();
        permute(result, nums, used, data);
        return new ArrayList<>(result);
    }

    private void permute(Set<List<Integer>> result, int[] nums, boolean[] used, List<Integer> data) {
        if (data.size() == nums.length) {
            result.add(new ArrayList<>(data));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            data.add(nums[i]);
            permute(result, nums, used, data);
            used[i] = false;
            data.remove(data.size() - 1);
        }
    }
}
