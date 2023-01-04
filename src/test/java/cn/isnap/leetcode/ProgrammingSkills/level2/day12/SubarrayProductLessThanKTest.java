package cn.isnap.leetcode.ProgrammingSkills.level2.day12;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SubarrayProductLessThanKTest {
    SubarrayProductLessThanK subarrayProductLessThanK = new SubarrayProductLessThanK();

    @Test
    public void numSubarrayProductLessThanK() {
        Assert.assertEquals(subarrayProductLessThanK.numSubarrayProductLessThanK(
                ArrayInput.asArray("[10,5,2,6]"), 100

        ), 8);

        // [10,9,10,4,3,8,3,3,6,2,10,10,9,3]
        Assert.assertEquals(subarrayProductLessThanK.numSubarrayProductLessThanK(
                ArrayInput.asArray("[10,9,10,4,3,8,3,3,6,2,10,10,9,3]"), 19

        ), 18);
    }
}