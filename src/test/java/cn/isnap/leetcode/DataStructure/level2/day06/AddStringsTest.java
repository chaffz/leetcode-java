package cn.isnap.leetcode.DataStructure.level2.day06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddStringsTest {
    static AddStrings addStrings = new AddStrings();

    @Test
    public void addStrings() {
        Assert.assertEquals(addStrings.addStrings("456", "77"), "533");
    }
}