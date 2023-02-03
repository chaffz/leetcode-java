package cn.isnap.leetcode.algorithm.level2.day09;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        result.add(sub);
        subsets(result, sub, nums, 0);
        return result;
    }

    private void subsets(List<List<Integer>> result, List<Integer> sub, int[] nums, int index) {
        if (index < 0 || index >= nums.length) return;
        sub.add(nums[index]);
        result.add(new ArrayList<>(sub));
        subsets(result, sub, nums, index + 1);
        sub.remove(sub.size() - 1);
        subsets(result, sub, nums, index + 1);
    }
}
