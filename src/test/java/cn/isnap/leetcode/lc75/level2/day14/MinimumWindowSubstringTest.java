package cn.isnap.leetcode.lc75.level2.day14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {

    @Test
    public void minWindow() {
        MinimumWindowSubstring mws = new MinimumWindowSubstring();

        Assert.assertEquals(mws.minWindow("ADOBECODEBANC", "ABC"), "BANC");
    }
}