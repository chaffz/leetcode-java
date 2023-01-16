package cn.isnap.leetcode.algorithm.level1.day03;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumIITest {
    TwoSumII twoSumII = new TwoSumII();

    @Test
    public void twoSum() {
        int[] nums = ArrayInput.asArray("[2,7,11,15]");
        Assert.assertArrayEquals(twoSumII.twoSum(nums, 9), ArrayInput.asArray("[1,2]"));
    }
}