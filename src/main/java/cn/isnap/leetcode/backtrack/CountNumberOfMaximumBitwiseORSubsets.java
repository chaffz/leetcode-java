package cn.isnap.leetcode.backtrack;

public class CountNumberOfMaximumBitwiseORSubsets {
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max |= num;
        }
        int[] count = new int[]{0};
        for (int i = 0; i < nums.length; i++) {
            countMaxOrSubsets(count, max, nums[i], i, nums);
        }
        return count[0];
    }

    private void countMaxOrSubsets(int[] count, int max, int cur, int index, int[] nums) {
        if (max == cur) count[0]++;
        if (index >= nums.length) return;
        for (int i = index + 1; i < nums.length; i++) {
            countMaxOrSubsets(count, max, cur | nums[i], i, nums);
        }
    }
}
