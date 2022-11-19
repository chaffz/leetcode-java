package cn.isnap.leetcode.DataStructure.level1.day12;

import cn.isnap.leetcode.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSum(root, 0, targetSum);
    }

    private boolean hasPathSum(TreeNode node, int currentSum, int targetSum) {
        if (node == null) return currentSum == targetSum;
        currentSum += node.val;
        if (node.left == null && node.right == null) {
            return currentSum == targetSum;
        }

        if (node.left != null)
            if (hasPathSum(node.left, currentSum, targetSum)) return true;

        if (node.right != null)
            return hasPathSum(node.right, currentSum, targetSum);
        return false;
    }
}
