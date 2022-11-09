package cn.isnap.leetcode.DataStructure.level1.day03;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStock bs = new BestTimeToBuyAndSellStock();
        Assert.assertEquals(bs.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
    }
}