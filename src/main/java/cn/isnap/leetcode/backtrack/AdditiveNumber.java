package cn.isnap.leetcode.backtrack;

public class AdditiveNumber {
  public boolean isAdditiveNumber(String num) {
    return findIsAdditive(num, 0, -1, -1, 0);
  }

  private boolean findIsAdditive(String s, int index, long first, long second, int size) {
    //If we reach the end, check if we have more that 3 elements
    if (index >= s.length()) {
      return size >= 3;
    }
    //Handling the case where starting index is 0
    if (s.charAt(index) == '0') {
      if (size < 2 || first + second == 0) {
        return findIsAdditive(s, index + 1, second, 0, size + 1);
      }
      return false;
    }
    long num = 0;
    //For each new num, check if it is the sum of first and second.
    for (int i = index; i < s.length(); i++) {
      char c = s.charAt(i);
      num = num * 10 + (c - '0');
      //num < 0 implies that the data has overflown
      if (num < 0) {
        break;
      }
      if (size < 2 || first + second == num) {
        boolean possible = findIsAdditive(s, i + 1, second, num, size + 1);
        if (possible) {
          return true;
        }
      }
    }
    return false;
  }
}
