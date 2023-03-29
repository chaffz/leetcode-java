package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheNumberOfBeautifulSubsetsTest {
  TheNumberOfBeautifulSubsets beautifulSubsets = new TheNumberOfBeautifulSubsets();

  @Test
  public void beautifulSubsets() {
    Assert.assertEquals(beautifulSubsets.beautifulSubsets(ArrayInput.asArray("[2,4,6]"), 2), 4);
    Assert.assertEquals(beautifulSubsets.beautifulSubsets(ArrayInput.asArray("[1]"), 1), 1);
  }
}