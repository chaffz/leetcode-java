package cn.isnap.leetcode.lc75.level2.day02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        Assert.assertEquals(lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
    }
}