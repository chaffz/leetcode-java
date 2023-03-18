package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSplitOfPositiveEvenIntegersTest {
    MaximumSplitOfPositiveEvenIntegers positiveEvenIntegers = new MaximumSplitOfPositiveEvenIntegers();

    @Test
    public void maximumEvenSplit() {
        Assert.assertEquals(positiveEvenIntegers.maximumEvenSplit(12).toString(), "[2, 4, 6]");
    }
}