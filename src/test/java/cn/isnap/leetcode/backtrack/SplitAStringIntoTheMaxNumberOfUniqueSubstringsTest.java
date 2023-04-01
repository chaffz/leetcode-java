package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplitAStringIntoTheMaxNumberOfUniqueSubstringsTest {
  SplitAStringIntoTheMaxNumberOfUniqueSubstrings uniqueSubstrings = new SplitAStringIntoTheMaxNumberOfUniqueSubstrings();
  @Test
  public void maxUniqueSplit() {
    Assert.assertEquals(uniqueSubstrings.maxUniqueSplit("ababccc"), 5);
    Assert.assertEquals(uniqueSubstrings.maxUniqueSplit("wwwzfvedwfvhsww"), 11);
  }
}