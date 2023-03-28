package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FairDistributionOfCookiesTest {
  FairDistributionOfCookies fairDistributionOfCookies = new FairDistributionOfCookies();

  @Test
  public void distributeCookies() {
    Assert.assertEquals(fairDistributionOfCookies.distributeCookies(ArrayInput.asArray("[8,15,10,20,8]"), 2), 31);
  }
}