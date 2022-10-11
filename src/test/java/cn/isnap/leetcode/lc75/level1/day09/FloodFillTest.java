package cn.isnap.leetcode.lc75.level1.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FloodFillTest {

    @Test
    public void floodFill() {
        // image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
        // [[2,2,2],[2,2,0],[2,0,1]]
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        FloodFill ff = new FloodFill();
        Assert.assertEquals(ff.floodFill(image, 1, 1, 2), new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}});
        Assert.assertEquals(ff.floodFill(image, 1, 1, 3), new int[][]{{3, 3, 3}, {3, 3, 0}, {3, 0, 1}});
    }
}