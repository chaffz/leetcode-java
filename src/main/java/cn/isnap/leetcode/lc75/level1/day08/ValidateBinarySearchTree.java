package cn.isnap.leetcode.lc75.level1.day08;

import cn.isnap.leetcode.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val < min) return false;
        if (root.val > max) return false;

        return isValidBST(root.left, min, (long) root.val-1) &&
                isValidBST(root.right, (long) root.val+1, max);
    }
}
