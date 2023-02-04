package cn.isnap.leetcode.algorithm.level2.day10;

import java.util.*;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (Arrays.stream(candidates).sum() < target) return new ArrayList<>();
        Arrays.sort(candidates);
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> data = new ArrayList<>();
        combinationSum(result, candidates, target, data, 0);
        return new ArrayList<>(result);
    }

    private void combinationSum(Set<List<Integer>> result, int[] candidates, int target,
                                List<Integer> data, int start) {
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<>(data));
            return;
        }
        for (int i = start; i < candidates.length; ++i) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            int n = candidates[i];
            data.add(n);
            combinationSum(result, candidates, target - n, data, i + 1);
            data.remove(data.size() - 1);
        }
    }
}
