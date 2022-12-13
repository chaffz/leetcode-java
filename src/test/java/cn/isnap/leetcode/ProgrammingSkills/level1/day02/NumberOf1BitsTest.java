package cn.isnap.leetcode.ProgrammingSkills.level1.day02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOf1BitsTest {
    NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @Test
    public void hammingWeight() {
        int n = 0b00000000000000000000000000001011;
        Assert.assertEquals(numberOf1Bits.hammingWeight(n), 3);
        n = 0b11111111111111111111111111111101;
        Assert.assertEquals(numberOf1Bits.hammingWeight(n), 31);
    }
}