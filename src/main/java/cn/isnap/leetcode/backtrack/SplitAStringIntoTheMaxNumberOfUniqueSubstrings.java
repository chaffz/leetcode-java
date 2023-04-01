package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.Set;

public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {
  public int maxUniqueSplit(String s) {
    Set<String> unique = new HashSet<>();
    return maxUniqueSplit(unique, s, 0);
  }

  private int maxUniqueSplit(Set<String> unique, String s, int index) {
    if (index >= s.length()) {
      return 0;
    }
    int curMax = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = index; i < s.length(); i++) {
      String sub = sb.append(s.charAt(i)).toString();
      if (unique.contains(sub)) {
        continue;
      }
      unique.add(sub);
      int ret = maxUniqueSplit(unique, s, i + 1);
      curMax = Math.max(ret + 1, curMax);
      unique.remove(sub);
    }

    return curMax;
  }
}
