package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TheKthLexicographicalStringOfAllHappyStringsOfLengthN {
  final char[] chars = new char[]{'a', 'b', 'c'};
  List<String> happies = new LinkedList<>();
  Set<String> visited = new HashSet<>();

  public String getHappyString(int n, int k) {
    for (int i = 0; i < chars.length; i++) {
      char[] sb = new char[n];
      sb[0] = chars[i];
      if (getHappyString(sb, n, k, 0)) {
        return happies.get(k - 1);
      }
    }
    return "";
  }

  public boolean getHappyString(char[] sb, int n, int k, int index) {
    if (index == n - 1) {
      String cur = new String(sb);
      if (!visited.contains(cur)) {
        visited.add(cur);
        happies.add(cur);
      }
      return visited.size() >= k;
    }

    for (int i = index + 1; i < sb.length; i++) {
      for (final char aChar : chars) {
        if (aChar != sb[i - 1]) {
          sb[i] = aChar;
          if (getHappyString(sb, n, k, i)) {
            return true;
          }
        }
      }
    }

    return false;
  }
}
