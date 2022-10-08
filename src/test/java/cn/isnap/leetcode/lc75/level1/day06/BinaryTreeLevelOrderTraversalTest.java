package cn.isnap.leetcode.lc75.level1.day06;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {
        TreeNode root = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        BinaryTreeLevelOrderTraversal bto = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = bto.levelOrder(root);
        StringBuilder sb = new StringBuilder();
        for (List<Integer> integers : result) {
            sb.append("[");
            for (Integer integer : integers) {
                sb.append(integer).append(",");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("],");
        }
        sb.deleteCharAt(sb.length()-1);

        Assert.assertEquals(sb.toString(), "[3],[9,20],[15,7]");
    }
}