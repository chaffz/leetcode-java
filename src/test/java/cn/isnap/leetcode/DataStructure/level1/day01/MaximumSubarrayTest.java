package cn.isnap.leetcode.DataStructure.level1.day01;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray ms = new MaximumSubarray();
        Assert.assertEquals(ms.maxSubArray(nums), 6);
    }
}