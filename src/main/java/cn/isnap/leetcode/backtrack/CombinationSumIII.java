package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 1; i <= 9; i++) {
            combinationSum3(result, new LinkedList<>(), i, k, n);
        }
        return new ArrayList<>(result);
    }

    private void combinationSum3(List<List<Integer>> result, List<Integer> cur, int i, int k, int n) {
        if (n == 0 && k == 0) {
            result.add(new ArrayList<>(cur));
            return;
        } if (n < 0 || k < 0) return;

        cur.add(i);
        for (int j = i + 1; j <= 10; j++) {
            combinationSum3(result, cur, j, k - 1, n - i);
            if (j > n) break;
        }
        cur.remove(cur.size() - 1);
    }
}
