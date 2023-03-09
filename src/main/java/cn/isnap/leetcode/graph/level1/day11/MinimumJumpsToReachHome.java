package cn.isnap.leetcode.graph.level1.day11;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimumJumpsToReachHome {
    final static int MAX = 8000;
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<String> visited = new HashSet<>();
        for (int i : forbidden) {
            visited.add(i + ",0");
            visited.add(i + ",1");
        }
        int ret = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0}); // init with position 0 and right direction
        visited.add("0,0");
        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; i--) {
                int[] p = q.poll();
                if (p[0] == x) return ret;
                int idx = p[0] - b;
                String backward = idx + ",1";
                if (idx >= 0 && !visited.contains(backward) && p[1] == 0) {
                    q.add(new int[]{idx, 1});
                    visited.add(backward);
                }
                idx = p[0] + a;
                String forward = idx + ",0";
                if (!visited.contains(forward) && idx <= MAX) { // position beyond 4000 will never reach x because of rule 3
                    q.add(new int[]{idx, 0});
                    visited.add(forward);
                }
            }
            ret++;
        }
        return -1;
    }
}
