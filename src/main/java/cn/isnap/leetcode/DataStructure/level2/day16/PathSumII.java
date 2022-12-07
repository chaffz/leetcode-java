package cn.isnap.leetcode.DataStructure.level2.day16;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSum(result, root, path, 0, targetSum);
        return result;
    }

    public void pathSum(List<List<Integer>> result, TreeNode node, List<Integer> path, int cur, int targetSum) {
        if (node == null) {
            return;
        }

        path.add(node.val);
        cur += node.val;
        if (targetSum == cur && node.right == null && node.left == null) {
            result.add(new ArrayList<>(path));
        }
        pathSum(result, node.left, path, cur, targetSum);
        pathSum(result, node.right, path, cur, targetSum);
        path.remove(path.size()-1);
    }
}
