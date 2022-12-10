package cn.isnap.leetcode.DataStructure.level2.day19;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumNumberOfVerticesToReachAllNodesTest {
    MinimumNumberOfVerticesToReachAllNodes reachAllNodes = new MinimumNumberOfVerticesToReachAllNodes();

    @Test
    public void findSmallestSetOfVertices() {
        Assert.assertEquals(reachAllNodes.findSmallestSetOfVertices(6,
                ArrayInput.as2DList("[[0,1],[0,2],[2,5],[3,4],[4,2]]")).toString(), "[0, 3]");

        Assert.assertEquals(reachAllNodes.findSmallestSetOfVertices(5,
                ArrayInput.as2DList("[[0,1],[2,1],[3,1],[1,4],[2,4]]")).toString(), "[0, 2, 3]");
    }
}