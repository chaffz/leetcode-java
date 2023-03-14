package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        StringBuilder path = new StringBuilder();
        path.append(root.val);
        binaryTreePaths(result, path, root);
        return result;
    }

    private void binaryTreePaths(List<String> result, StringBuilder builder, TreeNode node) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            result.add(builder.toString());
            return;
        }


        if (node.left != null) {
            StringBuilder sb = new StringBuilder(builder);
            sb.append("->").append(node.left.val);
            binaryTreePaths(result, sb, node.left);
        }

        if (node.right != null) {
            StringBuilder sb = new StringBuilder(builder);
            sb.append("->").append(node.right.val);
            binaryTreePaths(result, sb, node.right);
        }
    }
}
