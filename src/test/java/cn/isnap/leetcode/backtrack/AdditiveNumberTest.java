package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

public class AdditiveNumberTest {
  AdditiveNumber additiveNumber = new AdditiveNumber();

  @Test
  public void isAdditiveNumber() {
//    Assert.assertTrue(additiveNumber.isAdditiveNumber("199100199"));
    Assert.assertFalse(additiveNumber.isAdditiveNumber("0235813"));
  }
}