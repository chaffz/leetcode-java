package cn.isnap.leetcode.ProgrammingSkills.level1.day12;

public class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        if (nums.length == 0) return;

        this.sums = new int[nums.length];
        this.sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left < 0 || right > sums.length) return 0;
        if (left == 0) return sums[0];

        return sums[right] - sums[left - 1];
    }
}
