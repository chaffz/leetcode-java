package cn.isnap.leetcode.ProgrammingSkills.level1.day06;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        for (; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
        }

        for (; slow < nums.length; slow++) {
            nums[slow] = 0;
        }
    }
}
