package cn.isnap.leetcode.graph.level1.day06;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestBridgeTest {
    ShortestBridge shortestBridge = new ShortestBridge();

    @Test
    public void shortestBridge() {
        Assert.assertEquals(shortestBridge.shortestBridge(
                ArrayInput.as2DArray("[[1,1,0,0,0],[1,0,0,0,0],[1,0,0,0,0],[0,0,0,1,1],[0,0,0,1,1]]")), 3);
    }
}