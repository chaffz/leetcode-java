package cn.isnap.leetcode.backtrack;

import java.util.LinkedList;
import java.util.List;

public class SplitArrayIntoFibonacciSequence {
  public List<Integer> splitIntoFibonacci(String num) {
    List<Integer> result = new LinkedList<>();
    splitIntoFibonacci(result, num, 0);
    return result;
  }

  private boolean splitIntoFibonacci(List<Integer> result, String num, int index) {
    if (index >= num.length()) {
      return result.size() > 2;
    }

    int N = 0, C, SZ = result.size();
    for (int i = index; i < num.length(); i++) {
      if (i > index && num.charAt(index) == '0') {
        return false;
      }
      C = num.charAt(i) - '0';
      N = N * 10 + C;
      if (N < 0) {
        return false;
      }

      if (SZ < 2 || (result.get(SZ - 1) + result.get(SZ - 2)) == N) {
        result.add(N);
        if (splitIntoFibonacci(result, num, i + 1)) {
          return true;
        }
        result.remove(result.size() - 1);
      }
    }

    return false;
  }
}
