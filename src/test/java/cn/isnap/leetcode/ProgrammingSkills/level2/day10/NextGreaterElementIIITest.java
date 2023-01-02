package cn.isnap.leetcode.ProgrammingSkills.level2.day10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElementIIITest {
    NextGreaterElementIII nextGreaterElementIII = new NextGreaterElementIII();

    @Test
    public void nextGreaterElement() {
        Assert.assertEquals(nextGreaterElementIII.nextGreaterElement(12), 21);
        Assert.assertEquals(nextGreaterElementIII.nextGreaterElement(230241), 230412);
    }
}