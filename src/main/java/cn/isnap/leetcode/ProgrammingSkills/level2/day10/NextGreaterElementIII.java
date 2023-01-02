package cn.isnap.leetcode.ProgrammingSkills.level2.day10;

public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        char[] nums = ("" + n).toCharArray();
        int i = nums.length - 1;
        while (i > 0) {
            if (nums[i] > nums[i - 1]) break;
            i--;
        }
        if (i == 0) return -1;

        int x = nums[i - 1], smallest = i, j = i + 1;
        while (j < nums.length) {
            if (nums[j] > x && nums[j] <= nums[smallest]) {
                smallest = j;
            }
            j++;
        }
        char tmp = nums[i - 1];
        nums[i - 1] = nums[smallest];
        nums[smallest] = tmp;

        j = nums.length - 1;
        while (i < j) {
            tmp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = tmp;
        }

        int result = 0;
        i = 0;
        while (i < nums.length) {
            result *= 10;
            result += nums[i] - '0';
            i++;
        }

        return result > n ? result : -1;
    }
}
