package cn.isnap.leetcode.graph.level1.day09;

import java.util.*;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    int result = 0;

    public int minReorder(int n, int[][] connections) {
        boolean[] visited = new boolean[n];
        Map<Integer, List<Integer>> in = new HashMap<>();
        Map<Integer, List<Integer>> out = new HashMap<>();
        for (int[] connection : connections) {
            in.computeIfAbsent(connection[1], x -> new ArrayList<>()).add(connection[0]);
            out.computeIfAbsent(connection[0], x -> new ArrayList<>()).add(connection[1]);
        }
        dfs(0, in, out, visited);

        return result;
    }

    private void dfs(int city, Map<Integer, List<Integer>> in,
                     Map<Integer, List<Integer>> out, boolean[] visited) {
        if (visited[city]) return;
        visited[city] = true;

        if (!out.containsKey(city)) return;
        List<Integer> outs = out.get(city);
        for (Integer ct : outs) {
            if (!visited[ct]) {
                in.computeIfAbsent(city, x -> new ArrayList<>()).add(ct);
                result++;
            }
        }
        out.remove(city);

        if (!in.containsKey(city)) return;

        for (Integer ct : in.get(city)) {
            dfs(ct, in, out, visited);
        }
    }
}
