package cn.isnap.leetcode.DataStructure.level1.day11;

import cn.isnap.leetcode.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return maxDepth(0, root);
    }

    private int maxDepth(int max, TreeNode node) {
        if (node == null) return max;
        return Math.max(maxDepth(max + 1, node.left), maxDepth(max + 1, node.right));
    }
}
