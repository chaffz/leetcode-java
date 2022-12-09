package cn.isnap.leetcode.DataStructure.level2.day18;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class LowestCommonAncestorOfABinaryTreeTest {
    LowestCommonAncestorOfABinaryTree commonAncestor = new LowestCommonAncestorOfABinaryTree();

    @Test
    public void lowestCommonAncestor() {
        // [3,5,1,6,2,0,8,null,null,7,4]
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        System.out.println(root.left.val);
        System.out.println(root.left.right.right.val);
        TreeNode result = commonAncestor.lowestCommonAncestor(root, root.left, root.left.left.right);
        Assert.assertEquals(result.val, 5);
    }
}