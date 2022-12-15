package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {
    HappyNumber happyNumber = new HappyNumber();

    @Test
    public void isHappy() {
        Assert.assertTrue(happyNumber.isHappy(19));
        Assert.assertFalse(happyNumber.isHappy(2));
    }
}