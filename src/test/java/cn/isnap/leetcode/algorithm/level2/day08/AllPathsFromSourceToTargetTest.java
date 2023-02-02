package cn.isnap.leetcode.algorithm.level2.day08;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllPathsFromSourceToTargetTest {
    AllPathsFromSourceToTarget allPathsFromSourceToTarget = new AllPathsFromSourceToTarget();

    @Test
    public void allPathsSourceTarget() {
        int[][] graph = ArrayInput.as2DArray("[[4,3,1],[3,2,4],[3],[4],[]]");
        Assert.assertEquals(allPathsFromSourceToTarget.allPathsSourceTarget(graph).toString().replaceAll(" ", ""),
                "[[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]");

        graph = ArrayInput.as2DArray("[[2],[],[1]]");
        Assert.assertEquals(allPathsFromSourceToTarget.allPathsSourceTarget(graph).toString().replaceAll(" ", ""),
                "[[0,2]]");

        graph = ArrayInput.as2DArray("[[4,3,1],[3,2,4],[],[4],[]]");
        Assert.assertEquals(allPathsFromSourceToTarget.allPathsSourceTarget(graph).toString().replaceAll(" ", ""),
                "[[0,4],[0,3,4],[0,1,3,4],[0,1,4]]");
    }
}