package cn.isnap.leetcode.algorithm.level2.day11;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {
    GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    public void generateParenthesis() {
        Assert.assertEquals(generateParentheses.generateParenthesis(3).toString().replaceAll(" ", ""),
                "[\"((()))\",\"(()())\",\"(())()\",\"()(())\",\"()()()\"]");
    }
}