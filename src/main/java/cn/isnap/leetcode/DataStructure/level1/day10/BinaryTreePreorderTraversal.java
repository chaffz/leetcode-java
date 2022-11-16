package cn.isnap.leetcode.DataStructure.level1.day10;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(result, root);
        return result;
    }

    private void preorderTraversal(List<Integer> result, TreeNode node) {
        if (node == null) return;
        result.add(node.val);
        preorderTraversal(result, node.left);
        preorderTraversal(result, node.right);
    }
}
