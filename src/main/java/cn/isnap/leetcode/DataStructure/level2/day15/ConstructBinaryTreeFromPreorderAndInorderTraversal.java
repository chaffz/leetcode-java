package cn.isnap.leetcode.DataStructure.level2.day15;

import cn.isnap.leetcode.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd) {
        if (preStart >= preorder.length || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int i = inStart;
        for (; i < inEnd; i++) {
            if (inorder[i] == root.val) break;
        }
        root.left = buildTree(preorder, preStart + 1, inorder, inStart, i - 1);
        root.right = buildTree(preorder, preStart + i - inStart + 1, inorder, i + 1, inEnd);
        return root;
    }
}
