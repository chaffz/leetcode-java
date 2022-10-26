package cn.isnap.leetcode.lc75.level2.day07;

import cn.isnap.leetcode.TreeNode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        Integer[] diameter = new Integer[]{0};
        high(diameter, root, 0);
        return diameter[0];
    }

    private int high(Integer[] diameter, TreeNode node, int currentHigh) {
        if (node == null) return currentHigh;

        int left = high(diameter, node.left, currentHigh);
        int right = high(diameter, node.right, currentHigh);

        int height = Math.max(left, right) + 1;
        diameter[0] = Math.max(diameter[0], left + right);

        return height;
    }
}
