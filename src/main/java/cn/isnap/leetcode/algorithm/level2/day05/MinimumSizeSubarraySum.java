package cn.isnap.leetcode.algorithm.level2.day05;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE, sum = 0;
        int lo = 0, hi = 0;
        while (hi < nums.length) {
            sum += nums[hi];
            while (sum >= target) {
                answer = Math.min(answer, hi - lo);
                sum -= nums[lo];
                lo++;
            }
            hi++;
        }

        if (Integer.MAX_VALUE == answer) return 0;

        return answer + 1;
    }
}
