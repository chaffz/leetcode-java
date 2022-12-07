package cn.isnap.leetcode.DataStructure.level2.day16;

import cn.isnap.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PathSumIITest {
    PathSumII pathSumII = new PathSumII();

    @Test
    public void pathSum() {
        // [5,4,8,11,null,13,4,7,2,null,null,5,1]
        TreeNode root = new TreeNode(5,
                new TreeNode(4,  new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
        List<List<Integer>> result = pathSumII.pathSum(root, 22);
        Assert.assertEquals(result.toString().replaceAll(" ", ""), "[[5,4,11,2],[5,8,4,5]]");
    }
}