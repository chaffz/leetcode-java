package cn.isnap.leetcode.lc75.level1.day08;

import cn.isnap.leetcode.TreeNode;

// Lowest Common Ancestor of a Binary Search Tree
public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val > q.val) return lowestCommonAncestor(root, q, p);

        if (root.val > p.val && root.val < q.val) {
            return root;
        } else if (root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return null;
    }
}
