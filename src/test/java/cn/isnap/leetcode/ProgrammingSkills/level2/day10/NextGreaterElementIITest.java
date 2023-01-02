package cn.isnap.leetcode.ProgrammingSkills.level2.day10;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementIITest {
    NextGreaterElementII nextGreaterElementII = new NextGreaterElementII();

    @Test
    public void nextGreaterElements() {
        Assert.assertArrayEquals(nextGreaterElementII.nextGreaterElements(
                ArrayInput.asArray("[1,2,1]")),
                ArrayInput.asArray("[2,-1,2]"));
    }
}