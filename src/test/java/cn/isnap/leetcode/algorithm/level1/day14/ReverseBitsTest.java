package cn.isnap.leetcode.algorithm.level1.day14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitsTest {
    ReverseBits reverseBits = new ReverseBits();

    @Test
    public void reverseBits() {
//        Assert.assertEquals(reverseBits.reverseBits(
//                0b11111111111111111111111111111101), 0b10111111111111111111111111111111);
        // 00000010100101000001111010011100
        Assert.assertEquals(reverseBits.reverseBits(
                0b00000010100101000001111010011100), 0b00111001011110000010100101000000);
    }
}