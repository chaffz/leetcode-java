package cn.isnap.leetcode.lc75.level2.day10;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PacificAtlanticWaterFlowTest {

    @Test
    public void pacificAtlantic() {
        // [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
        int[][] heights = new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};

        PacificAtlanticWaterFlow paf = new PacificAtlanticWaterFlow();
        List<List<Integer>> r = paf.pacificAtlantic(heights);
        Assert.assertEquals(r.toString(), "[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]");
    }
}