package cn.isnap.leetcode.lc75.level2.day15;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeRightSideViewTest {

    @Test
    public void rightSideView() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));

        BinaryTreeRightSideView bt = new BinaryTreeRightSideView();
        Assert.assertEquals(bt.rightSideView(root).toString(), "[1, 3, 4]");

        TreeNode root2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3));
        Assert.assertEquals(bt.rightSideView(root2).toString(), "[1, 3, 4]");
    }
}