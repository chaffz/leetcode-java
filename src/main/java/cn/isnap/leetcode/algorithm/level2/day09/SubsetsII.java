package cn.isnap.leetcode.algorithm.level2.day09;

import java.util.*;
import java.util.stream.Collectors;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> sub = new ArrayList<>();
        result.add(sub);
        subsets(result, sub, nums, 0);
        return new ArrayList<>(result);
    }

    private void subsets(Set<List<Integer>> result, List<Integer> sub, int[] nums, int index) {
        if (index < 0 || index >= nums.length) return;
        sub.add(nums[index]);
        result.add(new ArrayList<>(sub));
        subsets(result, sub, nums, index + 1);
        sub.remove(sub.size() - 1);
        subsets(result, sub, nums, index + 1);
    }
}
