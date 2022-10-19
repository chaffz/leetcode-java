package cn.isnap.leetcode.lc75.level2.day02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyStringsTest {

    @Test
    public void multiply() {
        MultiplyStrings ms = new MultiplyStrings();
        Assert.assertEquals(ms.multiply("123", "456"), "56088");
    }
}