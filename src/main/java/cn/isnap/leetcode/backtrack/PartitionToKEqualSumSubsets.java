package cn.isnap.leetcode.backtrack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PartitionToKEqualSumSubsets {
  List<Integer> sub = new LinkedList<>();

  Map<List<Integer>, Boolean> memo = new HashMap<>();
  public boolean canPartitionKSubsets(int[] nums, int k) {
    int sum = 0;
    for (final int num : nums) {
      sum += num;
    }

    if (sum % k != 0) {
      return false;
    }

    boolean[] visited = new boolean[nums.length];
    return canPartitionKSubsets(visited, nums, k, sum / k, 0, 0);
  }

  public boolean canPartitionKSubsets(boolean[] visited, int[] nums, int k, int target, int pre, int index) {
    if (k == 1) {
      return true;
    }

    if (pre == target) {
      List<Integer> key = new LinkedList<>(sub);
      if (memo.containsKey(key)) {
        return memo.get(key);
      }
      boolean result = canPartitionKSubsets(visited, nums, k - 1, target, 0, 0);
      memo.put(key, result);
      return result;
    }
    for (int i = index; i < nums.length; i++) {
      if (visited[i]) {
        continue;
      }
      visited[i] = true;
      sub.add(nums[i]);
      if (canPartitionKSubsets(visited, nums, k, target, pre + nums[i], i + 1)) {
        return true;
      }
      if (sub.size() > 0) {
        sub.remove(sub.size() - 1);
      }
      visited[i] = false;
    }

    return false;
  }
}
