package cn.isnap.leetcode.ProgrammingSkills.level1.day06;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfAllOddLengthSubarraysTest {
    SumOfAllOddLengthSubarrays sumOfAllOddLengthSubarrays = new SumOfAllOddLengthSubarrays();

    @Test
    public void sumOddLengthSubarrays() {
        Assert.assertEquals(sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(
                ArrayInput.asArray("[1,4,2,5,3]")
        ), 58);
    }
}