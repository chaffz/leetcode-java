package cn.isnap.leetcode.ProgrammingSkills.level1.day10;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfLeftLeavesTest {
    SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();

    @Test
    public void sumOfLeftLeaves() {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Assert.assertEquals(sumOfLeftLeaves.sumOfLeftLeaves(treeNode), 24);
    }
}