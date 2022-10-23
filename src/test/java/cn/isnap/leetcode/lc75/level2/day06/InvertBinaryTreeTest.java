package cn.isnap.leetcode.lc75.level2.day06;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertBinaryTreeTest {

    @Test
    public void invertTree() {
        TreeNode t = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        InvertBinaryTree ib = new InvertBinaryTree();
        Assert.assertEquals(ib.invertTree(t).levelString(), "4,7,2,9,6,3,1,");
    }
}