package cn.isnap.leetcode.DataStructure.level2.day18;

import cn.isnap.leetcode.TreeNode;

import java.util.StringJoiner;

public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringJoiner joiner = new StringJoiner(",");
        serialize(joiner, root);
        return joiner.toString();
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

    private void serialize(StringJoiner builder, TreeNode node) {
        if (node == null) {
            builder.add("N");
            return;
        }
        builder.add(String.valueOf(node.val));
        serialize(builder, node.left);
        serialize(builder, node.right);
    }
}
