package cn.isnap.leetcode.backtrack;

import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.*;

public class CountNumbersWithUniqueDigitsTest {
  CountNumbersWithUniqueDigits countNumbersWithUniqueDigits = new CountNumbersWithUniqueDigits();

  @Test
  public void countNumbersWithUniqueDigits() {
    Assert.assertEquals(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(2), 91);
    Assert.assertEquals(countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(3), 739);
  }
}