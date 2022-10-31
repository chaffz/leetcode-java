package cn.isnap.leetcode.lc75.level2.day14;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0, mid, right;
        int closest = nums[0] + nums[1] + nums[2];
        while (left < nums.length) {
            int a0 = nums[left];
            mid = left + 1;
            right = nums.length - 1;
            while (mid < right) {
                int a1 = nums[mid], a2 = nums[right];
                int sum = a0 + a1 + a2;
                if (sum == target) return target;
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum > target) {
                    right--;
                } else {
                    mid++;
                }
            }

            while (left < nums.length && nums[left] == a0) {
                left++;
            }
        }

        return closest;
    }
}
