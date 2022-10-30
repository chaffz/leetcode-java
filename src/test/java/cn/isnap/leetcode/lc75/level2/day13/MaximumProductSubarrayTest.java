package cn.isnap.leetcode.lc75.level2.day13;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubarrayTest {

    @Test
    public void maxProduct() {
        MaximumProductSubarray mps = new MaximumProductSubarray();
        Assert.assertEquals(mps.maxProduct(new int[]{2, 3, -2, 4}), 6);
    }
}