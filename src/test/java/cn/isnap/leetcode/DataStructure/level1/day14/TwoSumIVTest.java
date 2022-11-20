package cn.isnap.leetcode.DataStructure.level1.day14;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumIVTest {

    @Test
    public void findTarget() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));
        TwoSumIV twoSumIV = new TwoSumIV();
        Assert.assertTrue(twoSumIV.findTarget(root, 9));
        /**
         * [0,-1,2,-3,null,null,4]
         * -4
         */
        root = new TreeNode(0,
                new TreeNode(-1, new TreeNode(-3), null),
                new TreeNode(2, null, new TreeNode(4)));
        Assert.assertTrue(twoSumIV.findTarget(root, -4));
    }
}