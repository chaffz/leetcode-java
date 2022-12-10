package cn.isnap.leetcode.DataStructure.level2.day19;

import java.util.HashMap;
import java.util.Map;

public class FindTheTownJudge {
    static class Node {
        int count;
        int trust;
    }
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;
        Map<Integer, Node> judge = new HashMap<>(n);
        for (int[] ints : trust) {
            Node node0 = judge.getOrDefault(ints[0], new Node());
            node0.trust = ints[1];
            judge.put(ints[0], node0);

            Node node1 = judge.getOrDefault(ints[1], new Node());
            node1.count += 1;
            judge.put(ints[1], node1);
        }

        int result = -1;
        int sz = n - 1;
        Node node = null;
        for (Integer key : judge.keySet()) {
            node = judge.get(key);
            if (node.count == sz) {
                result = key;
                break;
            }
        }

        if (node.trust != 0) {
            return -1;
        }

        return result;
    }
}
