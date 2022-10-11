package cn.isnap.leetcode.lc75.level1.day08;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCATest {

    @Test
    public void lowestCommonAncestor() {
        // [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
        TreeNode root = new TreeNode(6, new TreeNode(2), new TreeNode(8));
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        LCA lca = new LCA();
        Assert.assertEquals(lca.lowestCommonAncestor(root, root.left, root.right).val, 6);
    }
}