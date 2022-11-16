package cn.isnap.leetcode.DataStructure.level1.day10;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(result, root);
        return result;
    }

    private void postorderTraversal(List<Integer> result, TreeNode node) {
        if (node == null) return;
        postorderTraversal(result, node.left);
        postorderTraversal(result, node.right);
        result.add(node.val);
    }
}
