package cn.isnap.leetcode.lc75.level2.day07;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiameterOfBinaryTreeTest {

    @Test
    public void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1, new TreeNode(2,
                new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        DiameterOfBinaryTree db = new DiameterOfBinaryTree();
        Assert.assertEquals(db.diameterOfBinaryTree(root), 3);

        root = new TreeNode(
                1,
                new TreeNode(2,
                        new TreeNode(4, new TreeNode(6, new TreeNode(8), null), null),
                        new TreeNode(5, null, new TreeNode(7, null, new TreeNode(9)))),
                new TreeNode(3)
        );
        Assert.assertEquals(db.diameterOfBinaryTree(root), 6);
    }
}