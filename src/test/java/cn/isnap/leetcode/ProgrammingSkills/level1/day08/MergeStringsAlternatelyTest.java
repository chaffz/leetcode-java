package cn.isnap.leetcode.ProgrammingSkills.level1.day08;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringsAlternatelyTest {
    MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @Test
    public void mergeAlternately() {
        Assert.assertEquals(mergeStringsAlternately.mergeAlternately("ab", "pqrs"), "apbqrs");
    }
}