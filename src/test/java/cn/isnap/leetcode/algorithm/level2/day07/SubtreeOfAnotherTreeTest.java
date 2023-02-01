package cn.isnap.leetcode.algorithm.level2.day07;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtreeOfAnotherTreeTest {
    SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

    @Test
    public void isSubtree() {
        // [3,4,5,1,2]
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode subRoot =  new TreeNode(4, new TreeNode(1), new TreeNode(2));

        Assert.assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }
}