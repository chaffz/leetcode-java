package cn.isnap.leetcode.lc75.level2.day07;

import cn.isnap.leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {
    public int pathSum(TreeNode root, int target) {
        Integer[] result = new Integer[]{0};
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        pathSum(result, root, target, 0, map);
        return result[0];
    }

    private void pathSum(Integer[] result, TreeNode node, int target, int current, Map<Integer, Integer> map) {
        if (node == null)
            return;

        current += node.val;
        int key = current - target;
        result[0] += map.getOrDefault(key, 0);

        map.put(current, map.getOrDefault(current, 0) + 1);
        pathSum(result, node.left, target, current, map);
        pathSum(result, node.right, target, current, map);
        map.put(current, map.get(current) - 1);
    }
}
