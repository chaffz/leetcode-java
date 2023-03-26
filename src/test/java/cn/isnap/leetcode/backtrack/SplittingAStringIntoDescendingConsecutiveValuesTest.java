package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplittingAStringIntoDescendingConsecutiveValuesTest {
  SplittingAStringIntoDescendingConsecutiveValues descendingConsecutiveValues = new SplittingAStringIntoDescendingConsecutiveValues();

  @Test
  public void splitString() {
//    Assert.assertFalse(descendingConsecutiveValues.splitString("1234"));
//    Assert.assertTrue(descendingConsecutiveValues.splitString("050043"));
    Assert.assertTrue(descendingConsecutiveValues.splitString("1098765432"));
  }
}