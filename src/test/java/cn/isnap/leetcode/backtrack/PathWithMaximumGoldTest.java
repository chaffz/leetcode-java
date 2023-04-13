package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class PathWithMaximumGoldTest {
  PathWithMaximumGold maximumGold = new PathWithMaximumGold();

  @Test
  public void getMaximumGold() {
    Assert.assertEquals(maximumGold.getMaximumGold(ArrayInput.as2DArray("[[0,6,0],[5,8,7],[0,9,0]]")), 24);
    Assert.assertEquals(maximumGold.getMaximumGold(ArrayInput.as2DArray("[[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1]]")), 25);
  }
}