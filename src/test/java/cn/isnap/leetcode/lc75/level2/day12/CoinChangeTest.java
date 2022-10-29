package cn.isnap.leetcode.lc75.level2.day12;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {

    @Test
    public void coinChange() {
        CoinChange cc = new CoinChange();
        Assert.assertEquals(cc.coinChange(new int[]{1, 2, 5}, 11), 3);
        Assert.assertEquals(cc.coinChange2(new int[]{1, 2, 5}, 11), 3);
    }
}