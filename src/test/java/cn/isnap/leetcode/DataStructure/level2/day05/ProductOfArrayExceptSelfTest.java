package cn.isnap.leetcode.DataStructure.level2.day05;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {
    static ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    public void productExceptSelf() {
        Assert.assertArrayEquals(productOfArrayExceptSelf.productExceptSelf(
                ArrayInput.asArray("[1,2,3,4]")), ArrayInput.asArray("[24,12,8,6]"));
        Assert.assertArrayEquals(productOfArrayExceptSelf.productExceptSelf(
                ArrayInput.asArray("[-1,1,0,-3,3]")), ArrayInput.asArray("[0,0,9,0,0]"));
    }
}