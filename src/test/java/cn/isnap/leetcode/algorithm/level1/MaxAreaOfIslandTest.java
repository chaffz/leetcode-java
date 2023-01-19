package cn.isnap.leetcode.algorithm.level1;

import cn.isnap.leetcode.algorithm.level1.day07.MaxAreaOfIsland;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class MaxAreaOfIslandTest {
    MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();

    @Test
    public void maxAreaOfIsland() {
        int[][] grid = ArrayInput.as2DArray("[[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]");
        Assert.assertEquals(maxAreaOfIsland.maxAreaOfIsland(grid), 6);
    }
}