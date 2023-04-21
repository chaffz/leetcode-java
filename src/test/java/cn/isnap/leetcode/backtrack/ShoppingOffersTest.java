package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingOffersTest {
  ShoppingOffers shoppingOffers = new ShoppingOffers();

  @Test
  public void shoppingOffers() {
    // price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
    {
      List<Integer> price = Arrays.stream(ArrayInput.asArray("[2,5]")).boxed().collect(Collectors.toList());
      List<Integer> needs = Arrays.stream(ArrayInput.asArray("[3,2]")).boxed().collect(Collectors.toList());
      List<List<Integer>> special = ArrayInput.as2DList("[[3,0,5],[1,2,10]]");
//      int offers = shoppingOffers.shoppingOffers(price, special, needs);
//      Assert.assertEquals(offers, 14);
    }

    /*
    price =
    [2,2]
    special =
    [[1,1,1],[1,1,2],[1,1,3],[1,1,4],[1,1,5],[1,1,6],[1,1,7],[1,1,8],[1,1,9],[1,1,10],[1,1,11],[1,1,12],[1,1,13],[1,1,14],[1,1,15]]
    needs =
    [10,10]
     */
    {
      List<Integer> price = Arrays.stream(ArrayInput.asArray("[2,2]")).boxed().collect(Collectors.toList());
      List<Integer> needs = Arrays.stream(ArrayInput.asArray("[10,10]")).boxed().collect(Collectors.toList());
      List<List<Integer>> special = ArrayInput.as2DList("[[1,1,1],[1,1,2],[1,1,3],[1,1,4],[1,1,5],[1,1,6],[1,1,7],[1,1,8],[1,1,9],[1,1,10],[1,1,11],[1,1,12],[1,1,13],[1,1,14],[1,1,15]]");
      int offers = shoppingOffers.shoppingOffers(price, special, needs);
      Assert.assertEquals(offers, 14);
    }
  }
}