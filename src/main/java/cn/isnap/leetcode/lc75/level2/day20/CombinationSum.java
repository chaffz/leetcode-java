package cn.isnap.leetcode.lc75.level2.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        combinationSum(result, candidates, target, data, 0, 0);
        return result;
    }

    private void combinationSum(List<List<Integer>> result, int[] candidates, int target,
                                List<Integer> data, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(data));
            return;
        }

        if (sum > target) return;
        if (index >= candidates.length) return;
        if (sum + candidates[index] <= target) {
            data.add(candidates[index]);
            combinationSum(result, candidates, target, data, sum + candidates[index], index);
            data.remove(data.size() - 1);
            combinationSum(result, candidates, target, data, sum, index + 1);
        }
    }
}
