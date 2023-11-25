package cn.isnap.leetcode.backtrack;

import org.junit.Test;
import org.testng.Assert;

public class CountNumbersWithUniqueDigitsTest {

  @Test
  public void countNumbersWithUniqueDigits() {
    Assert.assertEquals(CountNumbersWithUniqueDigits.countNumbersWithUniqueDigits(2), 91);
    Assert.assertEquals(CountNumbersWithUniqueDigits.countNumbersWithUniqueDigits(3), 739);
  }
}