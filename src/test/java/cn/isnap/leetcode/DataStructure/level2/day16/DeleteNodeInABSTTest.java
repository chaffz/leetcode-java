package cn.isnap.leetcode.DataStructure.level2.day16;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteNodeInABSTTest {
    DeleteNodeInABST deleteNodeInABST = new DeleteNodeInABST();

    @Test
    public void deleteNode() {
        // [5,3,6,2,4,null,7]
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));
        root = deleteNodeInABST.deleteNode(root, 3);
        Assert.assertEquals(root.toString(), "5,4,2,6,7,");
    }
}