package cn.isnap.leetcode.backtrack;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConstructTheLexicographicallyLargestValidSequence {
  public int[] constructDistancedSequence(int n) {
    boolean[] used = new boolean[n + 1];
    int[] sequence = new int[2 * n - 1];
    constructDistancedSequence(sequence, used, 0, n);
    return sequence;
  }

  private boolean constructDistancedSequence(int[] sequence, boolean[] used, int index, int n) {
    if (index == sequence.length) {
      return true;
    }
    if (sequence[index] != 0) {
      return constructDistancedSequence(sequence, used, index + 1, n);
    }
    for (int num = n; num > 0; num--) {
      if (used[num]) {
        continue;
      }
      if (num == 1 || (num + index) < sequence.length && sequence[num + index] == 0) {
        used[num] = true;
        sequence[index] = num;
        if (num != 1) {
          sequence[num + index] = num;
        }

        if (constructDistancedSequence(sequence, used, index + 1, n)) {
          System.out.println(Arrays.stream(sequence).map(Integer::new).boxed().collect(Collectors.toList()));
          return true;
        }

        used[num] = false;
        sequence[index] = 0;
        if (num != 1) {
          sequence[num + index] = 0;
        }
      }
    }

    return false;
  }
}
