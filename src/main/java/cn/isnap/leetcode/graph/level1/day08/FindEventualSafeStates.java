package cn.isnap.leetcode.graph.level1.day08;

import java.util.*;

public class FindEventualSafeStates {
    Set<Integer> visited = new HashSet<>();
    Set<Integer> cycle = new HashSet<>();

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (!hasCycle(new HashSet<>(), graph, i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean hasCycle(Set<Integer> path, int[][] graph, int cur) {
        if (visited.contains(cur)) {
            return cycle.contains(cur);
        }

        if (path.contains(cur)) {
            return true;
        }
        if (cycle.contains(cur)) return true;

        path.add(cur);
        System.out.println(path);
        int[] next = graph[cur];
        boolean res = false;
        for (int i : next) {
            if (hasCycle(path, graph, i)) {
                cycle.add(i);
                res = true;
            }
        }
        visited.add(cur);
        path.remove(cur);
        return res;
    }
}
