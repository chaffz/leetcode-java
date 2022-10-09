package cn.isnap.leetcode.lc75.level1.day07;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstBadVersionTest {

    @Test
    public void firstBadVersion() {
        FirstBadVersion fbv = new FirstBadVersion();
        Assert.assertEquals(fbv.firstBadVersion(8), 3);
    }
}