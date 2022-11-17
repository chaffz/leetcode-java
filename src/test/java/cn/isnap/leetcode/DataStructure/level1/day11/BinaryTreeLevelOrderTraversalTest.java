package cn.isnap.leetcode.DataStructure.level1.day11;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        BinaryTreeLevelOrderTraversal bt = new BinaryTreeLevelOrderTraversal();
        Assert.assertEquals(bt.levelOrder(root).toString(), "[[1], [2, 3], [4, 5]]");
    }
}