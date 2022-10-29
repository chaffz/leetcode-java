package cn.isnap.leetcode.lc75.level2.day11;

import org.junit.Assert;
import org.junit.Test;

public class CourseScheduleIITest {

    @Test
    public void findOrder() {
        // [[1,0],[2,0],[3,1],[3,2]] 4
        int[][] prerequisites = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        CourseScheduleII cs = new CourseScheduleII();
        Assert.assertArrayEquals(cs.findOrder(4, prerequisites), new int[]{0, 1, 2, 3});
    }
}