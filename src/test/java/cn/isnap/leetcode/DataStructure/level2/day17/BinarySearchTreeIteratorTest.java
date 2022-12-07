package cn.isnap.leetcode.DataStructure.level2.day17;

import cn.isnap.leetcode.TreeNode;
import cn.isnap.leetcode.lc75.level2.day09.BSTIterator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeIteratorTest {

    @Test
    public void next() {
        // 7, 3, 15, null, null, 9, 20
        TreeNode root = new TreeNode(7,
                new TreeNode(3),
                new TreeNode(15, new TreeNode(9), new TreeNode(20)));

        BinarySearchTreeIterator it = new BinarySearchTreeIterator(root);
        int index = 0;
        int[] next = new int[]{3, 7, 9, 15, 20};
        while (index < next.length) {
            Assert.assertTrue(it.hasNext());
            Assert.assertEquals(it.next(), next[index++]);
        }
    }
}