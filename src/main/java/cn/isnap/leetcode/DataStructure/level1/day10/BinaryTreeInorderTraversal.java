package cn.isnap.leetcode.DataStructure.level1.day10;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(result, root);
        return result;
    }

    private void inorderTraversal(List<Integer> result, TreeNode node) {
        if (node == null) return;
        inorderTraversal(result, node.left);
        result.add(node.val);
        inorderTraversal(result, node.right);
    }
}
