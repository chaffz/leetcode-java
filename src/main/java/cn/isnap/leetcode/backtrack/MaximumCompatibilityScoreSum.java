package cn.isnap.leetcode.backtrack;

public class MaximumCompatibilityScoreSum {
  public int maxCompatibilitySum(int[][] students, int[][] mentors) {
    boolean[] used = new boolean[mentors.length];
    return maxCompatibilitySum(students, mentors, 0, used);
  }

  private int maxCompatibilitySum(int[][] students, int[][] mentors, int index, boolean[] used) {
    if (index >= mentors.length) {
      return 0;
    }

    int max = 0;
    for (int i = 0; i < mentors.length; i++) {
      if (used[i]) {
        continue;
      }
      used[i] = true;
      int matched = same(students[index], mentors[i]);
      int pick = matched + maxCompatibilitySum(students, mentors, index + 1, used);
      used[i] = false;
      max = Math.max(pick, max);
    }

    return max;
  }

  private int same(int[] student, int[] mentor) {
    int matched = 0;
    for (int i = 0; i < student.length; i++) {
      if (mentor[i] == student[i]) {
        matched++;
      }
    }
    return matched;
  }
}
