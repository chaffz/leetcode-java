package cn.isnap.leetcode.backtrack;

public class SplittingAStringIntoDescendingConsecutiveValues {
  public boolean splitString(String s) {
    return decreasing(s, -1, 0, 0);
  }

  private boolean decreasing(String s, long prev, int index, int count) {
    if (index >= s.length()) {
      return count >= 2;
    }
    long cur = 0;
    for (int i = index; i < s.length(); i++) {
      cur = cur * 10 + (s.charAt(i) - '0');

      if (prev == -1 || (prev - cur) == 1) {
        if (decreasing(s, cur, i + 1, count + 1)) {
          return true;
        }
      }
    }
    return false;
  }
}
