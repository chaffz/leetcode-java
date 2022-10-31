package cn.isnap.leetcode.lc75.level2.day14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(ls.lengthOfLongestSubstring("abcabcbb"), 3);
        Assert.assertEquals(ls.lengthOfLongestSubstring("bbbbb"), 1);
        Assert.assertEquals(ls.lengthOfLongestSubstring("pwwkew"), 3);
        Assert.assertEquals(ls.lengthOfLongestSubstring("au"), 2);
    }
}