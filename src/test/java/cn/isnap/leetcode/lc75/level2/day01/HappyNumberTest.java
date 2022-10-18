package cn.isnap.leetcode.lc75.level2.day01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void isHappy() {
        HappyNumber hn = new HappyNumber();
        Assert.assertTrue(hn.isHappy(19));
        Assert.assertFalse(hn.isHappy(2));
    }
}