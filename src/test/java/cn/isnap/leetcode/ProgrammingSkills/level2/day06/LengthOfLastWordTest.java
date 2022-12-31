package cn.isnap.leetcode.ProgrammingSkills.level2.day06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void lengthOfLastWord() {
        Assert.assertEquals(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"), 6);
        Assert.assertEquals(lengthOfLastWord.lengthOfLastWord("a"), 1);
        Assert.assertEquals(lengthOfLastWord.lengthOfLastWord("a "), 1);
    }
}