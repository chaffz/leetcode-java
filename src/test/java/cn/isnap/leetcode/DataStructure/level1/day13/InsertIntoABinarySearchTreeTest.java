package cn.isnap.leetcode.DataStructure.level1.day13;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertIntoABinarySearchTreeTest {

    @Test
    public void insertIntoBST() {
        /**
         * [40,20,60,10,30,50,70]
         * 25
         */

        TreeNode root = new TreeNode(40,
                new TreeNode(20, new TreeNode(10), new TreeNode(30)),
                new TreeNode(60, new TreeNode(50), new TreeNode(70)));

        InsertIntoABinarySearchTree ibst = new InsertIntoABinarySearchTree();
        Assert.assertEquals(ibst.insertIntoBST(root, 25).toString(), "40,20,10,30,25,60,50,70,");
    }
}