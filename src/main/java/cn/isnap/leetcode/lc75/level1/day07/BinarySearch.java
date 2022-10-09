package cn.isnap.leetcode.lc75.level1.day07;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int left, int right) {
        if (left > right) return -1;
        if (target == nums[left]) return left;
        if (target == nums[right]) return right;

        int mid = left + (right - left) / 2;
        if (target == nums[mid]) return mid;
        else if (target < nums[mid]) return search(nums, target, 0, mid - 1);
        else return search(nums, target, mid + 1, right);
    }
}
