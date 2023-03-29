package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumCompatibilityScoreSumTest {
  MaximumCompatibilityScoreSum maximumCompatibilityScoreSum = new MaximumCompatibilityScoreSum();

  @Test
  public void maxCompatibilitySum() {
    // students = [[1,1,0],[1,0,1],[0,0,1]], mentors = [[1,0,0],[0,0,1],[1,1,0]]
    int[][] students = ArrayInput.as2DArray("[[1,1,0],[1,0,1],[0,0,1]]");
    int[][] mentors = ArrayInput.as2DArray("[[1,0,0],[0,0,1],[1,1,0]]");
    int compatibilitySum = maximumCompatibilityScoreSum.maxCompatibilitySum(students, mentors);
    Assert.assertEquals(compatibilitySum, 8);
  }
}