package cn.isnap.leetcode.lc75.level2.day13;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        min[0] = nums[0];
        int t = 0;

        for (int i = 1; i < nums.length; i++) {
            int mx = max[i - 1] * nums[i];
            int mn = min[i - 1] * nums[i];
            t = Math.max(mx, mn);
            max[i] = Math.max(t, nums[i]);

            t = Math.min(mx, mn);
            min[i] = Math.min(t, nums[i]);
        }

        int ret = Integer.MIN_VALUE;
        for (int mx : max) {
            if (ret < mx) {
                ret = mx;
            }
        }

        return ret;
    }
}
