package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterTilePossibilitiesTest {
  LetterTilePossibilities letterTilePossibilities = new LetterTilePossibilities();

  @Test
  public void numTilePossibilities() {
    Assert.assertEquals(letterTilePossibilities.numTilePossibilities("AAB"), 8);
  }
}