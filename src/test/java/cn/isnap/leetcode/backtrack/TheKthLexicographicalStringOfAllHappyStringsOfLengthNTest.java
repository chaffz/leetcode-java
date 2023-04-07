package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheKthLexicographicalStringOfAllHappyStringsOfLengthNTest {
  TheKthLexicographicalStringOfAllHappyStringsOfLengthN happyStringsOfLengthN
      = new TheKthLexicographicalStringOfAllHappyStringsOfLengthN();

  @Test
  public void getHappyString() {
    Assert.assertEquals(happyStringsOfLengthN.getHappyString(3, 9), "cab");
    Assert.assertEquals(happyStringsOfLengthN.getHappyString(10, 100), "abacacbaca");
  }
}