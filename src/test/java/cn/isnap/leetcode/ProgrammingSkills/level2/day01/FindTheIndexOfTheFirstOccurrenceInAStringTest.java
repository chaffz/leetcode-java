package cn.isnap.leetcode.ProgrammingSkills.level2.day01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    FindTheIndexOfTheFirstOccurrenceInAString occurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    public void strStr() {
        Assert.assertEquals(occurrenceInAString.strStr("sadbutsad", "sad"), 0);
        Assert.assertEquals(occurrenceInAString.strStr("leetcode", "leeto"), -1);
        Assert.assertEquals(occurrenceInAString.strStr("hello", "ll"), 2);
        Assert.assertEquals(occurrenceInAString.strStr("a", "a"), 0);
    }
}