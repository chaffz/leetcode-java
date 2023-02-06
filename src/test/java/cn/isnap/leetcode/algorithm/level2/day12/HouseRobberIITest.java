package cn.isnap.leetcode.algorithm.level2.day12;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberIITest {
    HouseRobberII houseRobberII = new HouseRobberII();

    @Test
    public void rob() {
        int rob = houseRobberII.rob(ArrayInput.asArray("[1,3,1,3,100]"));
        Assert.assertEquals(rob, 103);
    }
}