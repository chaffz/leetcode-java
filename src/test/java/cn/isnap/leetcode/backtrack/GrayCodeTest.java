package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrayCodeTest {
    GrayCode grayCode = new GrayCode();

    @Test
    public void grayCode() {
        Assert.assertEquals(grayCode.grayCode(2).toString().replaceAll(" ", ""), "[0,1,3,2]");
        Assert.assertEquals(grayCode.grayCode(3).toString().replaceAll(" ", ""), "[0,1,3,2,6,7,5,4]");
    }
}