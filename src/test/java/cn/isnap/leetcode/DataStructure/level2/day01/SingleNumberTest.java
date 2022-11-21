package cn.isnap.leetcode.DataStructure.level2.day01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber sn = new SingleNumber();
        Assert.assertEquals(sn.singleNumber(new int[]{2, 2, 1}), 1);
        Assert.assertEquals(sn.singleNumber(new int[]{2, 2, 1, 1, 3}), 3);
    }
}