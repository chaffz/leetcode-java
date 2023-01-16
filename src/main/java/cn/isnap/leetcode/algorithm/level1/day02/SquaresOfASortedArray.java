package cn.isnap.leetcode.algorithm.level1.day02;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] ret = new int[nums.length];
        int lo = 0, hi = nums.length - 1;
        for (int i = hi; i >= 0; i--) {
            if (Math.abs(nums[lo]) > Math.abs(nums[hi])) {
                ret[i] = nums[lo] * nums[lo];
                lo++;
            } else {
                ret[i] = nums[hi] * nums[hi];
                hi--;
            }
        }
        return ret;
    }
}
