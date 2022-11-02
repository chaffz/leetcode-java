package cn.isnap.leetcode.lc75.level2.day16;

import org.junit.Assert;
import org.junit.Test;


public class MyQueueTest {

    @Test
    public void push() {
        MyQueue obj = new MyQueue();
        obj.push(10);
        int param_2 = obj.pop();
        Assert.assertEquals(param_2, 10);
        int param_3 = obj.peek();
        Assert.assertEquals(param_3, 0);
        boolean param_4 = obj.empty();
        Assert.assertTrue(param_4);
    }
}