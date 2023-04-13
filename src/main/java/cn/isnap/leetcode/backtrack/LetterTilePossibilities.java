package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

  public int numTilePossibilities(String tiles) {
    char[] chars = tiles.toCharArray();
    boolean[] visited = new boolean[chars.length];
    StringBuilder sb = new StringBuilder();
    Set<String> dup = new HashSet<>();
    numTilePossibilities(dup, sb, visited, chars, 0);
    return dup.size();
  }

  private void numTilePossibilities(Set<String> dup, StringBuilder sb, boolean[] visited, char[] chars, int index) {
    if (index >= chars.length) {
      return;
    }


    for (int i = 0; i < chars.length; i++) {
      if (visited[i]) {
        continue;
      }
      visited[i] = true;
      sb.append(chars[i]);
      dup.add(sb.toString());
      numTilePossibilities(dup, sb, visited, chars, i);
      sb.setLength(sb.length() - 1);
      visited[i] = false;
    }
  }
}
