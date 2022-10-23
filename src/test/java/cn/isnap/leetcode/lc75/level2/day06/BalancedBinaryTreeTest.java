package cn.isnap.leetcode.lc75.level2.day06;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {

    @Test
    public void isBalanced() {
        TreeNode t = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));
        BalancedBinaryTree bt = new BalancedBinaryTree();
        Assert.assertFalse(bt.isBalanced(t));

        t = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));
        Assert.assertTrue(bt.isBalanced(t));

        t = new TreeNode(1, new TreeNode(2,
                new TreeNode(3, new TreeNode(4), null), null),
                new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));
        Assert.assertFalse(bt.isBalanced(t));
    }
}