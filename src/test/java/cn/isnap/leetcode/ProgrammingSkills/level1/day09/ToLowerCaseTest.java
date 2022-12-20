package cn.isnap.leetcode.ProgrammingSkills.level1.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCaseTest {
    ToLowerCase lowerCase = new ToLowerCase();

    @Test
    public void toLowerCase() {
        Assert.assertEquals(lowerCase.toLowerCase("Hello"), "hello");
    }
}