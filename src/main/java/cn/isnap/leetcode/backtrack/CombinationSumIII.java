package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        combinationSum3(result, cur, k, n);
        return new ArrayList<>(result);
    }

    private void combinationSum3(Set<List<Integer>> result, Set<Integer> cur, int k, int n) {
        if (n < 0) return;
        if (n == 0 && k == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (cur.contains(i)) continue;
            cur.add(i);
            combinationSum3(result, cur, k - 1, n - i);
            cur.remove(i);
        }
    }
}
