package cn.isnap.leetcode.graph.level1.day10;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPathWithAlternatingColorsTest {
    ShortestPathWithAlternatingColors alternatingColors = new ShortestPathWithAlternatingColors();

    @Test
    public void shortestAlternatingPaths() {
        // redEdges = [[0,1],[1,2]], blueEdges = []
        int[][] redEdges = ArrayInput.as2DArray("[[0,1],[1,2]]");
        int[][] blueEdges = new int[0][];
        Assert.assertArrayEquals(alternatingColors.shortestAlternatingPaths(3, redEdges, blueEdges), ArrayInput.asArray("[0,1,-1]"));
    }
}