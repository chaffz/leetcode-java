package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class TheNumberOfBeautifulSubsets {
  public int beautifulSubsets(int[] nums, int k) {
    return beautifulSubsets(new ArrayList<>(), nums, k, 0, 0);
  }

  private int beautifulSubsets(List<Integer> subset, int[] nums, int k, int count, int index) {
    if (index >= nums.length) return count;
    boolean beautiful = true;
    if (!subset.isEmpty()) {
      for (final Integer i : subset) {
        if (Math.abs(i - nums[index]) == k) {
          beautiful = false;
          break;
        }
      }
    }
    if (beautiful) {
      subset.add(nums[index]);
      count++;
      count = beautifulSubsets(subset, nums, k, count, index + 1);
      subset.remove(subset.size() - 1);
    }
    count = beautifulSubsets(subset, nums, k, count, index + 1);

    return count;
  }
}
