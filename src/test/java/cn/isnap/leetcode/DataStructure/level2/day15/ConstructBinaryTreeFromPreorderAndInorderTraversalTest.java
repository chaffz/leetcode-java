package cn.isnap.leetcode.DataStructure.level2.day15;

import cn.isnap.leetcode.TreeNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    ConstructBinaryTreeFromPreorderAndInorderTraversal constructBinaryTree = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    public void buildTree() {
        int[] preorder = ArrayInput.asArray("[3,9,20,15,7]"), inorder = ArrayInput.asArray("[9,3,15,20,7]");
        TreeNode node = constructBinaryTree.buildTree(preorder, inorder);
        Assert.assertEquals(node.toString(), "3,9,20,15,7,");
    }
}