package cn.isnap.leetcode.DataStructure.level2.day15;

import cn.isnap.leetcode.TreeNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeZigzagLevelOrderTraversalTest {
    BinaryTreeZigzagLevelOrderTraversal zigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();
    @Test
    public void zigzagLevelOrder() {
        // [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = zigzagLevelOrderTraversal.zigzagLevelOrder(root);

        Assert.assertEquals(result.toString(), "[[3], [20, 9], [15, 7]]");
    }
}