package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ConstructTheLexicographicallyLargestValidSequenceTest {
  ConstructTheLexicographicallyLargestValidSequence validSequence = new ConstructTheLexicographicallyLargestValidSequence();

  @Test
  public void constructDistancedSequence() {
    int[] ret = validSequence.constructDistancedSequence(5);
    System.out.println(Arrays.stream(ret).map(Integer::new).boxed().collect(Collectors.toList()));
    Assert.assertArrayEquals(ret, ArrayInput.asArray("[5, 3, 1, 4, 3, 5, 2, 4, 2]"));

    ret = validSequence.constructDistancedSequence(3);
    System.out.println(Arrays.stream(ret).map(Integer::new).boxed().collect(Collectors.toList()));
    Assert.assertArrayEquals(ret, ArrayInput.asArray("[3, 1, 2, 3, 2]"));

    ret = validSequence.constructDistancedSequence(13);
    System.out.println(Arrays.stream(ret).map(Integer::new).boxed().collect(Collectors.toList()));
    Assert.assertArrayEquals(ret, ArrayInput.asArray("[13, 11, 12, 8, 6, 4, 9, 10, 1, 4, 6, 8, 11, 13, 12, 9, 7, 10, 3, 5, 2, 3, 2, 7, 5]"));
  }
}