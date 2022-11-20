package cn.isnap.leetcode.DataStructure.level1.day14;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Boolean> map = new HashMap<>();
        return findTarget(map, root, k);
    }

    private boolean findTarget(Map<Integer, Boolean> map, TreeNode node, int target) {
        if (node == null) return false;
        int key = target - node.val;
        if (map.containsKey(key))
            return true;
        map.put(node.val, true);
        return findTarget(map, node.left, target)
                || findTarget(map, node.right, target);
    }

    public boolean findTarget2(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        inOrder(result, root);
        int lo = 0, hi = result.size() - 1;
        while (lo < hi) {
            int sum = result.get(lo) + result.get(hi);
            if (sum == k) return true;
            else if (sum > k) {
                hi--;
            } else {
                lo++;
            }
        }
        return false;
    }

    private void inOrder(List<Integer> result, TreeNode node) {
        if (node == null) return;
        inOrder(result, node.left);
        result.add(node.val);
        inOrder(result, node.right);
    }
}
