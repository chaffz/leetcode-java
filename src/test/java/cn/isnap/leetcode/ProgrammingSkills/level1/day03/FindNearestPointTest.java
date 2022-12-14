package cn.isnap.leetcode.ProgrammingSkills.level1.day03;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNearestPointTest {
    FindNearestPoint findNearestPoint = new FindNearestPoint();

    @Test
    public void nearestValidPoint() {
        Assert.assertEquals(findNearestPoint.nearestValidPoint(3, 4,
                ArrayInput.as2DArray("[[1,2],[3,1],[2,4],[2,3],[4,4]]")), 2);
        Assert.assertEquals(findNearestPoint.nearestValidPoint(3, 4,
                ArrayInput.as2DArray("[[3,4]]")), 0);
        Assert.assertEquals(findNearestPoint.nearestValidPoint(3, 4,
                ArrayInput.as2DArray("[[2,3]]")), -1);
        Assert.assertEquals(findNearestPoint.nearestValidPoint(1, 1,
                ArrayInput.as2DArray("[[1,2],[3,3],[3,3]]")), 0);
    }
}