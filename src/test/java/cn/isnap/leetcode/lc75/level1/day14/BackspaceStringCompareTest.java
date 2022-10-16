package cn.isnap.leetcode.lc75.level1.day14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceStringCompareTest {

    @Test
    public void backspaceCompare() {
        BackspaceStringCompare bsc = new BackspaceStringCompare();
        Assert.assertTrue(bsc.backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(bsc.backspaceCompare("a#b#", "c#d#"));
    }
}