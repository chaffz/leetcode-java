package cn.isnap.leetcode.ProgrammingSkills.level1.day05;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElementITest {
    NextGreaterElementI nextGreaterElement = new NextGreaterElementI();

    @Test
    public void nextGreaterElement() {
        Assert.assertArrayEquals(nextGreaterElement.nextGreaterElement(
                ArrayInput.asArray("[4,1,2]"),
                ArrayInput.asArray("[1,3,4,2]")), ArrayInput.asArray("[-1,3,-1]"));
        Assert.assertArrayEquals(nextGreaterElement.nextGreaterElement(
                ArrayInput.asArray("[2,4]"),
                ArrayInput.asArray("[1,2,3,4]")), ArrayInput.asArray("[3,-1]"));
    }
}