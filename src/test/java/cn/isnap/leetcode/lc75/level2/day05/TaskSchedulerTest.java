package cn.isnap.leetcode.lc75.level2.day05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskSchedulerTest {

    @Test
    public void leastInterval() {
        TaskScheduler ts = new TaskScheduler();
        Assert.assertEquals(ts.leastInterval("ABCDEABCDE".toCharArray(), 4), 10);
        Assert.assertEquals(ts.leastInterval("AAAAAABCDEFG".toCharArray(), 2), 16);
        Assert.assertEquals(ts.leastInterval("AAABBB".toCharArray(), 0), 6);
        Assert.assertEquals(ts.leastInterval("AAABBB".toCharArray(), 2), 8);
    }
}