package cn.isnap.leetcode.lc75.level1.day10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {

    @Test
    public void fib() {
        FibonacciNumber fn = new FibonacciNumber();
        Assert.assertEquals(fn.fib(0), 0);
        Assert.assertEquals(fn.fib(1), 1);
        Assert.assertEquals(fn.fib(2), 1);
        Assert.assertEquals(fn.fib(3), 2);
        Assert.assertEquals(fn.fib(4), 3);
        Assert.assertEquals(fn.fib(5), 5);
        Assert.assertEquals(fn.fib(6), 8);
    }
}