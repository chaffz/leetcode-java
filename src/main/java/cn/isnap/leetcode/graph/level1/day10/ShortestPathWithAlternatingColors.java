package cn.isnap.leetcode.graph.level1.day10;

import java.util.*;

/*
You are given an integer n, the number of nodes in a directed graph where the nodes are labeled from 0 to n - 1. Each edge is red or blue in this graph, and there could be self-edges and parallel edges.

You are given two arrays redEdges and blueEdges where:

redEdges[i] = [ai, bi] indicates that there is a directed red edge from node ai to node bi in the graph, and
blueEdges[j] = [uj, vj] indicates that there is a directed blue edge from node uj to node vj in the graph.
Return an array answer of length n, where each answer[x] is the length of the shortest path from node 0 to node x such that the edge colors alternate along the path, or -1 if such a path does not exist.
 */
public class ShortestPathWithAlternatingColors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer, List<Integer>> red = new HashMap<>(), blue = new HashMap<>();
        for (int[] e : redEdges) {
            red.computeIfAbsent(e[0], x -> new ArrayList<>()).add(e[1]);
        }
        for (int[] e : blueEdges) {
            blue.computeIfAbsent(e[0], x -> new ArrayList<>()).add(e[1]);
        }
        int[] result = new int[n];
        Arrays.fill(result, -1);
        result[0] = 0;

        dfs(result, red, blue, 0);
        dfs(result, red, blue, 1);

        return result;
    }

    private void dfs(int[] result, Map<Integer, List<Integer>> red, Map<Integer, List<Integer>> blue, int startColor) {
        Queue<Integer> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int step = 0;

        queue.add(0);

        while (!queue.isEmpty()) {
            step++;
            int sz = queue.size();
            for (int index = 0; index < sz; index++) {
                int curStep = queue.poll();
                if (startColor == 0) {
                    calc(result, red, queue, visited, step, index, curStep, "r");
                } else {
                    calc(result, blue, queue, visited, step, index, curStep, "b");
                }
            }

            startColor = 1 - startColor;
        }
    }

    private void calc(int[] result,
                      Map<Integer, List<Integer>> edge,
                      Queue<Integer> queue,
                      Set<String> visited, int step, int index, int curStep, String flag) {
        List<Integer> path;
        if (!edge.containsKey(curStep)) {
            return;
        }

        path = edge.get(curStep);
        for (Integer next : path) {
            String key = flag + curStep + next;
            if (visited.contains(key)) continue;

            visited.add(key);
            if (result[next] == -1 || result[next] > step) {
                result[next] = step;
            }
            queue.offer(next);
        }
    }
}
