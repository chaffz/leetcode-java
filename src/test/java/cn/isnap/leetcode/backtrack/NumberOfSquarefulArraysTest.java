package cn.isnap.leetcode.backtrack;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfSquarefulArraysTest {
  NumberOfSquarefulArrays numberOfSquarefulArrays = new NumberOfSquarefulArrays();
  @Test
  public void numSquarefulPerms() {
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{1, 17, 8}), 2);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2, 2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2, 2, 2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}), 1);
    assertEquals(numberOfSquarefulArrays.numSquarefulPerms(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}), 1);
  }
}