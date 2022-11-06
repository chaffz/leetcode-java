package cn.isnap.leetcode.lc75.level2.day20;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSumTest {

    @Test
    public void combinationSum() {
        CombinationSum cs = new CombinationSum();
        Assert.assertEquals(cs.combinationSum(new int[]{2, 3, 6, 7}, 7).toString(),
                "[[2, 2, 3], [7]]");
        Assert.assertEquals(cs.combinationSum(new int[]{8,7,4,3}, 11).toString(),
                "[[8, 3], [7, 4], [4, 4, 3]]");
    }
}