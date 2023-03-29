package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClosestDessertCostTest {
  ClosestDessertCost closestDessertCost = new ClosestDessertCost();

  @Test
  public void closestCost() {
    Assert.assertEquals(closestDessertCost.closestCost(ArrayInput.asArray("[2,3]"),
        ArrayInput.asArray("[4,5,100]"), 18), 17);
    Assert.assertEquals(closestDessertCost.closestCost(ArrayInput.asArray("[3,10]"),
        ArrayInput.asArray("[2,5]"), 9), 8);
  }
}