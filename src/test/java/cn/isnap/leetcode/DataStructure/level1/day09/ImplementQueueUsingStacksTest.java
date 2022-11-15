package cn.isnap.leetcode.DataStructure.level1.day09;

import cn.isnap.leetcode.lc75.level2.day16.MyQueue;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementQueueUsingStacksTest {

    @Test
    public void push() {
        ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
        obj.push(10);
        int param_2 = obj.pop();
        Assert.assertEquals(param_2, 10);
        int param_3 = obj.peek();
        Assert.assertEquals(param_3, 0);
        boolean param_4 = obj.empty();
        Assert.assertTrue(param_4);
    }
}