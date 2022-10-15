package cn.isnap.leetcode.lc75.level1.day12;

import org.junit.Assert;
import org.junit.Test;

public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void characterReplacement() {
        LongestRepeatingCharacterReplacement lr = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(lr.characterReplacement("AABABBA", 1), 4);
        Assert.assertEquals(lr.characterReplacement("AAAA", 0), 4);
    }
}