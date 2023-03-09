package cn.isnap.leetcode.graph.level1.day11;

import java.util.HashSet;
import java.util.Set;

public class JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        Set<Integer> visited = new HashSet<>();
        return canReach(visited, arr, start);
    }

    private boolean canReach(Set<Integer> visited, int[] arr, int start) {
        if (visited.contains(start)) return false;
        visited.add(start);

        if (start < 0 || start >= arr.length) return false;
        if (arr[start] == 0) return true;
        if (canReach(visited, arr, start + arr[start])) return true;

        return canReach(visited, arr, start - arr[start]);
    }
}
