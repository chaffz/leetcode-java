package cn.isnap.leetcode.DataStructure.level2.day01;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void majorityElement() {
        MajorityElement me = new MajorityElement();
        Assert.assertEquals(me.majorityElement(new int[]{3, 2, 3}), 3);
        Assert.assertEquals(me.majorityElement(new int[]{1, 2, 2, 1, 2, 2, 3, 2}), 2);
    }
}