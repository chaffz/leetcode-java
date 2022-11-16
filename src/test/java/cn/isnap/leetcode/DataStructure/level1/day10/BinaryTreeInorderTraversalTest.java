package cn.isnap.leetcode.DataStructure.level1.day10;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Assert.assertEquals(traversal.inorderTraversal(root).toString(), "[1, 3, 2]");
    }
}