package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SumOfAllSubsetXORTotals {
  int result = 0;
  public int subsetXORSum(int[] nums) {
    List<Integer> path = new LinkedList<>();
    subsetXORSum(path, nums, 0);
    return result;
  }

  private void subsetXORSum(List<Integer> path, int[] nums, int start) {
    if (start >= nums.length) {
      int xor = 0;
      for (final Integer integer : path) {
        xor ^= integer;
      }
      result += xor;
      return;
    }
    subsetXORSum(path, nums, start + 1);
    path.add(nums[start]);
    subsetXORSum(path, nums, start + 1);
    path.remove(path.size() - 1);
  }
}
