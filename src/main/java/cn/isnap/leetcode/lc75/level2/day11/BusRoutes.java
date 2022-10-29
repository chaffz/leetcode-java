package cn.isnap.leetcode.lc75.level2.day11;

import java.util.*;

public class BusRoutes {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        Map<Integer, List<Integer>> lines = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                lines.putIfAbsent(stop, new ArrayList<>());
                lines.get(stop).add(i);
            }
        }

        Queue<Integer> q = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(source);

        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                List<Integer> buses = lines.get(q.poll());
                for (int bus : buses) {
                    if (visited.contains(bus)) continue;
                    visited.add(bus);
                    for (int stop : routes[bus]) {
                        if (stop == target) return count + 1;
                        q.offer(stop);
                    }
                }
            }
            count++;
        }

        return -1;
    }
}
