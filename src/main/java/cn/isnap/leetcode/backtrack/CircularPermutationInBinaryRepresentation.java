package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CircularPermutationInBinaryRepresentation {
  public List<Integer> circularPermutation(int n, int start) {
    List<Integer> result = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();
    result.add(start);
    visited.add(start);
    int max = (int) (Math.pow(2, n));
    circularPermutation(result, visited, n, start, max);
    return result;
  }

  public boolean circularPermutation(List<Integer> result, Set<Integer> visited, int n, int start, int max) {
    if (result.size() == max) {
      return true;
    }

    for (int i = 0; i < n; i++) {
      int t = start ^ (1 << i);
      if (visited.contains(t)) {
        continue;
      }

      visited.add(t);
      result.add(t);
      if (circularPermutation(result, visited, n, t, max)) {
        return true;
      }
      visited.remove(t);
      result.remove(result.size() - 1);
    }
    return false;
  }
}
