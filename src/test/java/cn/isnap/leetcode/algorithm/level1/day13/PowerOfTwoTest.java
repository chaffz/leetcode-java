package cn.isnap.leetcode.algorithm.level1.day13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {
    PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    public void isPowerOfTwo() {
        Assert.assertTrue(powerOfTwo.isPowerOfTwo(16));
    }
}