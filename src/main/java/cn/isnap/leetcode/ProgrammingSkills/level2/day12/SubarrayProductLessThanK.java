package cn.isnap.leetcode.ProgrammingSkills.level2.day12;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1, left = 0, result = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (left <= right && product >= k) { // must check l <= i, must be >=
                product /= nums[left++];
            }
            result += right - left + 1;  // edge
        }
        return result;
    }
}
