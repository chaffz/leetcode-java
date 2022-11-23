package cn.isnap.leetcode.DataStructure.level2.day03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PascalsTriangleIITest {

    @Test
    public void getRow() {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        Assert.assertEquals(pascalsTriangleII.getRow(3).toString(), "[1, 3, 3, 1]");
    }
}