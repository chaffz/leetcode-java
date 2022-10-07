package cn.isnap.leetcode.lc75.level1.day05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        int[] prices = new int[]{7,1,5,3,6,4};
        BestTimeToBuyAndSellStock bt = new BestTimeToBuyAndSellStock();
        Assert.assertEquals(bt.maxProfit(prices), 5);
    }
}