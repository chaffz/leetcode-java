package cn.isnap.leetcode.algorithm.level1.day12;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void minimumTotal() {
//        Assert.assertEquals(triangle.minimumTotal(
//                ArrayInput.as2DList("[[2],[3,4],[6,5,7],[4,1,8,3]]")), 11);

        // [[-1],[2,3],[1,-1,-3]]
        Assert.assertEquals(triangle.minimumTotal(
                ArrayInput.as2DList("[[-1],[2,3],[1,-1,-3]]")), -1);
    }
}