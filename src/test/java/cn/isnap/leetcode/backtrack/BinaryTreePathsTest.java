package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreePathsTest {
    BinaryTreePaths binaryTreePaths = new BinaryTreePaths();

    @Test
    public void binaryTreePaths() {
        // [1,2,3,null,5]
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> paths = binaryTreePaths.binaryTreePaths(root);
        System.out.println(paths);
    }
}