package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumberOfMaximumBitwiseORSubsetsTest {
    CountNumberOfMaximumBitwiseORSubsets bitwiseORSubsets = new CountNumberOfMaximumBitwiseORSubsets();

    @Test
    public void countMaxOrSubsets() {
        Assert.assertEquals(bitwiseORSubsets.countMaxOrSubsets(ArrayInput.asArray("[3,2,1,5]")), 6);
        Assert.assertEquals(bitwiseORSubsets.countMaxOrSubsets(ArrayInput.asArray("[2,2,2]")), 7);
    }
}