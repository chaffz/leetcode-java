package cn.isnap.leetcode.algorithm.level1.day06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationInStringTest {
    PermutationInString permutationInString = new PermutationInString();

    @Test
    public void checkInclusion() {
        Assert.assertTrue(permutationInString.checkInclusion("adc", "dcda"));
    }
}