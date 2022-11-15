package cn.isnap.leetcode.DataStructure.level1.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        String s = "()[]{}";
        ValidParentheses vp = new ValidParentheses();
        Assert.assertTrue(vp.isValid(s));
    }
}