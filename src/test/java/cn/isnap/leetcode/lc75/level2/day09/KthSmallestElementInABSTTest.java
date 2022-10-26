package cn.isnap.leetcode.lc75.level2.day09;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestElementInABSTTest {

    @Test
    public void kthSmallest() {
        // 5,3,6,2,4,null,null,1
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                new TreeNode(6));

        KthSmallestElementInABST ks = new KthSmallestElementInABST();
        Assert.assertEquals(ks.kthSmallest(root, 3), 3);
    }
}