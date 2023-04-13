package cn.isnap.leetcode.backtrack;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class NumbersWithSameConsecutiveDifferences {


  public int[] numsSameConsecDiff(int n, int k) {
    TreeSet<Integer> result = new TreeSet<>();
    for (int i = 1; i <= 9; i++) {
      numsSameConsecDiff(result, n - 1, k, i, i);
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public void numsSameConsecDiff(TreeSet<Integer> result, int n, int k, int prev, int num) {
    if (n == 0) {
      result.add(num);
      return;
    }

    if ((prev + k) < 10) {
      int diff = prev + k;
      numsSameConsecDiff(result, n - 1, k, diff, num * 10 + diff);
    }
    if ((prev - k) >= 0) {
      int diff = prev - k;
      numsSameConsecDiff(result, n - 1, k, diff, num * 10 + diff);
    }
  }
}
