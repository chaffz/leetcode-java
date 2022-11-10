package cn.isnap.leetcode.DataStructure.level1.day04;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PascalsTriangleTest {

    @Test
    public void generate() {
        PascalsTriangle pt = new PascalsTriangle();
        Assert.assertEquals(pt.generate(3).toString(), "[[1], [1, 1], [1, 2, 1]]");
        Assert.assertEquals(pt.generate(4).toString(), "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]");
    }
}