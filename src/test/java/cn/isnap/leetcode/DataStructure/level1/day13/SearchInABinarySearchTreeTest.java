package cn.isnap.leetcode.DataStructure.level1.day13;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInABinarySearchTreeTest {

    @Test
    public void searchBST() {
        TreeNode root = new TreeNode(4, new TreeNode(2,
                new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        SearchInABinarySearchTree st = new SearchInABinarySearchTree();
        Assert.assertNotNull(st.searchBST(root, 2));
        Assert.assertNull(st.searchBST(root, 8));
    }
}