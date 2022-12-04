package cn.isnap.leetcode.DataStructure.level2.day14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumRemoveToMakeValidParenthesesTest {
    MinimumRemoveToMakeValidParentheses validParentheses = new MinimumRemoveToMakeValidParentheses();

    @Test
    public void minRemoveToMakeValid() {
//        Assert.assertEquals(validParentheses.minRemoveToMakeValid("lee(t(c)o)de)"), "lee(t(c)o)de");
        Assert.assertEquals(validParentheses.minRemoveToMakeValid("))(("), "");
        Assert.assertEquals(validParentheses.minRemoveToMakeValid(")leetcode"), "leetcode");
    }
}