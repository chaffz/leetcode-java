package cn.isnap.leetcode.DataStructure.level1.day10;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreePostorderTraversalTest {

    @Test
    public void postorderTraversal() {
        BinaryTreePostorderTraversal traversal = new BinaryTreePostorderTraversal();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Assert.assertEquals(traversal.postorderTraversal(root).toString(), "[3, 2, 1]");
    }
}