package cn.isnap.leetcode.DataStructure.level1.day11;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void maxDepth() {
        TreeNode root = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        MaximumDepthOfBinaryTree mdt = new MaximumDepthOfBinaryTree();
        Assert.assertEquals(mdt.maxDepth(root), 3);
    }
}