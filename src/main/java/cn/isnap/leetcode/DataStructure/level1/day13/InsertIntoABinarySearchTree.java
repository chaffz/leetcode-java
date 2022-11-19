package cn.isnap.leetcode.DataStructure.level1.day13;

import cn.isnap.leetcode.TreeNode;

public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            return node;
        }

        TreeNode cur = root;
        while (cur.val != val) {
            if (cur.val > val && cur.left == null) cur.left = node;
            else if (cur.val < val && cur.right == null) cur.right = node;
            cur = cur.val > val ? cur.left : cur.right;
        }
        return root;
    }
}
