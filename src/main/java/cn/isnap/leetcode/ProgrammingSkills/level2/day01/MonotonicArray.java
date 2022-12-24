package cn.isnap.leetcode.ProgrammingSkills.level2.day01;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for (int i = 1; i < nums.length; i++) {
            inc &= nums[i] >= nums[i - 1];
            dec &= nums[i] <= nums[i - 1];
            if (!inc && !dec) return false;
        }
        return true;
    }
}
