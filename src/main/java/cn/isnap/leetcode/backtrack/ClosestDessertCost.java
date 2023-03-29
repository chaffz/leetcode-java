package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.Set;

public class ClosestDessertCost {
  public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
    int closest = Integer.MAX_VALUE, diff = Integer.MAX_VALUE, abs;
    Set<Integer> costs = new HashSet<>();
    for (final int baseCost : baseCosts) {
      closestCost(costs, baseCost, toppingCosts, 0);
    }
    for (final Integer cost : costs) {
      abs = Math.abs(cost - target);
      if (abs < diff) {
        diff = abs;
        closest = cost;
      } else if (abs == diff) {
        closest = Math.min(closest, cost);
      }
    }
    return closest;
  }

  private void closestCost(Set<Integer> costs, int base, int[] toppingCosts, int index) {
    if (index >= toppingCosts.length) {
      costs.add(base);
      return;
    }
    int topping;
    for (int i = 0; i <= 2; i++) {
      topping = toppingCosts[index] * i + base;
      closestCost(costs, topping, toppingCosts, index + 1);
    }
  }
}
