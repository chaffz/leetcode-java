package cn.isnap.leetcode.DataStructure.level1.day12;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTest {

    @Test
    public void hasPathSum() {
        // [5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        PathSum ps = new PathSum();
        Assert.assertTrue(ps.hasPathSum(root, 22));
        Assert.assertFalse(ps.hasPathSum(null, 0));
        Assert.assertFalse(ps.hasPathSum(new TreeNode(1, new TreeNode(2), null), 1));
    }
}