package cn.isnap.leetcode.lc75.level1.day01;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
