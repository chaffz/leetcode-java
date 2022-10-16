package cn.isnap.leetcode.lc75.level1.day14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeStringTest {

    @Test
    public void decodeString() {
        DecodeString ds = new DecodeString();
        Assert.assertEquals(ds.decodeString("2[a]3[b]"), "aabbb");
        Assert.assertEquals(ds.decodeString("a2[a]3[b]"), "aaabbb");
    }
}