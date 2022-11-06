package cn.isnap.leetcode.lc75.level2.day20;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        List<Integer> data = new ArrayList<>();
        permute(result, nums, used, data);
        return result;
    }

    private void permute(List<List<Integer>> result, int[] nums, boolean[] used, List<Integer> data) {
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
