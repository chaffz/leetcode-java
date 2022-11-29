package cn.isnap.leetcode.DataStructure.level2.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void longestPalindrome() {
        Assert.assertEquals(longestPalindromicSubstring.longestPalindrome("babad"), "bab");
        Assert.assertEquals(longestPalindromicSubstring.longestPalindrome("aab"), "aa");
        Assert.assertEquals(longestPalindromicSubstring.longestPalindrome("aacabdkacaa"), "aca");
    }
}