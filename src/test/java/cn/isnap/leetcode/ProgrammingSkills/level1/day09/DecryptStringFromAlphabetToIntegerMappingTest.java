package cn.isnap.leetcode.ProgrammingSkills.level1.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptStringFromAlphabetToIntegerMappingTest {
    DecryptStringFromAlphabetToIntegerMapping alphabetToIntegerMapping = new DecryptStringFromAlphabetToIntegerMapping();

    @Test
    public void freqAlphabets() {
        Assert.assertEquals(alphabetToIntegerMapping.freqAlphabets("10#11#12"), "jkab");
        Assert.assertEquals(alphabetToIntegerMapping.freqAlphabets("19"), "ai");
    }
}