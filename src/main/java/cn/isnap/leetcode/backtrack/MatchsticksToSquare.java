package cn.isnap.leetcode.backtrack;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MatchsticksToSquare {
  public boolean makesquare(int[] matchsticks) {
    int sum = 0;
    for (final int matchstick : matchsticks) {
      sum += matchstick;
    }

    if (sum % 4 != 0) {
      return false;
    }
    int side = sum / 4;
    boolean[] visited = new boolean[matchsticks.length];
    int[] targets = new int[4];
    Arrays.sort(matchsticks);
    return makesquare(matchsticks, visited, side, targets);
  }

  private boolean makesquare(int[] matchsticks, boolean[] visited, int side, int[] targets) {
    System.out.println(Arrays.stream(targets).boxed().collect(Collectors.toList()));
    if (maked(side, targets)) {
      return true;
    }

    for (int i = 0; i < matchsticks.length; i++) {
      if (visited[i]) {
        continue;
      }
      visited[i] = true;
      for (int j = 0; j < 4; j++) {
        if ((targets[j] + matchsticks[i]) > side) {
          continue;
        }
        int[] back = Arrays.copyOf(targets, targets.length);
        back[j] += matchsticks[i];
        if (makesquare(matchsticks, visited, side, back)) {
          return true;
        }
      }
      visited[i] = false;
    }
    return false;
  }

  private boolean maked(final int side, final int[] targets) {
    boolean result = true;
    for (final int target : targets) {
      if (target != side) {
        result = false;
        break;
      }
    }

    return result;
  }
}
