package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterNumericallyBalancedNumberTest {
    NextGreaterNumericallyBalancedNumber nextGreaterNumericallyBalancedNumber = new NextGreaterNumericallyBalancedNumber();

    @Test
    public void nextBeautifulNumber() {
        Assert.assertEquals(nextGreaterNumericallyBalancedNumber.nextBeautifulNumber(1), 22);
    }
}