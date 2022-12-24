package cn.isnap.leetcode.ProgrammingSkills.level2.day01;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicArrayTest {
    MonotonicArray monotonicArray = new MonotonicArray();

    @Test
    public void isMonotonic() {
        Assert.assertTrue(monotonicArray.isMonotonic(ArrayInput.asArray("[1,2,2,3]")));
        Assert.assertTrue(monotonicArray.isMonotonic(ArrayInput.asArray("[6,5,4,4]")));
    }
}