package cn.isnap.leetcode.DataStructure.level2.day19;

import java.util.*;

public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> reached = new HashSet<>();
        for (List<Integer> edge : edges) {
            reached.add(edge.get(1));
        }

        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!reached.contains(i))
                result.add(i);
        }

        return result;
    }
}
