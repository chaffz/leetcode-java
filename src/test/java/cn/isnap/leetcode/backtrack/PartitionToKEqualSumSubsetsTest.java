package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionToKEqualSumSubsetsTest {
  PartitionToKEqualSumSubsets equalSumSubsets = new PartitionToKEqualSumSubsets();

  @Test
  public void canPartitionKSubsets() {
    Assert.assertTrue(equalSumSubsets.canPartitionKSubsets(ArrayInput.asArray("[4,3,2,3,5,2,1]"), 4));
    Assert.assertFalse(equalSumSubsets.canPartitionKSubsets(ArrayInput.asArray("[1,2,3,4]"), 3));
    Assert.assertFalse(equalSumSubsets.canPartitionKSubsets(ArrayInput.asArray("[3,2,1,3,6,1,4,8,10,8,9,1,7,9,8,1]"), 9));
  }
}