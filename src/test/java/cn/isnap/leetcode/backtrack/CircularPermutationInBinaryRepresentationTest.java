package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

public class CircularPermutationInBinaryRepresentationTest {
  CircularPermutationInBinaryRepresentation binaryRepresentation = new CircularPermutationInBinaryRepresentation();

  @Test
  public void circularPermutation() {
    Assert.assertEquals(binaryRepresentation.circularPermutation(2, 3).toString().replaceAll(" ", ""), "[3,2,0,1]");
    Assert.assertEquals(binaryRepresentation.circularPermutation(3, 2).toString().replaceAll(" ", ""), "[2,3,1,0,4,5,7,6]");
  }
}