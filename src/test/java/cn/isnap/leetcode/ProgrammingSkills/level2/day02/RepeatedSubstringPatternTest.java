package cn.isnap.leetcode.ProgrammingSkills.level2.day02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedSubstringPatternTest {
    RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();

    @Test
    public void repeatedSubstringPattern() {
        Assert.assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abcabc"));
        Assert.assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("abcab"));
        Assert.assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("bb"));
    }
}