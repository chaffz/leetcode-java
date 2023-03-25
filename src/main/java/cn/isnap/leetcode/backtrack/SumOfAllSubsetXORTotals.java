package cn.isnap.leetcode.backtrack;

public class SumOfAllSubsetXORTotals {
  public int subsetXORSum(int[] nums) {
    return subsetXORSum(0, nums, 0);
  }

  private int subsetXORSum(int sum, int[] nums, int start) {
    if (start >= nums.length) {
      return sum;
    }

    int pick = subsetXORSum(sum ^ nums[start], nums, start + 1);
    int notPick = subsetXORSum(sum, nums, start + 1);
    return pick + notPick;
  }
}
