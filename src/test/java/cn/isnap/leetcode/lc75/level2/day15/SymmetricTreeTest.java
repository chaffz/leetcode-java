package cn.isnap.leetcode.lc75.level2.day15;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {

    @Test
    public void isSymmetric() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        SymmetricTree st = new SymmetricTree();
        Assert.assertTrue(st.isSymmetric(root));

        root.left.left.val = 4;
        Assert.assertFalse(st.isSymmetric(root));
    }
}