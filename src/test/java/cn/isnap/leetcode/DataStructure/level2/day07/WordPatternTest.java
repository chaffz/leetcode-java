package cn.isnap.leetcode.DataStructure.level2.day07;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordPatternTest {
    static WordPattern wordPattern = new WordPattern();

    @Test
    public void wordPattern() {
        Assert.assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));
        Assert.assertFalse(wordPattern.wordPattern("abba", "dog dog dog dog"));
        Assert.assertFalse(wordPattern.wordPattern("he", "unit"));
    }
}