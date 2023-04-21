package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingOffers {
  Map<List<Integer>, Integer> memo = new HashMap<>();

  public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
    return helper(price, special, needs, 0);
  }

  public int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int total) {
    int with = withoutSpecial(price, needs);
    int without = 0;
    for (int i = 0; i < special.size(); i++) {
      List<Integer> offer = special.get(i);
      List<Integer> newNeeds = withSpecial(offer, needs);
      if (memo.containsKey(newNeeds)) {
        without = memo.get(newNeeds);
        continue;
      }
      if (newNeeds != null) {
        int specialPrice = offer.get(offer.size() - 1);
        without += specialPrice;
        int remain = helper(price, special, newNeeds, 0);
        without += remain;
        memo.put(newNeeds, without);
      }
    }
    return Math.min(with, without);
  }

  public List<Integer> withSpecial(List<Integer> offer, List<Integer> needs) {
    List<Integer> newNeeds = new ArrayList<>();
    for (int i = 0; i < needs.size(); i++) {
      int diff = needs.get(i) - offer.get(i);
      if (diff < 0) {
        return null;
      }
      newNeeds.add(diff);
    }
    return newNeeds;
  }

  public int withoutSpecial(List<Integer> price, List<Integer> needs) {
    int sum = 0;
    for (int i = 0; i < price.size(); i++) {
      sum += price.get(i) * needs.get(i);
    }
    return sum;
  }
}
