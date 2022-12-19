package cn.isnap.leetcode.ProgrammingSkills.level1.day08;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDifferenceTest {
    FindTheDifference findTheDifference = new FindTheDifference();

    @Test
    public void findTheDifference() {
        Assert.assertEquals(findTheDifference.findTheDifference("abcd", "abcde"), 'e');
    }
}