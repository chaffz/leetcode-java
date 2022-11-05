package cn.isnap.leetcode.lc75.level2.day18;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculatorIITest {

    @Test
    public void calculate() {
        BasicCalculatorII bc = new BasicCalculatorII();
        Assert.assertEquals(bc.calculate("3+2*2"), 7);
        Assert.assertEquals(bc.calculate("3/2"), 1);
    }
}