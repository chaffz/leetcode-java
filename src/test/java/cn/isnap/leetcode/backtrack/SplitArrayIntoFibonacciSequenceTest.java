package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplitArrayIntoFibonacciSequenceTest {
  SplitArrayIntoFibonacciSequence splitArrayIntoFibonacciSequence = new SplitArrayIntoFibonacciSequence();

  @Test
  public void splitIntoFibonacci() {
    Assert.assertEquals(splitArrayIntoFibonacciSequence.splitIntoFibonacci("123456579").toString(), "[123, 456, 579]");
    Assert.assertEquals(splitArrayIntoFibonacciSequence.splitIntoFibonacci("1101111").toString(), "[11, 0, 11, 11]");
    Assert.assertEquals(splitArrayIntoFibonacciSequence.splitIntoFibonacci("112358130").toString(), "[]");
    Assert.assertEquals(splitArrayIntoFibonacciSequence.splitIntoFibonacci("0123").toString(), "[]");
    Assert.assertEquals(splitArrayIntoFibonacciSequence.splitIntoFibonacci("5511816597").toString(), "[]");
    Assert.assertEquals(splitArrayIntoFibonacciSequence.splitIntoFibonacci("214748364721474836422147483641").toString(), "[]");
    Assert.assertEquals(splitArrayIntoFibonacciSequence.splitIntoFibonacci("539834657215398346785398346991079669377161950407626991734534318677529701785098211336528511").toString(), "[]");
  }
}