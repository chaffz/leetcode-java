package cn.isnap.leetcode.lc75.level1.day15;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeightTest {

    @Test
    public void lastStoneWeight() {
        LastStoneWeight lsw = new LastStoneWeight();
        Assert.assertEquals(lsw.lastStoneWeight(new int[]{2,7,4,1,8,1}), 1);
        Assert.assertEquals(lsw.lastStoneWeight(new int[]{1}), 1);
    }
}