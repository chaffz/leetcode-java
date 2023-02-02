package cn.isnap.leetcode.algorithm.level2.day08;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        allPathsSourceTarget(paths, path, graph, 0);

        return paths;
    }

    private void allPathsSourceTarget(List<List<Integer>> paths, List<Integer> path, int[][] graph, int start) {
        if (start >= graph.length) {
            return;
        }

        path.add(start);
        if (start == graph.length - 1) {
            paths.add(path);
        }
        int[] next = graph[start];
        if (next.length == 0) {
            return;
        }

        for (int i : next) {
            List<Integer> copied = new ArrayList<>(path);
            allPathsSourceTarget(paths, copied, graph, i);
        }
    }
}
