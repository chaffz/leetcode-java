package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchsticksToSquareTest {
  MatchsticksToSquare matchsticksToSquare = new MatchsticksToSquare();

  @Test
  public void makesquare() {
    Assert.assertTrue(matchsticksToSquare.makesquare(ArrayInput.asArray("[1,1,2,2,2]")));
    Assert.assertFalse(matchsticksToSquare.makesquare(ArrayInput.asArray("[3,3,3,3,4]")));
    Assert.assertTrue(matchsticksToSquare.makesquare(ArrayInput.asArray("[5,5,5,5,4,4,4,4,3,3,3,3]")));
    Assert.assertFalse(matchsticksToSquare.makesquare(ArrayInput.asArray("[10,6,5,5,5,3,3,3,2,2,2,2]")));
  }
}