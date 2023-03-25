package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfAllSubsetXORTotalsTest {
  SumOfAllSubsetXORTotals xorTotals = new SumOfAllSubsetXORTotals();

  @Test
  public void subsetXORSum() {
    Assert.assertEquals(xorTotals.subsetXORSum(ArrayInput.asArray("[5,1,6]")), 28);
  }
}