package cn.isnap.leetcode.DataStructure.level2.day18;

import cn.isnap.leetcode.TreeNode;

public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        serialize(builder, root);
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodeValues = data.split(",");
        int[] index = new int[]{0};
        return deserialize(nodeValues, index);
    }

    private TreeNode deserialize(String[] nodeValues, int[] index) {
        if (nodeValues[index[0]].equals("N")) {
            index[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodeValues[index[0]]));
        index[0]++;
        node.left = deserialize(nodeValues, index);
        node.right = deserialize(nodeValues, index);

        return node;
    }

    private void serialize(StringBuilder builder, TreeNode node) {
        if (node == null) {
            builder.append("N").append(",");
            return;
        }
        builder.append(String.valueOf(node.val)).append(",");
        serialize(builder, node.left);
        serialize(builder, node.right);
    }
}
