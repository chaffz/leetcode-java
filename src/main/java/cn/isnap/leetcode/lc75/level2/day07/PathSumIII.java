package cn.isnap.leetcode.lc75.level2.day07;

import cn.isnap.leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        return helper(root, (long) targetSum, 0, map);
    }

    private int helper(TreeNode node, long targetSum, long preSum, Map<Long, Integer> map) {
        if (node == null) {
            return 0;
        }
        preSum += node.val;
        int res = map.getOrDefault(preSum - targetSum, 0);
        map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        res += helper(node.left, targetSum, preSum, map) + helper(node.right, targetSum, preSum, map);
        map.put(preSum, map.get(preSum) - 1);
        return res;
    }
}
