package cn.isnap.leetcode.algorithm.level1.day10;

import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        combine(result, path, n, k, 1);
        return result;
    }

    private void combine(List<List<Integer>> result, List<Integer> path, int n, int k, int cur) {
        if (path.size() == k) {
            result.add(new LinkedList<>(path));
            return;
        }

        for (int i = cur; i <= n; i++) {
            path.add(i);
            combine(result, path, n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
