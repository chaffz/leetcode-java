package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersWithSameConsecutiveDifferencesTest {
  NumbersWithSameConsecutiveDifferences consecutiveDifferences = new NumbersWithSameConsecutiveDifferences();

  @Test
  public void numsSameConsecDiff() {
    Assert.assertArrayEquals(consecutiveDifferences.numsSameConsecDiff(3, 7), ArrayInput.asArray("[181,292,707,818,929]"));
  }
}