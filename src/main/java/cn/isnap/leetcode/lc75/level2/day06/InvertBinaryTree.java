package cn.isnap.leetcode.lc75.level2.day06;

import cn.isnap.leetcode.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode t = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = t;
        }

        return root;
    }
}
