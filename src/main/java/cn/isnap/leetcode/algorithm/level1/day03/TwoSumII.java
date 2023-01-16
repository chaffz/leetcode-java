package cn.isnap.leetcode.algorithm.level1.day03;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length - 1;
        int sum;
        while (lo < hi) {
            sum = numbers[lo] + numbers[hi];
            if (target == sum) {
                return new int[]{lo + 1, hi + 1};
            } else if (target > sum) {
                lo++;
            } else {
                hi--;
            }
        }

        return null;
    }
}
