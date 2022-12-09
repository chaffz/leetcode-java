package cn.isnap.leetcode.DataStructure.level2.day18;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerializeAndDeserializeBinaryTreeTest {
    SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

    @Test
    public void serialize() {
        // [1,2,3,null,null,4,5]
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        String output = serializeAndDeserializeBinaryTree.serialize(root);
        Assert.assertEquals(output, "1,2,N,N,3,4,N,N,5,N,N");
        TreeNode newRoot = serializeAndDeserializeBinaryTree.deserialize(output);
        Assert.assertEquals(root.toString(), newRoot.toString());
    }
}