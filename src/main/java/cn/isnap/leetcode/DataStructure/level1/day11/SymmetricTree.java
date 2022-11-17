package cn.isnap.leetcode.DataStructure.level1.day11;

import cn.isnap.leetcode.TreeNode;

/**
 * @see cn.isnap.leetcode.lc75.level2.day15.SymmetricTree
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
