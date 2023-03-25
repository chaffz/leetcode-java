package cn.isnap.leetcode.backtrack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueBinaryString {
  String res = "";
  public String findDifferentBinaryString(String[] nums) {
    Set<String> appeared = Arrays.stream(nums).collect(Collectors.toSet());
    int len = nums[0].length();
    StringBuilder builder = new StringBuilder();
    findDifferentBinaryString(appeared, builder, len);
    return res;
  }

  private boolean findDifferentBinaryString(Set<String> appeared, StringBuilder builder, int count) {
    if (count <= 0) {
      if (!appeared.contains(builder.toString())) {
        res = builder.toString();
        return true;
      }
      return false;
    }
    StringBuilder sb = new StringBuilder(builder);
    sb.append(0);
    if (findDifferentBinaryString(appeared, sb, count - 1)) {
      return true;
    }
    sb = new StringBuilder(builder);
    sb.append(1);
    return findDifferentBinaryString(appeared, sb, count - 1);
  }
}
