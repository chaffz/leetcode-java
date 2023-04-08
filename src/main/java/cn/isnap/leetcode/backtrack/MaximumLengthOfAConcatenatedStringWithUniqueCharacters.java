package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
  public int maxLength(List<String> arr) {
    Set<Character> visited = new HashSet<>();
    return lengthOf(new StringBuilder(), visited, arr, 0);
  }

  private int lengthOf(StringBuilder builder, Set<Character> visited, List<String> arr, int index) {
    if (index >= arr.size()) {
      return builder.length();
    }

    String str = arr.get(index);
    if (appeared(str, visited)) {
      return lengthOf(builder, visited, arr, index + 1);
    } else {
      Set<Character> copied = new HashSet<>(visited);
      visitedChar(str, copied);
      StringBuilder nsb = new StringBuilder(builder);
      nsb.append(str);
      int pick = lengthOf(nsb, copied, arr, index + 1);
      int unpick = lengthOf(builder, visited, arr, index + 1);
      return Math.max(pick, unpick);
    }
  }

  private void visitedChar(final String str, final Set<Character> copied) {
    for (final char c : str.toCharArray()) {
      copied.add(c);
    }
  }

  private boolean appeared(String str, Set<Character> visited) {
    Set<Character> dup = new HashSet<>();
    char[] chars = str.toCharArray();
    for (final char aChar : chars) {
      if (visited.contains(aChar) || dup.contains(aChar)) {
        return true;
      }
      dup.add(aChar);
    }

    return false;
  }
}
