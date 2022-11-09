package cn.isnap.leetcode.DataStructure.level1.day03;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }
        return profit;
    }
}
