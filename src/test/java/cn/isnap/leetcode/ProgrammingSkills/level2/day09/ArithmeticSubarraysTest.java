package cn.isnap.leetcode.ProgrammingSkills.level2.day09;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class ArithmeticSubarraysTest {
    ArithmeticSubarrays arithmeticSubarrays = new ArithmeticSubarrays();

    @Test
    public void checkArithmeticSubarrays() {
        Assert.assertEquals(arithmeticSubarrays.checkArithmeticSubarrays(
                ArrayInput.asArray("[4,6,5,9,3,7]"),
                ArrayInput.asArray("[0,0,2]"),
                ArrayInput.asArray("[2,3,5]")
        ).toString(), "[true, false, true]");
    }
}