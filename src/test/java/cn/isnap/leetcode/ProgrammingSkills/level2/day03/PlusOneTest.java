package cn.isnap.leetcode.ProgrammingSkills.level2.day03;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    public void plusOne() {
        Assert.assertArrayEquals(plusOne.plusOne(ArrayInput.asArray("[4,3,2,1]")),
                ArrayInput.asArray("[4,3,2,2]"));
        Assert.assertArrayEquals(plusOne.plusOne(ArrayInput.asArray("[9,9,9]")),
                ArrayInput.asArray("[1,0,0,0]"));
    }
}