package cn.isnap.leetcode.lc75.level2.day07;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumIIITest {

    @Test
    public void pathSum() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3,
                        new TreeNode(3), new TreeNode(-2)),
                        new TreeNode(2, null, new TreeNode(1))),
                new TreeNode(-3, null, new TreeNode(-11))
        );
        PathSumIII ps = new PathSumIII();
        Assert.assertEquals(ps.pathSum(root, 8), 3);
    }
}