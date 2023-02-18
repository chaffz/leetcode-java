package cn.isnap.leetcode.graph.level1.day02;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfEnclavesTest {
    NumberOfEnclaves numberOfEnclaves = new NumberOfEnclaves();

    @Test
    public void numEnclaves() {
        int[][] grid = ArrayInput.as2DArray("[[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]");
        Assert.assertEquals(numberOfEnclaves.numEnclaves(grid), 3);

        // [[0,0,0,1,1,1,0,1,0,0],[1,1,0,0,0,1,0,1,1,1],[0,0,0,1,1,1,0,1,0,0],[0,1,1,0,0,0,1,0,1,0],[0,1,1,1,1,1,0,0,1,0],[0,0,1,0,1,1,1,1,0,1],[0,1,1,0,0,0,1,1,1,1],[0,0,1,0,0,1,0,1,0,1],[1,0,1,0,1,1,0,0,0,0],[0,0,0,0,1,1,0,0,0,1]]
        grid = ArrayInput.as2DArray("[[0,0,0,1,1,1,0,1,0,0],[1,1,0,0,0,1,0,1,1,1],[0,0,0,1,1,1,0,1,0,0],[0,1,1,0,0,0,1,0,1,0],[0,1,1,1,1,1,0,0,1,0],[0,0,1,0,1,1,1,1,0,1],[0,1,1,0,0,0,1,1,1,1],[0,0,1,0,0,1,0,1,0,1],[1,0,1,0,1,1,0,0,0,0],[0,0,0,0,1,1,0,0,0,1]]");
        Assert.assertEquals(numberOfEnclaves.numEnclaves(grid), 3);
    }
}