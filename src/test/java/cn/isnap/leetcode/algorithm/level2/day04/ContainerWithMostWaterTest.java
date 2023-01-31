package cn.isnap.leetcode.algorithm.level2.day04;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void maxArea() {
        Assert.assertEquals(containerWithMostWater.maxArea(ArrayInput.asArray("[1,8,6,2,5,4,8,3,7]")), 49);
    }
}