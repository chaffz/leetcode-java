package cn.isnap.leetcode.lc75.level2.day15;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

    @Test
    public void isSameTree() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        SameTree st = new SameTree();
        Assert.assertTrue(st.isSameTree(p, p));
        TreeNode q = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        Assert.assertFalse(st.isSameTree(p, q));
    }
}