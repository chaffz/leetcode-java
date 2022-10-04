package cn.isnap.leetcode.lc75.level1.day02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubsequenceTest {

    @Test
    public void isSubsequence() {
        IsSubsequence is = new IsSubsequence();
        Assert.assertTrue(is.isSubsequence("abc", "axxbxxc"));
        Assert.assertTrue(is.isSubsequence("abc", "abc"));
        Assert.assertTrue(is.isSubsequence("", "axxbxxc"));
        Assert.assertTrue(is.isSubsequence("", ""));
        Assert.assertFalse(is.isSubsequence("abc", "axxcxxb"));
    }
}