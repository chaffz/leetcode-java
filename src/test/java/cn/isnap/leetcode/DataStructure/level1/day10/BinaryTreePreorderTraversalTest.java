package cn.isnap.leetcode.DataStructure.level1.day10;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreePreorderTraversalTest {

    @Test
    public void preorderTraversal() {
        BinaryTreePreorderTraversal traversal = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Assert.assertEquals(traversal.preorderTraversal(root).toString(), "[1, 2, 3]");
    }
}