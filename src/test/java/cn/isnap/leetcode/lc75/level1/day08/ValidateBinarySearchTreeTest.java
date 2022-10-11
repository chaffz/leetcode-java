package cn.isnap.leetcode.lc75.level1.day08;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;


public class ValidateBinarySearchTreeTest {

    @Test
    public void isValidBST() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        ValidateBinarySearchTree vb  = new ValidateBinarySearchTree();
        Assert.assertTrue(vb.isValidBST(root));

        root = new TreeNode(5, new TreeNode(1),
                new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        Assert.assertFalse(vb.isValidBST(root));

        root = new TreeNode(5, new TreeNode(4),
                new TreeNode(6, new TreeNode(3), new TreeNode(7)));

        Assert.assertFalse(vb.isValidBST(root));

        // [-2147483648,-2147483648]
        root = new TreeNode(-2147483648, new TreeNode(-2147483648), null);
        Assert.assertFalse(vb.isValidBST(root));
    }
}