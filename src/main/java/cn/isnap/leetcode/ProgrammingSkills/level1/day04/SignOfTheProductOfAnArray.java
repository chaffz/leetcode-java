package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (num < 0) result *= -1;
            else if (num == 0) {
                result = 0;
                break;
            }
        }
        return result;
    }
}
