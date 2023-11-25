package cn.isnap.leetcode.backtrack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AmbiguousCoordinates {
  public List<String> ambiguousCoordinates(String s) {
    List<String> result = new LinkedList<>();
    Set<String> visited = new HashSet<>();
    s = s.substring(1, s.length() - 1);
    ambiguousCoordinates(result, visited, s, 1);
    return result;
  }

  private void ambiguousCoordinates(List<String> result, Set<String> visited, String s, int split) {
    if (split > s.length() - 1) {
      return;
    }
    String left = s.substring(0, split);
    String right = s.substring(split);
    int point = 0;
    while (point < left.length()) {
      StringBuilder stringBuffer = new StringBuilder(left);
      if (point != 0) {
        stringBuffer.insert(point, ".");
      }
      double[] values = new double[2];
      values[0] = Double.parseDouble(stringBuffer.toString());
      values[1] = Double.parseDouble(right);
      String key = values[0] + "," + values[1];
      if (!visited.contains(key)) {
        String val = String.format("(%s, %s)", stringBuffer, right);
        visited.add(key);
        result.add(val);
      }
      point++;
    }

    point = 0;
    while (point < right.length()) {
      StringBuilder stringBuffer = new StringBuilder(right);
      if (point != 0) {
        stringBuffer.insert(point, ".");
      }
      Double[] values = new Double[2];
      values[0] = Double.parseDouble(left);
      values[1] = Double.parseDouble(stringBuffer.toString());
      String key = values[0] + "," + values[1];
      if (!visited.contains(key)) {
        String val = String.format("(%s, %s)", left, stringBuffer);
        visited.add(key);
        result.add(val);
      }
      point++;
    }
    ambiguousCoordinates(result, visited, s, split + 1);
  }
}
