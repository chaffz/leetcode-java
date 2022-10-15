package cn.isnap.leetcode.lc75.level1.day13;

import org.junit.Assert;
import org.junit.Test;

public class BullsAndCowsTest {

    @Test
    public void getHint() {
        BullsAndCows bc = new BullsAndCows();
        Assert.assertEquals(bc.getHint("18077", "78107"), "2A3B");
        Assert.assertEquals(bc.getHint("1123", "0111"), "1A1B");
        Assert.assertEquals(bc.getHint("1122", "1222"), "3A0B");
    }
}