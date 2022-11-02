package cn.isnap.leetcode.lc75.level2.day16;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

    @Test
    public void push() {
        MinStack obj = new MinStack();
        obj.push(100);
        obj.push(0);
        obj.push(-3);
        obj.push(1000);
        obj.pop();
        int param_3 = obj.top();
        Assert.assertEquals(param_3, -3);
        int param_4 = obj.getMin();
        Assert.assertEquals(param_4, -3);
    }
}