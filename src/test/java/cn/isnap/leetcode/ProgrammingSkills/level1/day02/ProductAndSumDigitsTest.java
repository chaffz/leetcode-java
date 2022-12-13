package cn.isnap.leetcode.ProgrammingSkills.level1.day02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductAndSumDigitsTest {
    ProductAndSumDigits productAndSumDigits = new ProductAndSumDigits();

    @Test
    public void subtractProductAndSum() {
        Assert.assertEquals(productAndSumDigits.subtractProductAndSum(234), 15);
        Assert.assertEquals(productAndSumDigits.subtractProductAndSum(4421), 21);
    }
}