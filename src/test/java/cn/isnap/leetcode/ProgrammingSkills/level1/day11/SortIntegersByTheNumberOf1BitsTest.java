package cn.isnap.leetcode.ProgrammingSkills.level1.day11;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortIntegersByTheNumberOf1BitsTest {
    SortIntegersByTheNumberOf1Bits sortIntegersByTheNumberOf1Bits = new SortIntegersByTheNumberOf1Bits();

    @Test
    public void sortByBits() {
        Assert.assertArrayEquals(
                sortIntegersByTheNumberOf1Bits.sortByBits(ArrayInput.asArray("[0,1,2,3,4,5,6,7,8]")),
                ArrayInput.asArray("[0,1,2,4,8,3,5,6,7]"));
    }
}