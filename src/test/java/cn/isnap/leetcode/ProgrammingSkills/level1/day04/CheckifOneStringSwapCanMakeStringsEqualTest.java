package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckifOneStringSwapCanMakeStringsEqualTest {
    CheckifOneStringSwapCanMakeStringsEqual canMakeStringsEqual = new CheckifOneStringSwapCanMakeStringsEqual();

    @Test
    public void areAlmostEqual() {
//        Assert.assertTrue(canMakeStringsEqual.areAlmostEqual("kelb", "kelb"));
//        Assert.assertFalse(canMakeStringsEqual.areAlmostEqual("attack", "defend"));
//        Assert.assertTrue(canMakeStringsEqual.areAlmostEqual("bank", "kanb"));
//        Assert.assertFalse(canMakeStringsEqual.areAlmostEqual("hello", "olleh"));
//        Assert.assertFalse(canMakeStringsEqual.areAlmostEqual("abcd", "efgh"));
        Assert.assertFalse(canMakeStringsEqual.areAlmostEqual("npv", "zpn"));
    }
}