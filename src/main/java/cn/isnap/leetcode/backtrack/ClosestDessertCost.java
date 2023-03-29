package cn.isnap.leetcode.backtrack;

public class ClosestDessertCost {
  int closest = Integer.MAX_VALUE, diff = Integer.MAX_VALUE, abs;
  public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {

    for (final int baseCost : baseCosts) {
      closestCost(baseCost, target, toppingCosts, 0);
    }

    return closest;
  }

  private void closestCost(int cost, int target, int[] toppingCosts, int index) {
    if (index >= toppingCosts.length) {
      abs = Math.abs(cost - target);
      if (abs < diff) {
        diff = abs;
        closest = cost;
      } else if (abs == diff) {
        closest = Math.min(closest, cost);
      }
      return;
    }
    int topping;
    for (int i = 0; i <= 2; i++) {
      topping = toppingCosts[index] * i + cost;
      closestCost(topping, target, toppingCosts, index + 1);
    }
  }
}
