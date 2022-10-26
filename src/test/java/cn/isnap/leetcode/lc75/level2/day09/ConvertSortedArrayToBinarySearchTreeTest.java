package cn.isnap.leetcode.lc75.level2.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void sortedArrayToBST() {
        ConvertSortedArrayToBinarySearchTree cst = new ConvertSortedArrayToBinarySearchTree();
        Assert.assertEquals(cst.sortedArrayToBST(new int[] {-10,-3,0,5,9}).toString(), "0,-10,-3,5,9,");
    }
}