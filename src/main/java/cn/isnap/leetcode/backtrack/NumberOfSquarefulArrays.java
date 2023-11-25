package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfSquarefulArrays {
  public int numSquarefulPerms(int[] A) {
    boolean[] used = new boolean[A.length];
    Arrays.sort(A);
    Set<List<Integer>> result = new HashSet<>();
    dfs(A, used, new ArrayList<>(), result);
    return result.size();
  }

  private void dfs(int[] A, boolean[] used, List<Integer> path, Set<List<Integer>> result ) {
    if (path.size() > 1 && !isSquare(path.get(path.size() - 1) + path.get(path.size() - 2)))
      return;
    if (path.size() == A.length) {
      result.add(path);
      return;
    }

    for (int i = 0; i < A.length; ++i) {
      if (used[i])
        continue;
      if (i > 0 && A[i] == A[i - 1] && !used[i - 1])
        continue;
      used[i] = true;
      path.add(A[i]);
      dfs(A, used, path, result);
      path.remove(path.size() - 1);
      used[i] = false;
    }
  }

  private boolean isSquare(int num) {
    int root = (int) Math.sqrt(num);
    return root * root == num;
  }
}
